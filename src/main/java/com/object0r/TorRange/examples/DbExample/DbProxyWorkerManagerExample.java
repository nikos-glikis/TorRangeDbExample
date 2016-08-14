package com.object0r.TorRange.examples.DbExample;

import com.object0r.TorRange.applications.db.DbProxyWorker;
import com.object0r.TorRange.applications.db.DbProxyWorkerManager;

public class DbProxyWorkerManagerExample extends DbProxyWorkerManager
{

    public DbProxyWorkerManagerExample(String iniFilename, Class<? extends DbProxyWorker> workerClass)
    {
        super(iniFilename, workerClass, DbProxyWorkerManagerExample.class);
    }

    @Override
    public void prepareForExit()
    {

    }

    @Override
    public void readOptions(String filename)
    {

    }
}
