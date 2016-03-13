package com.example.mrizkijuanda.prak17counter;

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
            setContentView(R.layout.activitykedua);

            Intent pesan = getIntent();
            String pesanStr = pesan.getStringExtra("varl");

            TextView textLabel = (TextView) findViewById(R.id.textHasil);
            textLabel.setText(pesanStr);

        }
}
