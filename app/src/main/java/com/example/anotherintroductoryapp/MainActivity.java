package com.example.anotherintroductoryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);

    }
    public void onclkbutton(View view)
    {
        TextView textView2=findViewById(R.id.textView2);
        textView2.setText("hello dear, "+name.getText().toString());
    }
}
