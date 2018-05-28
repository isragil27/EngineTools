package com.example.isgil27.enginetools11.BaseDatos;
import android.content.ContentValues;
import android.content.Context;
import com.example.isgil27.enginetools11.Bibliografia.Libro;
import com.example.isgil27.enginetools11.R;

import java.util.ArrayList;

/**
 * Created by Israel on 27/05/2018.
 */

public class GestorLibros {

    private Context context;
    private  String [] datosalbum;

    public GestorLibros(Context context)
    {
        this.context = context;
    }

    public void IniciarBaseDatos()
    {
        MotorBasesDatos db = new MotorBasesDatos(context);
        Datos(db);
    }

    private void Datos(MotorBasesDatos db) {

        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ALBUM,"Modern Control Engineering ");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ARTISTA,"OGATA, K.");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_FOTO, R.drawable.book);
        db.InsertarAlbumes(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ALBUM,"Autmatic Control Systems ");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ARTISTA,"KUO, B.C");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_FOTO, R.drawable.book);
        db.InsertarAlbumes(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ALBUM,"https://controlautomaticoeducacion.com/");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ARTISTA,"Sergio Castaño");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_FOTO, R.drawable.youtube);
        db.InsertarAlbumes(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ALBUM,"Cálculo I");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ARTISTA,"LARSON, HOSTETLER y EDWARDS ");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_FOTO, R.drawable.book);
        db.InsertarAlbumes(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ALBUM,"Cálculo ");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ARTISTA,"STEWART, James");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_FOTO, R.drawable.book);
        db.InsertarAlbumes(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ALBUM,"Ecuaciones Diferenciales con aplicaciones ");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ARTISTA,"ZILL, Dennis G.");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_FOTO, R.drawable.book);
        db.InsertarAlbumes(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ALBUM,"Derivadas");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ARTISTA,"Julio Profe");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_FOTO, R.drawable.youtube);
        db.InsertarAlbumes(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ALBUM,"Integrales");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ARTISTA,"Julio Profe");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_FOTO, R.drawable.youtube);
        db.InsertarAlbumes(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ALBUM,"Termodinámica");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ARTISTA,"CENGEL, Yunus A. y BOLES, Michael A ");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_FOTO, R.drawable.book);
        db.InsertarAlbumes(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ALBUM,"Termodinámica");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ARTISTA,"WARK, Kenneth, RICHARDS, Donald");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_FOTO, R.drawable.book);
        db.InsertarAlbumes(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ALBUM,"Fundamentos de Termodinámica Técnica");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ARTISTA,"MORAN, Michael J. y SHAPIRO, Howard N. ");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_FOTO, R.drawable.book);
        db.InsertarAlbumes(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ALBUM,"Termodinámica II");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ARTISTA,"Canal");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_FOTO, R.drawable.youtube);
        db.InsertarAlbumes(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ALBUM,"Circuitos electrónicos : discretos e integrados");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ARTISTA,"Schilling D. ");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_FOTO, R.drawable.book);
        db.InsertarAlbumes(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ALBUM,"Amplificadores operacionales y circuitos integrados lineales ");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ARTISTA,"COUGHLIN, R., F., DRISCOLL, F., F. ");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_FOTO, R.drawable.book);
        db.InsertarAlbumes(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ALBUM,"Analog Integrated Circuits; Devices circuits, systems and aplications ");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ARTISTA,"CONNELLY, J.A");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_FOTO, R.drawable.book);
        db.InsertarAlbumes(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ALBUM,"Proyectos LED");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ARTISTA,"Canal");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_FOTO, R.drawable.youtube);
        db.InsertarAlbumes(contentValues);
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ALBUM,"Curso de electronica basica desde cero");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ARTISTA,"Editronikx");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_FOTO, R.drawable.youtube);
        db.InsertarAlbumes(contentValues);

    }


    public ArrayList<Libro> CargarAlbum()
    {
        MotorBasesDatos db = new MotorBasesDatos(context);
        return db.ExtraerALbumDataBase();
    }
    public ArrayList<Libro> AsignarAlbum()
    {
        MotorBasesDatos db = new MotorBasesDatos(context);
        InsetarDosALbumes(db);
        return db.ExtraerALbumDataBase();
    }

    public int ObtenerTamaño()
    {
        int tamaño;
        MotorBasesDatos db = new MotorBasesDatos(context);
        tamaño= db.ExtraerALbumDataBase().size();
        return tamaño;
    }
    /*

    public   void InsertarUnAlbum ()
    {
        MotorBaseDatos db = new MotorBaseDatos(context);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstanteBaseDatos.TABLE_ALBUM_NOMBRE_ALBUM,datosalbum[0]);
        contentValues.put(ConstanteBaseDatos.TABLE_ALBUM_NOMBRE_ARTISTA,datosalbum[1]);
        contentValues.put(ConstanteBaseDatos.TABLE_ALBUM_NOMBRE_FOTO,Integer.valueOf(datosalbum[2]));
        db.InsertarAlbumes(contentValues);

    }*/

    private void InsetarDosALbumes(MotorBasesDatos db) {

        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ALBUM,"The Suburbs");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ARTISTA,"Arcade Fire");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_FOTO, R.drawable.control1);
        db.InsertarAlbumes(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ALBUM,"Neon Bible");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ARTISTA,"Arcade Fire");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_FOTO, R.drawable.electronica1);
        db.InsertarAlbumes(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ALBUM,"Modern Man");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ARTISTA,"Arcade Fire");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_FOTO, R.drawable.fisica1);
        db.InsertarAlbumes(contentValues);
    }
}



