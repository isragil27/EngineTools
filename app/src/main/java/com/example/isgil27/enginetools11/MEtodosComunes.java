package com.example.isgil27.enginetools11;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.CpuUsageInfo;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Israel on 14/05/2018.
 */

public class MEtodosComunes extends  AppCompatActivity{

    private Context context;


    public MEtodosComunes(Context context)
    {
       this.context=context;
    }

    public void Supportactionbarr()
    {
        Toolbar toolbar;

        toolbar=(Toolbar)findViewById(R.id.toolbarplantilla);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }



}
