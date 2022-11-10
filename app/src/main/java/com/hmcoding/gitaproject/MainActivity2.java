package com.hmcoding.gitaproject;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    EditText lstdon;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lstdon=findViewById(R.id.lastid);
        btn = findViewById(R.id.savebttn);

    }

    public void lstdonation(View view) {
    }


    public void sv(View view) {
        Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show();

    }
}