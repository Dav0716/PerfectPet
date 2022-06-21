package com.example.perfectpet;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button btn_iniciar_sesion;
    TextView registrar, reset_contra;
    EditText email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email=findViewById(R.id.box_correo);
        password=findViewById(R.id.box_contrasena);
        btn_iniciar_sesion=findViewById(R.id.btn_iniciar_sesion);
        registrar=findViewById(R.id.registrar);
        reset_contra=findViewById(R.id.reset_contra);

        btn_iniciar_sesion.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                String correo = email.getText().toString();
                String contrasena = password.getText().toString();
                if(correo.equals("")){
                    Toast.makeText(MainActivity.this, "Ingrese un correo", Toast.LENGTH_SHORT).show();
                }
                else if(contrasena.equals("")){
                    Toast.makeText(MainActivity.this, "Ingrese una contraseña", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Inicio de Sesión Exitoso", Toast.LENGTH_SHORT).show();
                }
            }
        });

        registrar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, RegistroUsuario.class));
            }
        });

        reset_contra.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, ResetContra.class));
            }
        });
    }
}