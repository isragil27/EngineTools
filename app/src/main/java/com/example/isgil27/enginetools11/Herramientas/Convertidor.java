package com.example.isgil27.enginetools11.Herramientas;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.isgil27.enginetools11.FactoresConv;
import com.example.isgil27.enginetools11.R;

public class Convertidor extends AppCompatActivity {

    Spinner spnmedidas;
    TextView titulo;
    android.support.v7.widget.Toolbar mitoolbar;
    ListView lstmedidasmostradas;
    ListView lstvaloresconvertidas;
    String[] arraymedidasconvertidas;
    Spinner spnunidades;
    Context contextin;
    EditText valor;
    Double valoredt;
    ArrayAdapter<String> AdapterLongitud;
    FactoresConv misfactores = new FactoresConv();
    int tamañoarreglo;

    //Arreglos factores de conversion
    double[] arrayfactores;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertidor);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        mitoolbar = (Toolbar) findViewById(R.id.toolbarplantilla);
        setSupportActionBar(mitoolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);



        //Titulo

        String titulostring = getResources().getString(R.string.convertidor);
        titulo = (TextView) findViewById(R.id.titulorecurso);
        titulo.setText(titulostring);

        //Valor edittext

        valor = (EditText) findViewById(R.id.edtvalor);
        valor.setText("1");


        contextin = this;
        //Spinner
        spnmedidas = (Spinner) findViewById(R.id.spnmedidas);
        ArrayAdapter<CharSequence> AdapterMedidad = new ArrayAdapter(this, android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.arraymedidas));
        spnmedidas.setAdapter(AdapterMedidad);
        spnunidades = (Spinner) findViewById(R.id.spnunidades);
        spnmedidas.setOnItemSelectedListener(ItemSelected());

        //Medidasmostradas
        lstmedidasmostradas = (ListView) findViewById(R.id.lstunidades);
        lstvaloresconvertidas = (ListView) findViewById(R.id.lstvaloresconvertidos);


        //medidasmostradas.setOnItemClickListener(ItemListener());

    }

    protected AdapterView.OnItemSelectedListener ItemSelected() {
        return new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                ArrayAdapter<CharSequence> AdapterUnidad;
                ArrayAdapter<String> AdapterBiblio;

                switch (i) {
                    case 0:
                        AdapterUnidad = new ArrayAdapter(contextin, android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.arraylongitud));
                        spnunidades.setAdapter(AdapterUnidad);
                        AdapterBiblio = new ArrayAdapter<String>(contextin, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.arraylongitud));
                        lstmedidasmostradas.setAdapter(AdapterBiblio);
                        spnunidades.setOnItemSelectedListener(ItemSelectedLongitud());
                        break;
                    case 1:
                        AdapterUnidad = new ArrayAdapter(contextin, android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.arraypeso));
                        spnunidades.setAdapter(AdapterUnidad);
                        AdapterBiblio = new ArrayAdapter<String>(contextin, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.arraypeso));
                        lstmedidasmostradas.setAdapter(AdapterBiblio);
                        spnunidades.setOnItemSelectedListener(ItemSelectedPeso());
                        break;
                    case 2:
                        AdapterUnidad = new ArrayAdapter(contextin, android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.arrayapotencia));
                        spnunidades.setAdapter(AdapterUnidad);
                        AdapterBiblio = new ArrayAdapter<String>(contextin, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.arrayapotencia));
                        lstmedidasmostradas.setAdapter(AdapterBiblio);
                        spnunidades.setOnItemSelectedListener(ItemSelectedPotencia());
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        };

    }


    protected AdapterView.OnItemSelectedListener ItemSelectedLongitud() {
        return new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, final int i, long l) {
                arraymedidasconvertidas = new String[(getResources().getStringArray(R.array.arraylongitud)).length];
                 tamañoarreglo = (getResources().getStringArray(R.array.arraylongitud)).length;
                switch (i) {
                    case 0:
                        MetodosFactoresInicio(tamañoarreglo, 0, i);
                        Textwathc( tamañoarreglo);
                        break;
                    case 1:
                            MetodosFactoresInicio(tamañoarreglo, 0, i);
                             Textwathc( tamañoarreglo);
                        break;
                    case 2:
                        MetodosFactoresInicio(tamañoarreglo, 0, i);
                        Textwathc( tamañoarreglo);
                        break;
                    case 3:
                        MetodosFactoresInicio(tamañoarreglo, 0, i);
                        Textwathc( tamañoarreglo);
                        break;
                    case 4:
                        MetodosFactoresInicio(tamañoarreglo, 0, i);
                        Textwathc( tamañoarreglo);
                        break;
                    case 5:
                        MetodosFactoresInicio(tamañoarreglo, 0, i);
                        Textwathc( tamañoarreglo);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        };

    }



    protected AdapterView.OnItemSelectedListener ItemSelectedPeso() {


        return new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                arraymedidasconvertidas = new String[(getResources().getStringArray(R.array.arraypeso)).length];
                tamañoarreglo = (getResources().getStringArray(R.array.arraypeso)).length;

                switch (i) {
                    case 0:
                        MetodosFactoresInicio(tamañoarreglo, 1, i);
                        Textwathc( tamañoarreglo);
                        break;
                    case 1:
                        MetodosFactoresInicio(tamañoarreglo, 1, i);
                        Textwathc( tamañoarreglo);
                        break;
                    case 2:
                        MetodosFactoresInicio(tamañoarreglo, 1, i);
                        Textwathc( tamañoarreglo);
                        break;
                    case 3:
                        MetodosFactoresInicio(tamañoarreglo, 1, i);
                        Textwathc( tamañoarreglo);
                        break;
                    case 4:
                        MetodosFactoresInicio(tamañoarreglo, 1, i);
                        Textwathc( tamañoarreglo);
                        break;
                    case 5:
                        MetodosFactoresInicio(tamañoarreglo, 1, i);
                        Textwathc( tamañoarreglo);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        };

    }

    protected AdapterView.OnItemSelectedListener ItemSelectedPotencia() {


        return new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                arraymedidasconvertidas = new String[(getResources().getStringArray(R.array.arrayapotencia)).length];
                tamañoarreglo = (getResources().getStringArray(R.array.arrayapotencia)).length;

                switch (i) {
                    case 0:
                        MetodosFactoresInicio(tamañoarreglo, 2, i);
                        Textwathc( tamañoarreglo);
                        break;
                    case 1:
                        MetodosFactoresInicio(tamañoarreglo, 2, i);
                        Textwathc( tamañoarreglo);
                        break;
                    case 2:
                        MetodosFactoresInicio(tamañoarreglo, 2, i);
                        Textwathc( tamañoarreglo);
                        break;
                    case 3:
                        MetodosFactoresInicio(tamañoarreglo, 2, i);
                        Textwathc( tamañoarreglo);
                        break;
                    case 4:
                        MetodosFactoresInicio(tamañoarreglo, 2, i);
                        Textwathc( tamañoarreglo);
                        break;
                    case 5:
                        MetodosFactoresInicio(tamañoarreglo, 2, i);
                        Textwathc( tamañoarreglo);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        };

    }

    public void MetodosFactoresInicio(int tamañoarreglo, int tipomedida, int unidad) {

            if(valor.length()==0)
            {
                valoredt=0.0;
                arrayfactores = misfactores.FactoresConv(tipomedida, unidad);
                for (int k = 0; k < tamañoarreglo; k++) {
                    arraymedidasconvertidas[k] = String.valueOf(valoredt * arrayfactores[k]);
                }
            }else {
                valoredt = Double.parseDouble(valor.getText().toString());
                arrayfactores = misfactores.FactoresConv(tipomedida, unidad);
                for (int k = 0; k < tamañoarreglo; k++) {
                    arraymedidasconvertidas[k] = String.valueOf(valoredt * arrayfactores[k]);
                }

            }
        AdapterLongitud = new ArrayAdapter<String>(contextin, android.R.layout.simple_list_item_1, arraymedidasconvertidas);
        lstvaloresconvertidas.setAdapter(AdapterLongitud);
    }

    public void MetodosFactoresigualcero(int tamañoarreglo)
    {
        for (int j = 0; j < tamañoarreglo; j++) {
            arraymedidasconvertidas[j] = "";
        }
    }
    public void MetodosFactoresdiferentecero(int tamañoarreglo)
    {
        valoredt = Double.parseDouble(valor.getText().toString());
        for (int j = 0; j < tamañoarreglo; j++) {
            arraymedidasconvertidas[j] = String.valueOf(valoredt * arrayfactores[j]);
        }
    }

    public void MEtodosFactoresFInal()
    {
        ArrayAdapter<String> AdapterLongitud = new ArrayAdapter<String>(contextin, android.R.layout.simple_list_item_1, arraymedidasconvertidas);
        lstvaloresconvertidas.setAdapter(AdapterLongitud);

    }

    public void Textwathc(final int tamañoarreglo)
    {
        valor.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {


                if (s.length() == 0) {
                    MetodosFactoresigualcero(tamañoarreglo);

                } else {
                    MetodosFactoresdiferentecero(tamañoarreglo);

                }
                MEtodosFactoresFInal();
            }
        });
    }


}


