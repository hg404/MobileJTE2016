package com.example.mrizkijuanda.prak21_ubahpin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
        String pesanStr = pesan.getStringExtra("var1");

        TextView txtLabel = (TextView) findViewById(R.id.textView);
        txtLabel.setText(pesanStr);

    }

    public void onClick2(View view){
        Intent pesan1 = new Intent(getApplicationContext(), activityketiga.class);
        //pesan1.putExtra("ubah",pesanStr);
        startActivity(pesan1);
        finish();

    }
}


