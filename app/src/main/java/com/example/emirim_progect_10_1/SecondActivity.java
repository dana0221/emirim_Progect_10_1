package com.example.emirim_progect_10_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btnCloes = findViewById(R.id.btn_close);
        btnCloes.setOnClickListener(btnCloesListener);
    }

    View.OnClickListener btnCloesListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };
}