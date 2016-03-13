package com.example.mrizkijuanda.prak18_tebakangka;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by M.Rizkijuanda on 12/03/16.
 */
public class activitykedua extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitykedua);
        Intent pesan = getIntent();
        String pesanStr = pesan.getStringExtra("var1");

        TextView txtbenarsalah = (TextView) findViewById(R.id.txtbenarsalah);
        txtbenarsalah.setText(pesanStr);
    }
}
