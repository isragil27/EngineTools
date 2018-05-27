package com.example.isgil27.enginetools11.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.isgil27.enginetools11.BaseDatos.GestorLibros;
import com.example.isgil27.enginetools11.Bibliografia.CalculoBiblio;
import com.example.isgil27.enginetools11.Bibliografia.CotrolBibliografia;
import com.example.isgil27.enginetools11.Bibliografia.ElectroBiblio;
import com.example.isgil27.enginetools11.Bibliografia.Libro;
import com.example.isgil27.enginetools11.Bibliografia.TermoBiblio;
import com.example.isgil27.enginetools11.Recursos.ElectronicaRecursos.ElectronicaRecursos;
import com.example.isgil27.enginetools11.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * //{@link //HerramientasFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link //HerramientasFragment#newInstance} factory method to
 * create an instance of this fragment.
 */


public class BibliografiaFragment extends Fragment {

    View vistabiblio;
    ListView lstbiblio;
    String [] arraybiblio;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vistabiblio=inflater.inflate(R.layout.fragment_bibliografia, container, false);

        lstbiblio =(ListView)vistabiblio.findViewById(R.id.lstbiblio);
        arraybiblio=vistabiblio.getResources().getStringArray(R.array.bibliografia);
        lstbiblio.setOnItemClickListener(ItemListener());
        ArrayAdapter<String> AdapterBiblio= new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,arraybiblio);
        lstbiblio.setAdapter(AdapterBiblio);

        GestorLibros gestorAlbums = new GestorLibros(this.getActivity());
        if(gestorAlbums.ObtenerTamaño()==0)
        {
            InicializarListaLibros();

        }
        return vistabiblio;
    }
    private void InicializarListaLibros() {
        GestorLibros gestorAlbums = new GestorLibros(this.getActivity());
         gestorAlbums.IniciarBaseDatos();
    }

    protected AdapterView.OnItemClickListener ItemListener()
    {
        return new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

               switch (i)
               {
                   case 0:
                       Intent intentElectr= new Intent( getContext(),CotrolBibliografia.class);
                       startActivity(intentElectr);
                       break;
                   case 1:
                       Intent intentElectr1= new Intent( getContext(),CalculoBiblio.class);
                       startActivity(intentElectr1);
                      break;
                   case 2:
                       Intent intentElectr2= new Intent( getContext(),TermoBiblio.class);
                       startActivity(intentElectr2);
                       break;
                   case  3:
                       Intent intentElectr3= new Intent( getContext(), ElectroBiblio.class);
                       startActivity(intentElectr3);
                       break;

               }


            }
        };


    }

}
