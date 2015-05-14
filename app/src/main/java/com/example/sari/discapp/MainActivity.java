/*Tugas Kelompok PJW: Kalkulator Diskon
Anggota:
        1. Wahyu Mahardhika(39016)
        2. Miranti Dwi H (39025)
        3. Shinta Dewi Amalia(39444)
        4. Dwi Retno Puspita Sari(39956)
        5. Rayuni (39905)*/

package com.example.sari.discapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.BreakIterator;


public class MainActivity extends Activity implements View.OnClickListener{

    EditText editTextprice;

    TextView TextOutput;

    RadioButton diskon_1, diskon_2, diskon_3, diskon_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextprice = (EditText) findViewById(R.id.editText);

        TextOutput = (TextView) findViewById(R.id.txt_output);



        diskon_1= (RadioButton) findViewById(R.id.rad45);
        diskon_2= (RadioButton) findViewById(R.id.rad55);
        diskon_3= (RadioButton) findViewById(R.id.rad65);
        diskon_4= (RadioButton) findViewById(R.id.rad75);
        diskon_1.setOnClickListener(this);
        diskon_2.setOnClickListener(this);
        diskon_3.setOnClickListener(this);
        diskon_4.setOnClickListener(this);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.rad45:
                String harga1= editTextprice.getText().toString();
                String diskon1= diskon_1.getText().toString();

                double hasil1= Double.parseDouble(harga1)- ((Double.parseDouble(diskon1) / 100 ) * Double.parseDouble(harga1));

                TextOutput.setText(String.valueOf(hasil1));
            break;
            case R.id.rad55:
                String harga2= editTextprice.getText().toString();
                String diskon2= diskon_2.getText().toString();

                double hasil2= Double.parseDouble(harga2)- ((Double.parseDouble(diskon2) / 100 ) * Double.parseDouble(harga2));

                TextOutput.setText(String.valueOf(hasil2));
                break;
            case R.id.rad65:
                String harga3= editTextprice.getText().toString();
                String diskon3= diskon_3.getText().toString();

                double hasil3= Double.parseDouble(harga3)- ((Double.parseDouble(diskon3) / 100 ) * Double.parseDouble(harga3));

                TextOutput.setText(String.valueOf(hasil3));
                break;
            case R.id.rad75:
                String harga4= editTextprice.getText().toString();
                String diskon4= diskon_4.getText().toString();

                double hasil4= Double.parseDouble(harga4)- ((Double.parseDouble(diskon4) / 100 ) * Double.parseDouble(harga4));

                TextOutput.setText(String.valueOf(hasil4));
                break;
        }
    }
}
