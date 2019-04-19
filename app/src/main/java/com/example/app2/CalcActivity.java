package com.example.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalcActivity extends AppCompatActivity {
    EditText num1, num2;
    TextView Resul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        Resul = findViewById(R.id.Resul);

    }

    public double num1() {
        double num = Double.parseDouble(num1.getText().toString());
        return num;
    }

    public double num2() {
        double num = Double.parseDouble(num2.getText().toString());
        return num;
    }

    public boolean validarValores() {
        if (num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public void suma(View view) {
        if (validarValores()) {
            Toast.makeText(this, "ok", Toast.LENGTH_SHORT).show();
            int vale = (int)(num1() + num2());
            Resul.setText(String.valueOf(vale));
        } else {
            Toast.makeText(this, "No", Toast.LENGTH_SHORT).show();

        }
    }

    public void resta(View view) {
        if (validarValores()) {
            Toast.makeText(this, "ok", Toast.LENGTH_SHORT).show();
            double vale1 = num1() - num2();
            Resul.setText(String.valueOf(vale1));
        } else {
            Toast.makeText(this, "No", Toast.LENGTH_SHORT).show();

        }
    }

    public void Mult(View view) {
        if (validarValores()) {
            Toast.makeText(this, "ok", Toast.LENGTH_SHORT).show();
            double vale2 = num1() * num2();
            Resul.setText(String.valueOf(vale2));
        } else {
            Toast.makeText(this, "No", Toast.LENGTH_SHORT).show();

        }
    }


    public void Div(View view) {
        if (validarValores()) {
            Toast.makeText(this, "ok", Toast.LENGTH_SHORT).show();
            double vale2=num1()/num2();
            Resul.setText(String.valueOf(vale2));
        } else {
            Toast.makeText(this, "No", Toast.LENGTH_SHORT).show();

        }
    }
}