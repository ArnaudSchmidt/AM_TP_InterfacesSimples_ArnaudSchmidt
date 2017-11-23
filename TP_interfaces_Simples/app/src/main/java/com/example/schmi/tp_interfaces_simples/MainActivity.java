package com.example.schmi.tp_interfaces_simples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    //éléments de la vue
    private Button starting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //création des objets associés aux objets physiques
        starting =(Button)findViewById(R.id.First_But);

        //actions lors du clic sur le bouton Start
        starting.setOnClickListener(new View.OnClickListener() {

                                      @Override
                                      public void onClick(View view){

                                          //message de contrôle
                                          Log.i("Test Interface 1","Clic sur le bouton start");

                                          //création de l'intent
                                          Intent IntentClic = new Intent(MainActivity.this, Interface2.class);
                                          //mène à l'activité suivante
                                          startActivity(IntentClic);
                                      }


                                  }

        );

    }
}
