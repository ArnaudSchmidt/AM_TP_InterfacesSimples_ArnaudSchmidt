package com.example.schmi.tp_interfaces_simples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;

public class Interface3 extends AppCompatActivity {

    private final String Civilite = "civilite";
    private final String Nom = "nom";
    private final String Prenom = "prenom";
    private final String DDN = "ddn";
    private final String Email = "email";
    private final String Adresse = "adresse";
    private final String Infos = "infos";

    private TextView informations;
    private Button sports;
    private Button accueil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface3);

        //récupération des données de l'intent
        Intent intent = getIntent();
        String nom = intent.getStringExtra(Nom);
        String prenom = intent.getStringExtra(Prenom);
        String ddn = intent.getStringExtra(DDN);
        String email = intent.getStringExtra(Email);
        String adresse = intent.getStringExtra(Adresse);
        String infos = intent.getStringExtra(Infos);

        //création des objets associés aux objets physiques
        informations =(TextView)findViewById(R.id.Infos);
        sports =(Button)findViewById(R.id.Third_But);
        accueil =(Button)findViewById(R.id.Fourth_But);

        //replissage du textview
        informations.setText(nom + "\n" + prenom + "\n" + ddn + "\n" + email + "\n" + adresse + "\n" + infos);

        //pour accéder aux sports
        sports.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view){

                                           //message de contrôle
                                           Log.i("Test Interface 3","Clic sur le bouton sports");

                                           //création de l'intent
                                           Intent userIntent = new Intent(Interface3.this, Interface4.class);

                                           /*
                                           userIntent.putExtra(Nom, nom);
                                           userIntent.putExtra(Prenom, prenom);
                                           */

                                           //mène à l'activité suivante
                                           startActivity(userIntent);
                                       }
                                   }

        );

        //pour retourner à l'accueil
        accueil.setOnClickListener(new View.OnClickListener() {

                                       @Override
                                       public void onClick(View view){

                                           //message de contrôle
                                           Log.i("Test Interface 3","Clic sur le bouton accueil");

                                           Intent IntentClic = new Intent(Interface3.this, MainActivity.class);
                                           startActivity(IntentClic);
                                       }


                                   }

        );

    }
}
