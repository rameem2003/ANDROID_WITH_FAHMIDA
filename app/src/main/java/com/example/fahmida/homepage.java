package com.example.fahmida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class homepage extends AppCompatActivity {
    Button btn, getName;
    TextInputEditText input;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        btn = findViewById(R.id.btn);
        input = findViewById(R.id.input);
        getName = findViewById(R.id.getName);
        text = findViewById(R.id.text);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(homepage.this,about.class);
                startActivity(a);
            }
        });

        getName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = input.getText().toString();
                text.setText(value);
            }
        });
    }
}