package com.object0r.TorRange.examples.DbExample;

import com.object0r.TorRange.applications.db.DbProxyWorker;
import com.object0r.toortools.Utilities;

import java.util.HashMap;
import java.util.Map;


public class DbProxyWorkerExample extends DbProxyWorker
{
    public DbProxyWorkerExample(DbProxyWorkerManagerExample manager, int id)
    {
        super(manager, id);
    }

    @Override
    protected void process(HashMap<String, String> values)
    {

        for (Map.Entry<String, String> entry : values.entrySet())
        {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("HashMap: Key: " + key + " value: " + value);
        }
        try
        {
            System.out.println("My Ip is: "+readUrl("http://cpanel.com/showip.shtml"));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("-----");
    }

    protected void process(String entry)
    {
        System.out.println("Single: " + entry);
    }
}