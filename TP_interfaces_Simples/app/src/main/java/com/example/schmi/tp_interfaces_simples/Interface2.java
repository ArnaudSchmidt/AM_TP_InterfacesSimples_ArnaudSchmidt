package com.example.schmi.tp_interfaces_simples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Button;
import android.content.Intent;

public class Interface2 extends AppCompatActivity {

    private final String Civilite = "civilite";
    private final String Nom = "nom";
    private final String Prenom = "prenom";
    private final String DDN = "ddn";
    private final String Email = "email";
    private final String Adresse = "adresse";
    private final String Infos = "infos";

    private RadioGroup civilite;
    private EditText nom;
    private EditText prenom;
    private EditText ddn;
    private EditText email;
    private EditText adresse;
    private EditText infos;
    private Button valider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface2);

        //création des objets associés aux objets physiques
        civilite =(RadioGroup) findViewById(R.id.radio);
        nom =(EditText)findViewById(R.id.Firstname);
        prenom =(EditText)findViewById(R.id.Surname);
        ddn =(EditText)findViewById(R.id.Birthday);
        email =(EditText)findViewById(R.id.Email);
        adresse =(EditText)findViewById(R.id.Adresse);
        infos =(EditText)findViewById(R.id.Comments);
        valider =(Button)findViewById((R.id.Second_But));

        valider.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view){

                                           //message de contrôle
                                           Log.i("Test Interface 2","Clic sur le bouton valider");

                                           //création de l'intent
                                           Intent userIntent = new Intent(Interface2.this, Interface3.class);

                                           //ne marche pas, une question à laquelle trouver une réponse plus tard
                                           //userIntent.putExtra(Civilite, civilite.getCheckedRadioButtonId().getText());
                                           userIntent.putExtra(Nom, nom.getText().toString());
                                           userIntent.putExtra(Prenom, prenom.getText().toString());
                                           userIntent.putExtra(DDN, ddn.getText().toString());
                                           userIntent.putExtra(Email, email.getText().toString());
                                           userIntent.putExtra(Adresse, adresse.getText().toString());
                                           userIntent.putExtra(Infos, infos.getText().toString());

                                           //mène à l'activité suivante
                                           startActivity(userIntent);
                                       }
                                   }

        );
    }
}
