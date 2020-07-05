package com.example.massconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText kg = (EditText) findViewById(R.id.weightInKgs);
        EditText pounds = (EditText) findViewById(R.id.weightInPounds);

        if(TextUtils.isEmpty(kg.getText())&&!TextUtils.isEmpty(pounds.getText())){
            //convert pounds to kg
            double p = Double.parseDouble(pounds.getText().toString());
            double k = p*0.453592;
            kg.setText(Double.toString(k));
            Toast.makeText(this, k+" Kgs", Toast.LENGTH_SHORT).show();
            return;
        }

        if(!TextUtils.isEmpty(kg.getText())&&TextUtils.isEmpty(pounds.getText())){
            //convert kg to pounds
            double k = Double.parseDouble(kg.getText().toString());
            double p = k*2.20462;
            pounds.setText(Double.toString(p));
            Toast.makeText(this, p+" Lbs", Toast.LENGTH_SHORT).show();
            return;
        }

        Toast.makeText(this, "Enter weight in Kgs or Lbs and leave the other empty", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}