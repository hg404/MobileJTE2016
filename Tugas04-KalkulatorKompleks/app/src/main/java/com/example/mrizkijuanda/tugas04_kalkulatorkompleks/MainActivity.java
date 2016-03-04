package com.example.mrizkijuanda.tugas04_kalkulatorkompleks;

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
        EditText bilanganReal1 = (EditText) findViewById(R.id.bilanganReal1);
        String bilanganReal1Str = String.valueOf(bilanganReal1.getText());
        int real1 = Integer.valueOf(bilanganReal1Str);

        EditText bilanganImajiner1 = (EditText) findViewById(R.id.bilanganImajiner1);
        String bilanganImajiner1Str = String.valueOf(bilanganImajiner1.getText());
        int imaginer1 = Integer.valueOf(bilanganImajiner1Str);

        EditText bilanganReal2 = (EditText) findViewById(R.id.bilanganReal2);
        String bilanganRea2lStr = String.valueOf(bilanganReal2.getText());
        int real2 = Integer.valueOf(bilanganRea2lStr);

        EditText bilanganImajiner2 = (EditText) findViewById(R.id.bilanganImajiner2);
        String bilanganImajiner2Str = String.valueOf(bilanganImajiner2.getText());
        int imajiner2 = Integer.valueOf(bilanganImajiner2Str);

        RadioButton tambah = (RadioButton) findViewById(R.id.tambah);
        RadioButton kurang = (RadioButton) findViewById(R.id.kurang);
        RadioButton kali = (RadioButton) findViewById(R.id.kali);

        int Hasil1=0;
        int Hasil2=0;
        String tanda;

        if (tambah.isChecked()== true) {
            Hasil1=real1+real2;
            Hasil2=imaginer1+imajiner2;

        } else if (kurang.isChecked() == true) {
            Hasil1=real1-real2;
            Hasil2=imaginer1-imajiner2;

        } else if (kali.isChecked() == true) {
            Hasil1=real1*real2-imaginer1*imajiner2;
            Hasil2=imaginer1*real2+real1*imajiner2;

        }

        String hasil1Str = String.valueOf(Hasil1);
        String hasil2Str = String.valueOf(Hasil2);

        if(Hasil2>=0){
            tanda="+";
        }
        else {
            tanda="";
        }
        TextView lblHasil = (TextView) findViewById(R.id.lblhasil);
        lblHasil.setText(hasil1Str+tanda+hasil2Str+"j");
    }

}
