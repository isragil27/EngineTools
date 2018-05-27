package com.example.isgil27.enginetools11.Herramientas;

import android.content.pm.ActivityInfo;
import android.nfc.FormatException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.isgil27.enginetools11.R;

public class Interpolacion extends AppCompatActivity  {

    TextView titulo;
    android.support.v7.widget.Toolbar mitoolbar;
    EditText x1;
    EditText x2;
    EditText y1;
    EditText y2;
    EditText xconocido;
    TextView ydeseado;
    double x1v,x2v,y1v,y2v,xco,yde;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interpolacion);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //Titulo

        String titulostring=getResources().getString(R.string.interpol);
        titulo=(TextView)findViewById(R.id.titulorecurso);
        titulo.setText(titulostring);
       //MEtodosComunes mismetodos = new MEtodosComunes(this, (Toolbar)findViewById(R.id.toolbarplantilla));
        //mismetodos.Supportactionbarr();
      mitoolbar=(Toolbar)findViewById(R.id.toolbarplantilla);
      setSupportActionBar(mitoolbar);
      getSupportActionBar().setDisplayHomeAsUpEnabled(true);
      getSupportActionBar().setDisplayShowTitleEnabled(false);

      //Edittext
        x1=(EditText)findViewById(R.id.x1);
        x2=(EditText)findViewById(R.id.x2);
        y1=(EditText)findViewById(R.id.y1);
        y2=(EditText)findViewById(R.id.y2);
        xconocido=(EditText)findViewById(R.id.xconocido);
        ydeseado=(TextView)findViewById(R.id.yinterpolado);



    }

    public void onInterpolar(View v) {
        try {
            x1v = Double.valueOf(x1.getText().toString());
            y1v = Double.valueOf(y1.getText().toString());
            x2v = Double.valueOf(x2.getText().toString());
            y2v = Double.valueOf(y2.getText().toString());
            xco = Double.valueOf(xconocido.getText().toString());

            yde = y1v + (((y2v - y1v) * (xco - x1v)) / (x2v - x1v));
            ydeseado.setText(String.valueOf(yde));
        }
        catch (Exception error)
        {

        }
    }

    public void onClear(View v)
    {
        ydeseado.setText("");
        xconocido.setText("");
        x1.setText("");
        x2.setText("");
        y1.setText("");
        y2.setText("");

    }



}
