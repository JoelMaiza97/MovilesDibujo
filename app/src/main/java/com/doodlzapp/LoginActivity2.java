package com.doodlzapp;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class LoginActivity2 extends AppCompatActivity {

    private EditText usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        usuario = findViewById(R.id.editTextUsuario2);
    }

    public void login2(View view){
        String u;
        u = usuario.getText().toString();
        if(u.equals("maiza")){
            Intent intent = new Intent(this, MainActivity.class);
            this.startActivity(intent);
        }
    }
}