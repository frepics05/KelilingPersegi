package com.hilmidevelop.example.kelilingpersegi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btnHitung;
    private EditText editTextsisi, editTexthasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initEvent();

        }
        private void initUI(){
        btnHitung = (Button) findViewById(R.id.btnHitung);
        editTextsisi = (EditText) findViewById(R.id.editTextsisi);
        editTexthasil = (EditText) findViewById(R.id.ediTexthasil);

        }
        private void initEvent(){
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungkeliling();
            }
        });
        }
        private void hitungkeliling(){
            int sisi = Integer.parseInt(editTextsisi.getText().toString());
            int keliling = 4*sisi;
            editTexthasil.setText("Keliling Persegi (4*sisi)"+keliling);
        }
    }

