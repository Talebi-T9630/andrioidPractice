package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Console;

public class MainActivity extends AppCompatActivity {
    TextView txtview;
    EditText edittxt;
    Button button;
    String nameInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       txtview=(TextView) findViewById(R.id.txtview);
       edittxt=(EditText) findViewById(R.id.edittxt);

        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                nameInput= edittxt.getText().toString();
                Log.d("button",nameInput);
                txtview.setText(nameInput);
            }
        });
    }
}