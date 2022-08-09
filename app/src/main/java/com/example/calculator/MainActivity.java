package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText process, hasil;
    Button buttonTambah, buttonKurang, buttonKali, buttonBagi, buttonSamaDengan,
            buttonSembilan, buttonDelapan, buttonTujuh, buttonEnam, buttonLima, buttonEmpat, buttonTiga, buttonDua, buttonSatu, buttonNol;
    int nilaikeSatu, nilaiKeDua;

    //buat nyimpan tanda
    boolean tambahadditional, kurangadditional, kaliadditional, bagiadditional;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSembilan = (Button) findViewById(R.id.sembilan);
        buttonDelapan = (Button) findViewById(R.id.delapan);
        buttonTujuh = (Button) findViewById(R.id.tujuh);
        buttonEnam = (Button) findViewById(R.id.enam);
        buttonLima = (Button) findViewById (R.id.lima);
        buttonEmpat = (Button) findViewById(R.id.empat);
        buttonTiga = (Button) findViewById(R.id.tiga);
        buttonDua = (Button) findViewById(R.id.dua);
        buttonSatu = (Button) findViewById(R.id.satu);
        buttonNol = (Button) findViewById(R.id.enol);
        buttonTambah = (Button) findViewById(R.id.tambah);
        buttonKurang = (Button) findViewById(R.id.kurang);
        buttonKali = (Button) findViewById(R.id.kali);
        buttonBagi = (Button) findViewById(R.id.bagi);
        buttonSamaDengan = (Button) findViewById(R.id.samadengan);
        hasil = (EditText) findViewById(R.id.hasil);

        // sembilan
        buttonSembilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText(hasil.getText() + "9");
            }
        });

        // delapan
        buttonDelapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText(hasil.getText() + "8");
            }
        });

        // tujuh
        buttonTujuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText(hasil.getText() + "7");
            }
        });

        // enam
        buttonEnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText(hasil.getText() + "6");
            }
        });

        // lima
        buttonLima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText(hasil.getText() + "5");
            }
        });

        // empat
        buttonEmpat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText(hasil.getText() + "4");
            }
        });

        // tiga
        buttonTiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText(hasil.getText() + "3");
            }
        });

        // dua
        buttonDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText(hasil.getText() + "2");
            }
        });

        // satu
        buttonSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText(hasil.getText() + "1");
            }
        });

        // nol
        buttonNol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText(hasil.getText() + "0");
            }
        });


        // tambah
        buttonTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (hasil == null) {
                    hasil.setText("");
                } else {
                    nilaikeSatu= Integer.parseInt(hasil.getText() + "");
                    tambahadditional = true;
                    hasil.setText(null);
                }
            }
        });

        // Kurang
        buttonKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (hasil == null) {
                    hasil.setText("");
                } else {
                    nilaikeSatu= Integer.parseInt(hasil.getText() + "");
                    kurangadditional = true;
                    hasil.setText(null);
                }
            }
        });

        // kali
        buttonKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (hasil == null) {
                    hasil.setText("");
                } else {
                    nilaikeSatu= Integer.parseInt(hasil.getText() + "");
                    kaliadditional = true;
                    hasil.setText(null);
                }
            }
        });

        // bagi
        buttonBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (hasil == null) {
                    hasil.setText("");
                } else {
                    nilaikeSatu= Integer.parseInt(hasil.getText() + "");
                    bagiadditional = true;
                    hasil.setText(null);
                }
            }
        });


        // sama dengan

        buttonSamaDengan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                nilaiKeDua = Integer.parseInt(hasil.getText() + "");
                // tambah
                if (tambahadditional == true) {
                    hasil.setText(nilaikeSatu + nilaiKeDua + "");
                    tambahadditional = false;
                }

                // kurang
                if (kurangadditional == true) {
                    hasil.setText(nilaikeSatu - nilaiKeDua + "");
                    kurangadditional = false;
                }

                // kali
                if (kaliadditional == true) {
                    hasil.setText(nilaikeSatu * nilaiKeDua + "");
                    kaliadditional = false;
                }

                // kali
                if (bagiadditional == true) {
                    hasil.setText(nilaikeSatu / nilaiKeDua + "");
                    bagiadditional = false;
                }

            }
        });

    }
}