package com.example.isgil27.enginetools11;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.net.Uri;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * //{@link //HerramientasFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link //HerramientasFragment#newInstance} factory method to
 * create an instance of this fragment.
 */





public class HerramientasFragment extends Fragment {

    ImageButton imgbtnconvertidor;
    ImageButton imgbtninterpolar;
    ImageButton imgbtnecuacion;
    Button button;
    View vistaherra;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        vistaherra=inflater.inflate(R.layout.fragment_herramientas, container, false);
        imgbtnconvertidor=(ImageButton)vistaherra.findViewById(R.id.imgbtnconvertidor);
        imgbtnconvertidor.setOnClickListener(onClickAceptar);

        imgbtninterpolar=(ImageButton)vistaherra.findViewById(R.id.imgbtninterpolar);
        imgbtninterpolar.setOnClickListener(OnclickInterpolar);

        // Inflate the layout for this fragment
        return vistaherra;
    }

    public View.OnClickListener onClickAceptar = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intentconvert= new Intent( getContext(),Convertidor.class);
            startActivity(intentconvert);
        }
    };




    public View.OnClickListener OnclickInterpolar = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intentinterpolar= new Intent( getContext(),Interpolacion.class);
            startActivity(intentinterpolar);
        }
    };





}


