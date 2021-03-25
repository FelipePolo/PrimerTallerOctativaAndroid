package com.example.tallerunimaguno;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    Button matematicas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        matematicas = findViewById(R.id.btnmatematicas);
        matematicas.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_home,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()){
            case R.id.mnugeometria:
            //    Toast.makeText(getApplicationContext(), "MENU GEOMETRIA", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(),ActivityGeometria.class);
                startActivity(i);
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnmatematicas:
                Intent i = new Intent(getApplicationContext(),MatematicasActivity.class);
                startActivity(i);
        }
    }
}