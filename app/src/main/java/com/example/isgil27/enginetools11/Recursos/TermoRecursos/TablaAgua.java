package com.example.isgil27.enginetools11.Recursos.TermoRecursos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import com.example.isgil27.enginetools11.R;
import com.github.barteksc.pdfviewer.PDFView;


public class TablaAgua extends AppCompatActivity {
    android.support.v7.widget.Toolbar mitoolbar;
    TextView titulo;
    PDFView pdfview;
    String[] elect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdfviewer);

        mitoolbar=(Toolbar)findViewById(R.id.toolbarplantilla);
        setSupportActionBar(mitoolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        elect=getResources().getStringArray(R.array.arraytermo);
        titulo=(TextView)findViewById(R.id.titulorecurso);
        titulo.setText(elect[0]);

        pdfview=(PDFView)findViewById(R.id.pdfview);
        pdfview.fromAsset("tabsagua.pdf").load();

    }
}