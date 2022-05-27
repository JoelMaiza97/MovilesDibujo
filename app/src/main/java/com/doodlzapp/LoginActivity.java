package com.doodlzapp;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    private EditText usuario, usuario2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usuario = findViewById(R.id.editTextUsuario);
        usuario2 = findViewById(R.id.editTextUsuario);

    }

    public void login2(View view){
        String u, u2;
        u = usuario.getText().toString();
        u2 = usuario2.getText().toString();
        if(u.equals("joel") || u2.equals("maiza")){
            Intent intent = new Intent(this, MainActivity.class);
            this.startActivity(intent);
        }
    }
}