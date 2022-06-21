package com.example.perfectpet;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RegistroUsuario extends Activity {
    Button btn_registrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);

        btn_registrar=findViewById(R.id.btn_registrar);

        btn_registrar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Toast.makeText(RegistroUsuario.this, "Registro de Usuario Exitoso", Toast.LENGTH_SHORT).show();
            }
        });
    }
}