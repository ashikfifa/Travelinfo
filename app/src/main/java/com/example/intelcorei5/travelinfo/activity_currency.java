package com.example.intelcorei5.travelinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class activity_currency extends AppCompatActivity {

    EditText input, output1,output2,output3,output4,output5,output6 ;
    Button button;
    CheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        input = (EditText)findViewById(R.id.input1);
        button = (Button)findViewById(R.id.button);
        output1 = (EditText)findViewById(R.id.output1);
        output2 = (EditText)findViewById(R.id.output2);
        output3 = (EditText)findViewById(R.id.output3);
        output4 = (EditText)findViewById(R.id.output4);
        checkBox1 = (CheckBox)findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox)findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox)findViewById(R.id.checkBox4);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox1.isChecked()){
                    double value = new Double(input.getText().toString());
                    value = value*0.012;
                    output1.setText(new Double(value).toString());

                }

                else
                    output1.setText("");

                if(checkBox2.isChecked()){
                    double value = new Double(input.getText().toString());
                    value = value*0.010;
                    output2.setText(new Double(value).toString());

                }

                else
                    output2.setText("");

                if(checkBox3.isChecked()){
                    double value = new Double(input.getText().toString());
                    value = value*0.87;
                    output3.setText(new Double(value).toString());

                }

                else
                    output3.setText("");

                if(checkBox4.isChecked()){
                    double value = new Double(input.getText().toString());
                    value = value*0.0045;
                    output4.setText(new Double(value).toString());

                }

                else
                    output4.setText("");

            }
        });


    }
}
