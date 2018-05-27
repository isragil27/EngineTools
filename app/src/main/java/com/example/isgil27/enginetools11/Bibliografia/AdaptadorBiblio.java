package com.example.isgil27.enginetools11.Bibliografia;

/**
 * Created by Israel on 26/05/2018.
 */
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.isgil27.enginetools11.R;

import java.util.ArrayList;

public class AdaptadorBiblio extends RecyclerView.Adapter<AdaptadorBiblio.LibroViewHolder> {

    private ArrayList<Libro> libros;

    public AdaptadorBiblio(ArrayList<Libro> libros) {
        this.libros = libros;
    }


    @Override
    public LibroViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);
        return new LibroViewHolder(v);
    }


    @Override
    public void onBindViewHolder(LibroViewHolder holder, int position) {
        final Libro libro = libros.get(position);
        holder.txtvnombreautor.setText(libro.getAutor());
        holder.txtvnombrelibro.setText(libro.getNombre());
        holder.imgLibro.setImageResource(libro.getFoto());
    }

    @Override
    public int getItemCount() {
        return libros.size();
    }

    public static class LibroViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgLibro;
        private TextView txtvnombrelibro;
        private TextView txtvnombreautor;


        public LibroViewHolder(View itemView) {
            super(itemView);

            imgLibro = itemView.findViewById(R.id.imgFoto);
            txtvnombrelibro = itemView.findViewById(R.id.txtvnombrealbum);
            txtvnombreautor = itemView.findViewById(R.id.txtvnombreartista);
        }


    }
}


