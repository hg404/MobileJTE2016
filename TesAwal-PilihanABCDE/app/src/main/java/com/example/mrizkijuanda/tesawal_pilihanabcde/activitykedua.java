package com.example.mrizkijuanda.tesawal_pilihanabcde;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by M.Rizkijuanda on 19/03/16.
 */
public class activitykedua extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitykedua);

        Intent pesan = getIntent();
        String pesan1 = pesan.getStringExtra("var1");
        String pesan2 = pesan.getStringExtra("tulis");

        TextView txtLabel = (TextView) findViewById(R.id.textView);
        txtLabel.setText("An­da Memilih " + pesan2 + " Sebanyak " + pesan1 + " Kali");
    }
}
