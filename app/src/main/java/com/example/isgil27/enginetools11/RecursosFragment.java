package com.example.isgil27.enginetools11;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * //{@link //HerramientasFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link //HerramientasFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RecursosFragment extends Fragment {

    View vista;

    ImageButton imgbtncontrol;
    ImageButton imgbtntermo;
    ImageButton imgbtnelectronica;
    ImageButton imgbtncalculo;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista =inflater.inflate(R.layout.fragment_recursos, container, false);

        //relacionando image buttons
        imgbtncalculo=(ImageButton)vista.findViewById(R.id.imgbtncalculo);
        imgbtncontrol=(ImageButton)vista.findViewById(R.id.imgbtncontrol);
        imgbtnelectronica=(ImageButton)vista.findViewById(R.id.imgbtnelectronica);
        imgbtntermo=(ImageButton)vista.findViewById(R.id.imgbtntermo);

        imgbtntermo.setOnClickListener(onClickterm);
        imgbtnelectronica.setOnClickListener(onClickelec);
        imgbtncontrol.setOnClickListener(onClickcont);
        imgbtncalculo.setOnClickListener(onClickcal);


        return vista;
    }

    //Metodos para los imagebuttons

    protected View.OnClickListener onClickelec = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intentElectr= new Intent( getContext(),ElectronicaRecursos.class);
            startActivity(intentElectr);
            //Toast.makeText(getContext(),"Botones recursos",Toast.LENGTH_LONG).show();

        }
    };

    protected View.OnClickListener onClickcal = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intentCalc= new Intent( getContext(),CalculoRecursos.class);
            startActivity(intentCalc);
            //Toast.makeText(getContext(),"Botones recursos",Toast.LENGTH_LONG).show();

        }
    };

    protected View.OnClickListener onClickterm = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intentTerm= new Intent( getContext(),TermoRecursos.class);
            startActivity(intentTerm);
            //Toast.makeText(getContext(),"Botones recursos",Toast.LENGTH_LONG).show();

        }
    };

    protected View.OnClickListener onClickcont = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intentCont= new Intent( getContext(),ControlRecursos.class);
            startActivity(intentCont);
            //Toast.makeText(getContext(),"Botones recursos",Toast.LENGTH_LONG).show();

        }
    };
}
