package com.example.isgil27.enginetools11.Herramientas;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TextView;

import com.example.isgil27.enginetools11.R;
import com.example.isgil27.enginetools11.Tabladinamica;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class EcuacionSolver extends AppCompatActivity {

    TextView titulo;
    Toolbar mitoolbar;
    EditText a;
    EditText b;
    EditText c;
    ListView valoresx;
    String [] valx = new String[2];
    double av,bv,cv;
    Tabladinamica tabla;
    DecimalFormat df = new DecimalFormat("#.0000");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecuacion_solve);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        mitoolbar=(Toolbar)findViewById(R.id.toolbarplantilla);
        setSupportActionBar(mitoolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        //Titulo

        String titulostring=getResources().getString(R.string.ecsolver);
        titulo=(TextView)findViewById(R.id.titulorecurso);
        titulo.setText(titulostring);

        //Edit text
        a=(EditText)findViewById(R.id.coefA);
        b=(EditText)findViewById(R.id.coefB);
        c=(EditText)findViewById(R.id.coefC);


        //Tabla

         tabla= new Tabladinamica(this, (TableLayout) findViewById(R.id.tabla));






    }

    public void onResolverecuacion(View v) {
        try {
            tabla.Limpiartabla();
            double residuo=0;
            av = Double.valueOf(a.getText().toString());
            bv = Double.valueOf(b.getText().toString());
            cv = Double.valueOf(c.getText().toString());

            if(((bv*bv)-(4*av*cv))<0)
            {
                double imaginario= Math.abs(Math.sqrt(Math.abs((bv*bv)-(4*av*cv)))/(2*av));
                valx[0]=String.valueOf(df.format(-bv/(2*av)) +" +"+df.format(imaginario)+"j");
                valx[1]=String.valueOf(df.format(-bv/(2*av)) +" -"+df.format(imaginario)+"j");
            }else {
                residuo=Math.sqrt((bv*bv)-(4*av*cv));
                valx[0]=String.valueOf(df.format((-bv+residuo)/2*av));
                valx[1]=String.valueOf(df.format((-bv-residuo)/2*av));

            }

            for(int i = 0; i < 2; i++)
            {
                ArrayList<String> elementos = new ArrayList<String>();
                elementos.add("X"+(i+1)+ " = ");

                elementos.add(valx[i]);
                tabla.agregarFilaTabla(elementos);

            }


        }
        catch (Exception error)
        {

        }
    }

    public void onClearcoef(View v)
    {
    a.setText("");
    b.setText("");
    c.setText("");

    }
}
