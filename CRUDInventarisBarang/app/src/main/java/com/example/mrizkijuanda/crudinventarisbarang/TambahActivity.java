package com.example.mrizkijuanda.crudinventarisbarang;

/**
 * Created by M.Rizkijuanda on 27/05/16.
 */
    import android.content.ContentValues;
    import android.content.Intent;
    import android.database.sqlite.SQLiteDatabase;
    import android.database.sqlite.SQLiteOpenHelper;
    import android.os.Bundle;
    import android.support.v7.app.AppCompatActivity;
    import android.view.View;
    import android.widget.Spinner;
    import android.widget.TextView;

    import com.example.mrizkijuanda.crudinventarisbarang.model.AturBarangDB;


    public class TambahActivity extends AppCompatActivity {
        protected void onCreate(Bundle savedInstance){
            super.onCreate(savedInstance);
            setContentView(R.layout.activity_tambah);
        }

        public void onClickTambah(View view){

            TextView txtNama = (TextView) findViewById(R.id.txtNama);
            String nama = txtNama.getText().toString();
            TextView txtKode = (TextView) findViewById(R.id.txtKode);
            String kode = txtKode.getText().toString();
            TextView txtJumlah = (TextView) findViewById(R.id.txtJumlah);
            String jumlah = txtJumlah.getText().toString();
            TextView txtHarga = (TextView) findViewById(R.id.txtHarga);
            String harga = txtHarga.getText().toString();
            Spinner spinner = (Spinner) findViewById(R.id.spinner2);
            //final int gambarInt = 0;
            int gambarInt = spinner.getSelectedItemPosition();
            String gambar = String.valueOf(gambarInt);



            SQLiteOpenHelper aturBarangDB = new AturBarangDB(this);
            SQLiteDatabase db = aturBarangDB.getWritableDatabase();

            ContentValues barangBaru = new ContentValues();
            barangBaru.put(AturBarangDB.KODE_SKU, kode);
            barangBaru.put(AturBarangDB.NAMA_BARANG, nama);
            barangBaru.put(AturBarangDB.JUMLAH, jumlah);
            barangBaru.put(AturBarangDB.HARGA, harga);
            barangBaru.put(AturBarangDB.GAMBAR, gambar);

            db.insert(AturBarangDB.TABEL_BARANG, null, barangBaru);
            db.close();

            Intent pesan = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(pesan);
            finish();


        }

    }

