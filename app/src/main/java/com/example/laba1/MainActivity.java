package com.example.laba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText myEmail = findViewById(R.id.editTextTextEmailAddress);
        EditText myPassword = findViewById(R.id.editTextTextPassword);

        myEmail.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                myEmail.setTextColor(Color.parseColor("#000000"));
                myPassword.setTextColor(Color.parseColor("#000000"));
            }
        });

        myEmail.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                myEmail.setTextColor(Color.parseColor("#000000"));
                myPassword.setTextColor(Color.parseColor("#000000"));
            }
        });
    }

    public void onMyButtonClick(View view) {
        EditText myEmail = findViewById(R.id.editTextTextEmailAddress);
        EditText myPassword = findViewById(R.id.editTextTextPassword);

        String[] email = getResources().getStringArray(R.array.email);
        String[] password = getResources().getStringArray(R.array.password);

        boolean flag = true;

        for (int i = 0; i < email.length; i++) {
            if (myEmail.getText().toString().equals(email[i])
                    && myPassword.getText().toString().equals(password[i])) {
                Intent intent = new Intent(this, MainActivity2.class);
                startActivity(intent);
                flag = false;
            }
        }


        if(flag) {
            myEmail.setTextColor(Color.parseColor("#FF0000"));
            myPassword.setTextColor(Color.parseColor("#FF0000"));

            Toast toast = Toast.makeText(this, "Неверный E-mail или пароль", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.BOTTOM, 0, 50);
            toast.show();
        }
    }
}