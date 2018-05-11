package com.example.isgil27.enginetools11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Convertidor extends AppCompatActivity  {

    Spinner spnmedidas;
    TextView titulo;
    android.support.v7.widget.Toolbar mitoolbar;
    ListView lstmedidasmostradas;
    String [] arraymedidas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertidor);

        mitoolbar=(Toolbar)findViewById(R.id.toolbarplantilla);
        setSupportActionBar(mitoolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        //Titulo

        String titulostring=getResources().getString(R.string.convertidor);
        titulo=(TextView)findViewById(R.id.titulorecurso);
        titulo.setText(titulostring);

        //Spinner
        spnmedidas=(Spinner)findViewById(R.id.spnmedidas);
        ArrayAdapter<CharSequence> AdapterMedidad= ArrayAdapter.createFromResource(this,R.array.arraymedidas,android.R.layout.simple_spinner_item);
        spnmedidas.setAdapter(AdapterMedidad);
        spnmedidas.setOnItemSelectedListener(ItemSelected());

        //Medidasmostradas
        lstmedidasmostradas =(ListView)findViewById(R.id.lstunidades);
        arraymedidas=getResources().getStringArray(R.array.arraylongitud);
        //medidasmostradas.setOnItemClickListener(ItemListener());
        ArrayAdapter<String> AdapterBiblio= new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,arraymedidas);
        lstmedidasmostradas.setAdapter(AdapterBiblio);








    }

    protected AdapterView.OnItemSelectedListener ItemSelected()
    {
        return new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(this,"Selecc"+ ItemSelected().toString(),Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Selecc "+ adapterView.getItemAtPosition(i).toString(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        };

    }
}
