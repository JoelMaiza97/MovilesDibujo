package com.doodlzapp;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    private EditText usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usuario = findViewById(R.id.editTextUsuario);
    }

    public void login2(View view){
        String u;
        u = usuario.getText().toString();

        if(u.equals("joel")){
            Intent intent = new Intent(this, LoginActivity2.class);
            this.startActivity(intent);
        }
    }
}