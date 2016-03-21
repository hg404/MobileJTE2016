package com.example.mrizkijuanda.prak21_ubahpin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by M.Rizkijuanda on 19/03/16.
 */
public class activityketiga extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityketiga);

        Intent pesan = getIntent();
        String pesanStr = pesan.getStringExtra("ubah");
        //ubah.setText(pesanStr);

    }

    public void onClick3(View view){

        EditText ubah = (EditText) findViewById(R.id.editText2);

        String pinStr = ubah.getText().toString();
        int pinInt = Integer.valueOf(pinStr);

        SharedPreferences sharedPreferences =
                getSharedPreferences("com.example.mrizkijuanda.prak21_ubahpin.MainActivityFragment", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("pin", pinInt);
        editor.apply();

        Intent pesan2 = new Intent(getApplicationContext(), MainActivity.class);
        //pesan.putExtra("var1", "Peu Haba !");
        startActivity(pesan2);
        finish();

    }

}
