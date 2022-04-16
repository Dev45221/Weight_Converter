package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tv1,tv2;
EditText et1,et2;
Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        bt1=findViewById(R.id.bt1);
        et2.setEnabled(false);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=et1.getText().toString();
                double kg=Double.parseDouble(s);

                double pound=2.205;
                kg=kg*pound;
                String p=String.valueOf(kg);
                et2.setText(p);
            }
        });
    }
}