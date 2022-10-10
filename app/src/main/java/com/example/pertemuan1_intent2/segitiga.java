package com.example.pertemuan1_intent2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        final EditText alas =
                (EditText) findViewById(R.id.input_alas);
        final EditText tinggi =
                (EditText) findViewById(R.id.input_tinggi);
        final EditText luas =
                (EditText) findViewById(R.id.output_luas);
        final Button hitung =
                (Button) findViewById(R.id.btn_hitung);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double tinggi1, alas1, hasil1;
                tinggi1 = Double.parseDouble(alas.getText().toString());
                alas1 = Double.parseDouble(tinggi.getText().toString());
                hasil1 = 0.5 * alas1 * tinggi1;
                luas.setText(Double.toString(hasil1));
            }
        });
    }
}
