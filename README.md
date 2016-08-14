TorRange Database Consuming example
===================================

This is an example repository that demonstrates TorRange Database Consuming capabilities.

TorRange is a library that can create multiple threads and consume large input of any size efficiently. 

A Tor Instance is tied to each thread if needed and the thread can control the connection (Restart circuit/change ip etc).

The process can be stopped and resumed at any point. 

More information here: [https://github.com/nikos-glikis/TorRange](https://github.com/nikos-glikis/TorRange)

Notes
-----

- Database information are filled in database.ini
- To turn off tor change the useTor=true to useTor=false
