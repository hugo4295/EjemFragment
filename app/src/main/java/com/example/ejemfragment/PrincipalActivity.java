package com.example.ejemfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrincipalActivity extends AppCompatActivity {

    Button btnfuno, btnfdos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnfuno = findViewById(R.id.btnfuno);
        btnfdos = findViewById(R.id.btnfdos);

        Fragment funo = new PrimerFragment();
        Fragment fdos = new SegundoFragment();



        btnfuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction f1 = getSupportFragmentManager().beginTransaction();
                f1.replace(R.id.contenedorfragment,funo).commit();
            }
        });

        btnfdos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction f2 = getSupportFragmentManager().beginTransaction();
                f2.replace(R.id.contenedorfragment,fdos).commit();
            }
        });


    }
}