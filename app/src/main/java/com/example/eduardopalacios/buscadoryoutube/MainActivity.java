package com.example.eduardopalacios.buscadoryoutube;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText buscar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buscar=findViewById(R.id.ETBuscar);


    }


    public void onClickButton(View view)
    {
        if (view.getId()==R.id.botonBuscar)
        {

        }
    }

}
