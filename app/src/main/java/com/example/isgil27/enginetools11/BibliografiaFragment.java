package com.example.isgil27.enginetools11;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.IOException;


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



        return vistabiblio;
    }

    protected AdapterView.OnItemClickListener ItemListener()
    {
        return new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

               switch (i)
               {
                   case 0:
                       Intent intentElectr= new Intent( getContext(),ElectronicaRecursos.class);
                       startActivity(intentElectr);
                       break;
                   case 1:
                       Toast.makeText(getContext(),"Caso2",Toast.LENGTH_LONG).show();
                      break;
                   case 2:
                       Toast.makeText(getContext(),"Caso3",Toast.LENGTH_LONG).show();
                       break;
                   case  3:
                       Toast.makeText(getContext(),"Caso4",Toast.LENGTH_LONG).show();
                       break;

               }


            }
        };


    }

}
