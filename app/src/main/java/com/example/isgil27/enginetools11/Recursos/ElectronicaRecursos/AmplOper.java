package com.example.isgil27.enginetools11.Recursos.ElectronicaRecursos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.isgil27.enginetools11.R;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import com.github.barteksc.pdfviewer.PDFView;

public class AmplOper extends AppCompatActivity {
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


        elect=getResources().getStringArray(R.array.arrayelectr);
        titulo=(TextView)findViewById(R.id.titulorecurso);
        titulo.setText(elect[2]);

        pdfview=(PDFView)findViewById(R.id.pdfview);
        pdfview.fromAsset("AmpOp.pdf").load();

    }
}
