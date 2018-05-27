package com.example.isgil27.enginetools11.Recursos.TermoRecursos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.isgil27.enginetools11.R;
import com.example.isgil27.enginetools11.Recursos.CalculoRecursos.Derivadas;
import com.example.isgil27.enginetools11.Recursos.CalculoRecursos.Fourier;
import com.example.isgil27.enginetools11.Recursos.CalculoRecursos.Integrales;
import com.example.isgil27.enginetools11.Recursos.CalculoRecursos.Laplace;

public class TermoRecursos extends AppCompatActivity {
    ListView lstelectr;
    String [] arrayelectr;
    android.support.v7.widget.Toolbar mitoolbar;
    TextView titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plantillalistasrecursos);

        mitoolbar=(Toolbar)findViewById(R.id.toolbarplantilla);
        setSupportActionBar(mitoolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        String titulostring=getResources().getString(R.string.termo);
        titulo=(TextView)findViewById(R.id.titulorecurso);
        titulo.setText(titulostring);


        lstelectr =(ListView)findViewById(R.id.lstelectr);
        arrayelectr=getResources().getStringArray(R.array.arraytermo);
        lstelectr.setOnItemClickListener(ItemListener());
        ArrayAdapter<String> AdapterElect= new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,arrayelectr);
        lstelectr.setAdapter(AdapterElect);


    }
    protected AdapterView.OnItemClickListener ItemListener()
    {
        return new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i)
                {
                    case 0:
                        Intent intentElectr= new Intent(getApplicationContext(),TablaAgua.class);
                        startActivity(intentElectr);
                        break;
                    case 1:
                        Intent intentcapacitor=new Intent(getApplicationContext(),TablaRef.class);
                        startActivity(intentcapacitor);
                        break;
                    case 2:
                        Intent intentampop=new Intent(getApplicationContext(),CartaPsi.class);
                        startActivity(intentampop);
                        break;
                    case 3:
                        Intent intentampo=new Intent(getApplicationContext(),GasIdeal.class);
                        startActivity(intentampo);
                        break;

                }
            }
        };



    }
}
