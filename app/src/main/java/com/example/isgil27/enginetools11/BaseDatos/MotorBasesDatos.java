package com.example.isgil27.enginetools11.BaseDatos;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.isgil27.enginetools11.Bibliografia.Libro;

import java.util.ArrayList;

/**
 * Created by Israel on 27/05/2018.
 */

public class MotorBasesDatos extends SQLiteOpenHelper {
    private Context context;
    public MotorBasesDatos(Context context) {
        super(context,ConstantesBaseDatos.DATABASE_NAME , null,ConstantesBaseDatos.DATABASE_VERSION);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String queryCrearTableAlbum= "CREATE TABLE " + ConstantesBaseDatos.TABLE_ALBUMS_NAME + "(" +
                ConstantesBaseDatos.TABLE_ALBUM_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ALBUM + " TEXT, " +
                ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_ARTISTA + " TEXT, " +
                ConstantesBaseDatos.TABLE_ALBUM_NOMBRE_FOTO + " INTEGER" + ")";


        db.execSQL(queryCrearTableAlbum);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL( "DROP TABLE IF " + " EXISTS " + ConstantesBaseDatos.TABLE_ALBUMS_NAME);
        onCreate(db);

    }

    public ArrayList<Libro> ExtraerALbumDataBase()
    {
        ArrayList<Libro> albums = new ArrayList<>();

        String query = "SELECT * FROM " + ConstantesBaseDatos.TABLE_ALBUMS_NAME;
        SQLiteDatabase db = this.getWritableDatabase();

        Cursor registros =db.rawQuery(query,null);

        while (registros.moveToNext())
        {
            Libro albumactual = new Libro(registros.getString(1),registros.getString(2),registros.getInt(3));
            albums.add(albumactual);
        }
        db.close();
        return albums;
    }

    public void InsertarAlbumes(ContentValues contentvalues)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(ConstantesBaseDatos.TABLE_ALBUMS_NAME,null,contentvalues);
        db.close();
    }
}
