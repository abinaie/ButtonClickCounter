package edu.cs477.fall2021.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int num1 = 0;
    int num2 = 0;
    TextView tView1;
    TextView tView2;

    Button clickhere;
    Button clickthere;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tView1 = (TextView) findViewById(R.id.output1);
        tView2 = (TextView) findViewById(R.id.output2);

        clickhere = (Button) findViewById(R.id.button1);
        clickthere = (Button) findViewById(R.id.button2);

        clickhere.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String display ="Counter 1: "+ Integer.toString(++num1);
                tView1.setText(display);
            }
        });

        clickthere.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String display = "Counter 2: " + Integer.toString(++num2);
                tView2.setText(display);
            }
        });

    }

}