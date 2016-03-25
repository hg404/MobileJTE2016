package com.example.mrizkijuanda.tugas10_usernamepassword;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by M.Rizkijuanda on 25/03/16.
 */
public class ActivityUbahLogin extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubah_login);
    }

    public void onClickBtnSimpan(View view){
        EditText inputUbahUsername = (EditText) findViewById(R.id.inputUbahUsername);
        String usernameStr = inputUbahUsername.getText().toString();
        EditText inputUbahPassword = (EditText) findViewById(R.id.inputUbahPassword);
        String passwordStr = inputUbahPassword.getText().toString();

        SharedPreferences sharedPreferences =
                getSharedPreferences("com.example.mrizkijuanda.tugas10_usernamepassword.MainActivityFragment", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("user", usernameStr);
        editor.putString("pass", passwordStr);
        editor.apply();

        Intent pesan = new Intent(getApplicationContext(), MainActivity.class);
        pesan.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(pesan);
        finish();
    }
}