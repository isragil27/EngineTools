package com.example.isgil27.enginetools11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class Interpolacion extends AppCompatActivity {

    TextView titulo;
    android.support.v7.widget.Toolbar mitoolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interpolacion);

        mitoolbar=(Toolbar)findViewById(R.id.toolbarplantilla);
        setSupportActionBar(mitoolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);






        //Titulo

        String titulostring=getResources().getString(R.string.interpol);
        titulo=(TextView)findViewById(R.id.titulorecurso);
        titulo.setText(titulostring);

    }
}
