package com.example.isgil27.enginetools11.Bibliografia;

/**
 * Created by Israel on 26/05/2018.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.example.isgil27.enginetools11.BaseDatos.GestorLibros;
import com.example.isgil27.enginetools11.R;
import java.util.ArrayList;

public class CalculoBiblio extends AppCompatActivity{
    ArrayList<Libro> libros = new ArrayList<Libro>();
    ArrayList<Libro> todoslibros=new ArrayList<Libro>();
    private RecyclerView listaLibros;
    ArrayList<Libro> links = new ArrayList<Libro>();
    private RecyclerView listaInternet;

    @Override
    protected void   onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plantillabibliografia);

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
        for(int i=0; i<2;i++)
        {
            links.add(todoslibros.get(i+1));
        }
    }

}
