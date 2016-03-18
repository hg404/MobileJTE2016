package com.example.mrizkijuanda.tugas08_pilihgambar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by M.Rizkijuanda on 18/03/16.
 */
public class activitykedua extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitykedua);


        Intent pesan = getIntent();
        int pesanStr = pesan.getIntExtra("var1",0);
        ImageView gambar = (ImageView) findViewById(R.id.imageView);
        gambar.setImageResource(pesanStr);
    }
}
