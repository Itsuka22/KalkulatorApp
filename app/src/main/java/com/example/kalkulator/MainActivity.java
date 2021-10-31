package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ang1, ang2, ang3 ,ang4,ang5, ang6, ang7 ,ang8;
    TextView hasilnya1,hasilnya2,hasilnya3,hasilnya4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ang1=(EditText) findViewById(R.id.angka1);
        ang2=(EditText) findViewById(R.id.angka2);
        ang3=(EditText) findViewById(R.id.angka3);
        ang4=(EditText) findViewById(R.id.angka4);
        ang5=(EditText) findViewById(R.id.angka5);
        ang6=(EditText) findViewById(R.id.angka6);
        ang7=(EditText) findViewById(R.id.angka7);
        ang8=(EditText) findViewById(R.id.angka8);
        hasilnya1=(TextView) findViewById(R.id.hasil1);
        hasilnya2=(TextView) findViewById(R.id.hasil2);
        hasilnya3=(TextView) findViewById(R.id.hasil3);
        hasilnya4=(TextView) findViewById(R.id.hasil4);
    }

    public void Penjumlahan(View view) {
        int a1=Integer.parseInt(ang1.getText().toString());
        int a2=Integer.parseInt(ang2.getText().toString());
        Integer hsl = a1+a2;
        hasilnya1.setText(hsl.toString());

    }

    public void Pengurangan(View view) {
        int a3=Integer.parseInt(ang3.getText().toString());
        int a4=Integer.parseInt(ang4.getText().toString());
        Integer hsl = a3-a4;
        hasilnya2.setText(hsl.toString());
    }

    public void Pembagian(View view) {
        int a5=Integer.parseInt(ang5.getText().toString());
        int a6=Integer.parseInt(ang6.getText().toString());
        Integer hsl = a5/a6;
        hasilnya3.setText(hsl.toString());
    }

    public void Perkalian(View view) {
        int a7=Integer.parseInt(ang7.getText().toString());
        int a8=Integer.parseInt(ang8.getText().toString());
        Integer hsl = a7*a8;
        hasilnya4.setText(hsl.toString());
    }
}