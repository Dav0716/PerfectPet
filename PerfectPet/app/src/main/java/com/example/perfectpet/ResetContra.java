package com.example.perfectpet;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ResetContra extends Activity {
    Button btn_reset_contra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_contra);

        btn_reset_contra=findViewById(R.id.btn_reset_contra);

        btn_reset_contra.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Toast.makeText(ResetContra.this, "Revisa la bandeja de entrada de tu correo", Toast.LENGTH_SHORT).show();
            }
        });
    }
}