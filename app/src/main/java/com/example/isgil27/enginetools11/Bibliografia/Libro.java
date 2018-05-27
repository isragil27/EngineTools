package com.example.isgil27.enginetools11.Bibliografia;

/**
 * Created by Israel on 26/05/2018.
 */

public class Libro {
    public Libro(String nombre, String autor, int foto) {
        this.nombre = nombre;
        this.autor = autor;
        this.foto = foto;
    }

    String nombre;

    String autor;
    int foto;





    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String artista) {
        this.autor = artista;
    }



    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

}
