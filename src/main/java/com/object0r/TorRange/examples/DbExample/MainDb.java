package com.object0r.TorRange.examples.DbExample;


public class MainDb
{

    public static void main(String[] args)
    {
        if (args.length == 0)
        {
            System.out.println("No session ini in arguments.");
            System.out.println("Usage: ");
            System.out.println("java -jar target/TorRangeDbExample-1.0-SNAPSHOT-jar-with-dependencies.jar parameters.ini");

            System.exit(0);
        }

        try
        {
            DbProxyWorkerManagerExample dbRangeSimpleExampleManager = new DbProxyWorkerManagerExample(args[0], DbProxyWorkerExample.class);
            dbRangeSimpleExampleManager.startWorkers();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
