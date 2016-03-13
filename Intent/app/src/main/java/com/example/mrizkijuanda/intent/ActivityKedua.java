package com.example.mrizkijuanda.intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by M.Rizkijuanda on 12/03/16.
 */
public class ActivityKedua extends Activity {

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        Intent pesan = getIntent();
        String pesanStr = pesan.getStringExtra("var1");

        TextView textLabel = (TextView) findViewById(R.id.textLabel);
        textLabel.setText(pesanStr);

    }

}
