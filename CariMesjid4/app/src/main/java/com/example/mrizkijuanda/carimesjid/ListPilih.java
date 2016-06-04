package com.example.mrizkijuanda.carimesjid;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListPilih extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pilih);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.ic_launcher);
    }
    public void bandaaceh(View view){

        Intent intent = new Intent(this, ListBandaAceh.class);

        startActivity(intent);
    }
    public void pidie(View view){

        Intent intent = new Intent(this, ListPidie.class);

        startActivity(intent);
    }

    public void acehbesar(View view){

        Intent intent = new Intent(this, ListAcehBesar.class);

        startActivity(intent);
    }

    public void acehjaya(View view){

        Intent intent = new Intent(this, ListAcehJaya.class);

        startActivity(intent);
    }
}

