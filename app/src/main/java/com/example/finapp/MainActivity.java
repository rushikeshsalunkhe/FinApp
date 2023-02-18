package com.example.finapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText previousshare, enterquantity1, currentshare, newquantity;
    TextView result;
    Button button1, button2;
    int tot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        previousshare = findViewById(R.id.previousshare);
        enterquantity1 = findViewById(R.id.enterquantity1);
        currentshare = findViewById(R.id.currentshare);
        newquantity = findViewById(R.id.newquantity);
        result = findViewById(R.id.textView);
        button1 =  findViewById(R.id.button1);
        button2 =  findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //calculate multiplication
                int prevVal = Integer.parseInt(previousshare.getText().toString());
                int enterVal = Integer.parseInt(enterquantity1.getText().toString());
                int curVal = Integer.parseInt(currentshare.getText().toString());
                int newVal = Integer.parseInt(newquantity.getText().toString());
                tot = (prevVal*enterVal)+(curVal*newVal);
                result.setText("Result: "+tot);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //calculate product
                int prevVal = Integer.parseInt(previousshare.getText().toString());
                int enterVal = Integer.parseInt(enterquantity1.getText().toString());
                int newVal = Integer.parseInt(newquantity.getText().toString());
                int total = prevVal*enterVal*newVal;
                //divide by enterquantity1 + newquantity
                int div = total/(enterVal + newVal);
                result.setText("Result: "+div);
            }
        });
    }
}