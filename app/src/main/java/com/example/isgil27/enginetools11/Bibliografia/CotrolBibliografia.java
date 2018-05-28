package com.example.isgil27.enginetools11.Bibliografia;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.example.isgil27.enginetools11.BaseDatos.GestorLibros;
import com.example.isgil27.enginetools11.R;
import java.util.ArrayList;


/**
 * Created by Israel on 26/05/2018.
 */

public class CotrolBibliografia extends AppCompatActivity {
    ArrayList<Libro> libros = new ArrayList<Libro>();
    ArrayList<Libro> todoslibros=new ArrayList<Libro>();
    private RecyclerView listaLibros;
    ArrayList<Libro> links = new ArrayList<Libro>();
    private RecyclerView listaInternet;
    TextView titulo;
    android.support.v7.widget.Toolbar mitoolbar;

    @Override
    protected void   onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plantillabibliografia);

        mitoolbar = (Toolbar) findViewById(R.id.toolbarplantilla);
        setSupportActionBar(mitoolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        String titulostring = getResources().getString(R.string.controlbiblio);
        titulo = (TextView) findViewById(R.id.titulorecurso);
        titulo.setText(titulostring);

        listaLibros=findViewById(R.id.rcvlistalibros);
        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaLibros.setLayoutManager(llm);

        listaInternet=findViewById(R.id.rcvlistainternet);
        LinearLayoutManager lli = new LinearLayoutManager(getApplicationContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaInternet.setLayoutManager(lli);


        if(libros.size()==0)
        {
            Cargarlistaalbums();

        }


        InicializarAdaptador();


    }

    private void InicializarAdaptador() {
        AdaptadorBiblio miadaptador= new AdaptadorBiblio(libros);
        listaLibros.setAdapter(miadaptador);
        AdaptadorBiblio miadaptador2= new AdaptadorBiblio(links);
        listaInternet.setAdapter(miadaptador2);

    }


    private void Cargarlistaalbums()
    {
        GestorLibros gestorAlbums = new GestorLibros(this.getApplicationContext());
        todoslibros = gestorAlbums.CargarAlbum();
        for(int i=0; i<2;i++)
        {
            libros.add(todoslibros.get(i));
        }
        for(int i=2; i<3;i++)
        {
            links.add(todoslibros.get(i));
        }
    }
}
