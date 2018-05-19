package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declare button EditText and TextView
        Button button =(Button) findViewById(R.id.button1);
        final EditText edit = (EditText) findViewById(R.id.editText1);
        final TextView text = (TextView) findViewById(R.id.textView1);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String name = edit.getText().toString();
                text.setText(name);
            }

        });
        }
    }

