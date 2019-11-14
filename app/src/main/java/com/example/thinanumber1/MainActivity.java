package com.example.thinanumber1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.graphics.Color;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button minusz,plusz,kuldes;
    private TextView kozepenlatom;
    Random r = new Random();
    int min = 1;
    int max = 10;
    int gepgondoltszam =0;
    int embergondoltszam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        gepgondoltszam = r.nextInt(min-max);

        kuldes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // String szovegestipp = kozepenlatom.getText().toString();
                // int tipp = Integer.parseInt(szovegestipp);
                if (embergondoltszam == gepgondoltszam)
                {
                    kozepenlatom.setText("kitalaltad");

                }
                else
                {
                    kozepenlatom.setText("ratyi vagy");
                }

            }
        });


        minusz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (embergondoltszam > 10)
                {
                    embergondoltszam--;
                }
                if (embergondoltszam == 10)
                {
                    String text = "ez a minimum nyomikam";
                }
                kozepenlatom.setText(String.valueOf(embergondoltszam));
            }
        });

        plusz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (embergondoltszam < 10)
                {
                    embergondoltszam++;
                }
                if (embergondoltszam == 10)
                {
                    String text = "ez a max nyomikam";
                }
                kozepenlatom.setText(String.valueOf(embergondoltszam));
            }
        });




    }
    public void init()
    {
        minusz=findViewById(R.id.minusz);
        plusz=findViewById(R.id.plusz);
        kuldes=findViewById(R.id.kuldes);
        kozepenlatom=findViewById(R.id.kozepenlatom);

    }



}
