package com.codepath.apps.restclienttemplate;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.codepath.apps.restclienttemplate.models.SampleModel;
import com.codepath.apps.restclienttemplate.models.SampleModelDao;

@Database(entities={SampleModel.class}, version=1)
public abstract class MyDatabase extends RoomDatabase {
    // Database name to be used
    public static final String NAME = "MyDataBase";

    public abstract SampleModelDao sampleModelDao();
}
