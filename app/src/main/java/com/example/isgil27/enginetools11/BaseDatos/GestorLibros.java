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



