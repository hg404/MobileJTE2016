package com.example.mrizkijuanda.carimesjid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class List extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

    }

    public void onClickMapList(View view) {
        Intent pesan = new Intent(getApplicationContext(),
                Maps_list.class);
        startActivity(pesan);
    }
}