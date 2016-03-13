package com.example.mrizkijuanda.tesawaljoystick;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
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



    public void onClickButton (View view){
        final TextView textX = (TextView) findViewById(R.id.textX);
        final TextView textY = (TextView) findViewById(R.id.textY);
        final TextView textZ = (TextView) findViewById(R.id.textZ);
        Button xTambah = (Button) findViewById(R.id.xTambah);
        Button xKurang = (Button) findViewById(R.id.xKurang);
        Button yTambah = (Button) findViewById(R.id.yTambah);
        Button yKurang = (Button) findViewById(R.id.yKurang);
        Button zTambah = (Button) findViewById(R.id.zTambah);
        Button zKurang = (Button) findViewById(R.id.zKurang);



        xTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x++;
                textX.setText((String.valueOf(x)));
            }
        });

        xKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x--;
                textX.setText((String.valueOf(x)));
            }
        });

        yTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y++;
                textY.setText((String.valueOf(y)));
            }
        });

        yKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y--;
                textY.setText((String.valueOf(y)));
            }

        });



        zTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                z++;
                textZ.setText((String.valueOf(z)));
            }
        });

        zKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                z--;
                textZ.setText((String.valueOf(z)));
            }

        });


    }

    int x = 0;
    int y = 0;
    int z = 0;

}