package com.example.constrols2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtSoA, edtPhepTinh, edtSoB;
    private Button btnTinh;
    private TextView tvKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Anh xa
        edtSoA = (EditText) findViewById(R.id.editTextNumberSoA);
        edtPhepTinh = (EditText) findViewById(R.id.editTextNumberPhepTinh);
        edtSoB = (EditText) findViewById(R.id.editTextNumberSoB);
        btnTinh = (Button) findViewById(R.id.buttonTinh);
        tvKetQua = (TextView) findViewById(R.id.textViewKetQua);
        //
        btnTinh.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String soA = edtSoA.getText().toString();
        int numberOne = Integer.parseInt(soA);
        String soB = edtSoB.getText().toString();
        int numberTwo = Integer.parseInt(soB);
        int tong = numberOne + numberTwo;
        int hieu = numberOne - numberTwo;
        int tich = numberOne * numberTwo;
        double thuong = numberOne / numberTwo;
        switch (view.getId()) {
            case (R.id.buttonTinh):
                if (edtPhepTinh.getText().toString().equals("+"))
                    tvKetQua.setText(String.valueOf(tong));
                else if (edtPhepTinh.getText().toString().equals("-"))
                    tvKetQua.setText(String.valueOf(hieu));
                else if (edtPhepTinh.getText().toString().equals("*"))
                    tvKetQua.setText(String.valueOf(tich));
                else tvKetQua.setText(String.valueOf(thuong));
                break;
        }
    }
}