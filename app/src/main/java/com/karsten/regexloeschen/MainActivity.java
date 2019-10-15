package com.karsten.regexloeschen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String pur = "Per 1/4 10\" pizza";

        if (pur.contains("/")) {

            //region ** Nummer


        //  ..[^\(Per 0-9\/0-9]





            String pur0 = pur.replaceAll("Per ", "");
            String purNummerString = pur0.replaceAll("[0-9]+\"", "");
            String purNummerFertigString = purNummerString.replaceAll("[A-za-z]", "");
            String[] separateNummer = purNummerFertigString.split("/");
            float nummer1 = Float.parseFloat(separateNummer[0]);
            float nummer2 = Float.parseFloat(separateNummer[1]);
            float floatFertig = nummer1 / nummer2;
            //endregion ** Nummer

            //region ** Einheiten
            String purText = pur0.replaceAll("[0-9/\"0-9]", "");
            //endregion ** Einheiten

            Toast.makeText(this, "floatFertig " + floatFertig, Toast.LENGTH_LONG).show();
            Toast.makeText(this, "Einheit " + purText, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "kein slash", Toast.LENGTH_LONG).show();
        }
        //   String pur = "Per 2/4 10\" piece";
        //   Toast.makeText(this, "pur - " + pur, Toast.LENGTH_SHORT).show();

        //   if (pur.contains( "/")){
        //       Toast.makeText(this, "fffffff", Toast.LENGTH_SHORT).show();

        //       String pur0 = pur.replaceAll("Per ", "");

        //       String purNummerString = pur0.replaceAll("[0-9]+\"", "");
        //       Toast.makeText(this, "purNummerString " + purNummerString, Toast.LENGTH_LONG).show();

        //       String purNummerFertigString = purNummerString.replaceAll("[A-za-z]", "");
        //       Toast.makeText(this, "purNummerFertigString " + purNummerFertigString, Toast.LENGTH_LONG).show();

        //       String purText = pur0.replaceAll("[0-9/\"0-9]", "");
        //       Toast.makeText(this, "pur1 -  " + purText, Toast.LENGTH_LONG).show();

        //       String separateNummer[] = purNummerFertigString.split("/");
        //       float nummer1 = Float.parseFloat(separateNummer[0]);
        //       float nummer2 = Float.parseFloat(separateNummer[1]);
        //       Toast.makeText(this, "nummer1 " + nummer1, Toast.LENGTH_LONG).show();
        //       Toast.makeText(this, "nummer2 " + nummer2, Toast.LENGTH_LONG).show();

        //       float floatFertig = nummer1 / nummer2;
        //       Toast.makeText(this, "floatFertig " + floatFertig, Toast.LENGTH_LONG).show();
        //   } else {
        //       Toast.makeText(this, "kein slash", Toast.LENGTH_LONG).show();
        //   }
    }
}
