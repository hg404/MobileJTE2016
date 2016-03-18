package com.example.mrizkijuanda.tugas09_tebakgambar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by M.Rizkijuanda on 18/03/16.
 */
public class activitykedua extends Activity{

        @Override
        protected  void onCreate (Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activitykedua);

            Intent pesan = getIntent();
            String pesan1Str = pesan.getStringExtra("varl");
            int pesan2Str = pesan.getIntExtra("var2", 0);

            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(pesan1Str);

            ImageView gambar = (ImageView) findViewById(R.id.gambar);
            gambar.setImageResource(pesan2Str);
        }
}
