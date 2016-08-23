TorRange Database Consuming example
===================================

This is an example repository that demonstrates TorRange Database Consuming capabilities.

TorRange is a library that can create multiple threads and consume large input of any size efficiently. 

A Tor Instance is tied to each thread if needed and the thread can control the connection (Restart circuit/change ip etc).

The process can be stopped and resumed at any point. 

More information here: [https://github.com/nikos-glikis/TorRange](https://github.com/nikos-glikis/TorRange)

Notes for Database Consumer
---------------------------

- Database information are filled in database.ini
- Database entries are fetched from a remote/local databased based on the 
  primary key, and send one by one to the workers. Entries are fetched in batches, to optimize the performance and when one batch is processed it is not processed again.
- The user can at any point stop and resume the process.
- There are 2 methods called for Database Consumer on workers. 
    - process(String entry) - Easier to handle - contains the first column asked (dbValueColumn in ini file). 
    - HashMap<String, String> values. - Contains a hashmap of the columns asked with the values. {"id": 1, "name": "John", "surname": "McAfee"}
- There are comments explaining the parameters.

General Notes:
--------------
- The program is ready to edit and apply your logic.
- Session: 
    - Session is saved in the sessions/ directory. This saves the process so that you can stop and resume the process whenever you need.
    - To reset the session run the reset.sh script, or remove the session directory.
    - Session name is derived from the ini running. You can run lots of sessions at the same time, as long as you have multiple inis with the settings.
    - If one session is already running, and you rerun it, the process will stop.
- Your application logic:
    - Keep in mind that on each instance there are 1 WorkerManagers and multiple Workers.
    - Your logic for the workers must begin in the void TorRange.process() (in this example) TorRangeSimpleWorkerExample.process() method.
    - For each entry in the input the TorWorker.process() method is called.
    - All global logic like saving results etc should reside in the WorkerManager classes, usually synchronized.
- Parameters are filled in simple.ini
    - There are comments on all param samples.
    - Most Important: 
        - To turn off tor change the useTor=true to useTor=false
        - Number of workers is the "threads" parameter.
        - "saveEvery=10" saves the state every 10 entries.
- Tor Connections
    - There is a TOR connection available in each thread (thread=Worker - all classes derived from TorWorker) if needed.
    - changeIp() restarts the circuit and usually changes ip.
- Compile and start scripts are included. To run this you only need maven (mvn) installed