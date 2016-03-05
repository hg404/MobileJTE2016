package com.example.mrizkijuanda.testawal;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
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

        EditText numAngka1 = (EditText) findViewById(R.id.numAngka1);
        String angka1Str = numAngka1.getText().toString();
        int angka1 = Integer.valueOf(angka1Str);

        EditText numAngka2 = (EditText) findViewById(R.id.numAngka2);
        String angka2Str = numAngka2.getText().toString();
        int angka2 = Integer.valueOf(angka2Str);

        TextView lblhasil = (TextView) findViewById(R.id.lblhasil);
        int total = 0;
        if (angka1 <= angka2) {
            while (angka1 <= angka2) {
                total += angka1;
                angka1++;
            }
            String totalStr = Integer.toString(total);
            lblhasil.setText(totalStr);
        } else if (angka1 >= angka2) {
            while (angka1 >= angka2) {
                total += angka1;
                angka1--;
            }
            String totalStr = Integer.toString(total);
            lblhasil.setText(totalStr);
        }

    }

}
