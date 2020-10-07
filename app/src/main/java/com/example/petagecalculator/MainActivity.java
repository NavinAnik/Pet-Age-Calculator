package com.example.petagecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    int year= Calendar.getInstance().get(Calendar.YEAR);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void  buttonIS(View button)
    {
        EditText edName = findViewById(R.id.text);
        int petAge = year -Integer.parseInt(edName.getText().toString());
        TextView petAgeTxt = findViewById(R.id.textView);
        petAgeTxt.setText("Pet Age is "+petAge+" Years");


    }

}