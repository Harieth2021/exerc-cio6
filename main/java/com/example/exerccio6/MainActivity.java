package com.example.exerccio6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText peso_pessoa;
    TextView v1, v2;
    Button ver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        peso_pessoa=findViewById(R.id.peso_pesoa);
        v1=findViewById(R.id.txt1);
        v2=findViewById(R.id.txt2);
        ver=findViewById(R.id.button);

        ver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double peso=Double.parseDouble(peso_pessoa.getText().toString());

                double novo_peso=peso+(peso*15/100);
                v1.setText(" Se engordar 15% pesarás "+ novo_peso);

                double novo_emagrecer=peso-(peso*20/100);
                v2.setText("Se emagrecer 20% pesarás"+ novo_emagrecer);


            }
        });
    }
}