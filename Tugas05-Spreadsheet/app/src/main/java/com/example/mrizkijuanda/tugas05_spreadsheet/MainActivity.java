package com.example.mrizkijuanda.tugas05_spreadsheet;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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

    public void onClickSamaDengan(View view) {
        EditText a11 = (EditText) findViewById(R.id.a11);
        String a11Str = String.valueOf(a11.getText());
        float cella11 = Float.valueOf(a11Str);

        EditText a12 = (EditText) findViewById(R.id.a12);
        String a12Str = String.valueOf(a12.getText());
        float cella12 = Float.valueOf(a12Str);

        EditText a21 = (EditText) findViewById(R.id.a21);
        String a21Str = String.valueOf(a21.getText());
        float cella21 = Float.valueOf(a21Str);

        EditText a22 = (EditText) findViewById(R.id.a22);
        String a22Str = String.valueOf(a22.getText());
        float cella22 = Float.valueOf(a22Str);

        RadioButton tambah = (RadioButton) findViewById(R.id.tambah);
        RadioButton kurang = (RadioButton) findViewById(R.id.kurang);
        RadioButton kali = (RadioButton) findViewById(R.id.kali);
        RadioButton bagi = (RadioButton) findViewById(R.id.bagi);

        float Hasil1=0;
        float Hasil2=0;
        float Hasil3=0;
        float Hasil4=0;


        if (tambah.isChecked()== true) {
            Hasil1=cella11+cella12;
            Hasil2=cella21+cella22;
            Hasil3=cella12+cella22;
            Hasil4=cella11+cella21;

        } else if (kurang.isChecked() == true) {
            Hasil1=cella11-cella12;
            Hasil2=cella21-cella22;
            Hasil3=cella12-cella22;
            Hasil4=cella11-cella21;

        } else if (kali.isChecked() == true) {
            Hasil1=cella11*cella12;
            Hasil2=cella21*cella22;
            Hasil3=cella12*cella22;
            Hasil4=cella11*cella21;
        } else if (bagi.isChecked() == true) {
            Hasil1=cella11/cella12;
            Hasil2=cella21/cella22;
            Hasil3=cella12/cella22;
            Hasil4=cella11/cella21;
        }

        String hasil1Str = String.valueOf(Hasil1);
        String hasil2Str = String.valueOf(Hasil2);
        String hasil3Str = String.valueOf(Hasil3);
        String hasil4Str = String.valueOf(Hasil4);

       TextView hasil1 = (TextView) findViewById(R.id.hasil1);
        hasil1.setText(hasil1Str);
        TextView hasil2 = (TextView) findViewById(R.id.hasil2);
        hasil2.setText(hasil2Str);
        TextView hasil3 = (TextView) findViewById(R.id.hasil3);
        hasil3.setText(hasil3Str);
        TextView hasil4 = (TextView) findViewById(R.id.hasil4);
        hasil4.setText(hasil4Str);
    }
}
