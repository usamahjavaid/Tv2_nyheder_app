package com.example.tv2_nyheder_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.tv2_nyheder_app.businessLogic.Nyhedsindslag;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nyhedsindslag nyhed1 = new Nyhedsindslag();


        nyhed1.setOverskrift(" Min kæreste er mig utro");
        nyhed1.setTeasertekst(" Min kæreste er utro med min bedste ven, fordi at han...");
        nyhed1.setUrlVideo(" YourUrlvideo.dk");
        nyhed1.setUrlStilbillede(" billede.png");
        nyhed1.setUdgivelsesdato(new Date());
        nyhed1.setUdgivet(true);

        Log.d("Debug", "nyhed1" + nyhed1.getOverskrift() + "\n" + nyhed1.getTeasertekst() + "\n" + nyhed1.getUdgivelsesdato() + "\n" + nyhed1.isUdgivet());

        Nyhedsindslag nyhed2 = new Nyhedsindslag(" Årets kok Anders", "Anders vinder igen", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.krak.dk%2Fanders%2Bhjordrup%2Blarsen%2Bsk%25C3%25A6lsk%25C3%25B8r%2F159390898%2Fperson&psig=AOvVaw1CIOZ6kL3UgRl3XIvQp0-x&ust=1617872699712000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCNC_9s7j6-8CFQAAAAAdAAAAABAD");

        Log.d("Debug", " nyhed2 " + nyhed2.getOverskrift() + "\n" + nyhed2.getTeasertekst() + "\n" + nyhed2.getUrlStilbillede());
    }






}


