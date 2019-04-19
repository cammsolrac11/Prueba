package com.example.app2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText javaUser, javaContr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        javaUser = findViewById(R.id.edUser);
        javaContr = findViewById(R.id.edContr);

    }

    public String UserName() {
        String name = javaUser.getText().toString();
        return name;
    }

    public String UserContr() {
        String Contra = javaContr.getText().toString();
        return Contra;
    }

    public void Login(View view) {
        if (UserName().equals("log@gmail.com") && UserContr().equals("123")) {
            Intent i = new Intent(this,CalcActivity.class);
            startActivity(i);
            Toast.makeText(this, "OK", Toast.LENGTH_SHORT).show();


        }else {
            Toast.makeText(this, "NO", Toast.LENGTH_SHORT).show();
        }
    }

}

