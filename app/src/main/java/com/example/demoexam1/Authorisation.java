package com.example.demoexam1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Authorisation extends AppCompatActivity {
    EditText pass1, email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authorisation);
    }

    public void enter(View view) {
        pass1 = findViewById(R.id.editTextTextPassword);
        email = findViewById(R.id.editTextTextEmailAddress);
        String str1 = pass1.getText().toString();
        String s = email.getText().toString();
        if(s.indexOf("@") > 0 && s.matches("[a-z]*@*[a-z,.]*") && s.indexOf(".")>2 && !str1.isEmpty()){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }
        else if(str1.isEmpty()) {
            Toast.makeText(this, "Введите пароль!", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Неверный синтаксис почты!", Toast.LENGTH_SHORT).show();
        }
    }
    public void regas(View view) {
        Intent intent = new Intent(Authorisation.this, Registration.class);
        startActivity(intent);
    }
}