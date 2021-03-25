package com.example.tallerunimaguno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MatematicasActivity extends AppCompatActivity implements View.OnClickListener {

    EditText n1, n2;
    RadioGroup operacion;
    RadioButton suma, multi, potencia;
    Button calcular, borrar;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas);
        n1 = findViewById(R.id.edtn1);
        n2 = findViewById(R.id.edtn2);
        operacion = findViewById(R.id.rgoperacion);
        calcular = findViewById(R.id.btncalcular);
        borrar = findViewById(R.id.btnborrar);
        calcular.setOnClickListener(this);
        borrar.setOnClickListener(this);

        }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btncalcular:
                if(validar()){
                   try{
                    float num1 = Float.parseFloat(n1.getText().toString());
                    float num2 = Float.parseFloat(n2.getText().toString());
                    int id = operacion.getCheckedRadioButtonId();
                    switch (id){
                        case R.id.rbtsuma:
                            Toast.makeText(getApplicationContext(),"La suma es " + (num1+num2), Toast.LENGTH_LONG).show();
                            break;
                        case R.id.rbtmulti:
                            Toast.makeText(getApplicationContext(),"La suma es " + (num1*num2), Toast.LENGTH_LONG).show();
                            break;
                        case R.id.rbtpotencia:
                            Toast.makeText(getApplicationContext(),"La suma es " + Math.pow(num1,num2), Toast.LENGTH_LONG).show();
                            break;
                    }
                   }  catch (Exception ex){
                       Toast.makeText(getApplicationContext(),"Error en los datos", Toast.LENGTH_LONG).show();
                   }
               }
                else{
                    Toast.makeText(getApplicationContext(),"Error en los datos", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnborrar: borrar();
                break;
        }
    }



    public void borrar(){
            n1.setText("");
            n2.setText("");
    }

    public boolean validar(){
            if (TextUtils.isEmpty(n1.getText().toString()) ){
                return false;
            }
            else {
                if (TextUtils.isEmpty(n2.getText().toString()) ){
                    return false;
                }
                else
                    return true;
            }
    }

}