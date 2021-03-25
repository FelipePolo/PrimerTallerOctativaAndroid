package com.example.tallerunimaguno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

 EditText usuario, clave;
 Button ingresar, cancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = findViewById(R.id.edtusuario);
        clave = findViewById(R.id.edtclave);
        ingresar = findViewById(R.id.btningresar);
        cancelar = findViewById(R.id.btncancelar);
        ingresar.setOnClickListener(this);
        cancelar.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return true;
    }



    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btningresar :
                   if(usuario.getText().toString().equalsIgnoreCase("admin") &&
                   clave.getText().toString().equalsIgnoreCase("12345")){
                       Intent i = new Intent(getApplicationContext(),HomeActivity.class);
                       startActivity(i);
                   }
                   else{
                       Toast.makeText(getApplicationContext(), "Error credenciales", Toast.LENGTH_LONG).show();
                   }
                   break;
            case R.id.btncancelar: usuario.setText(""); clave.setText("");
            break;
        }
    }
}