package com.example.mrizkijuanda.crudinventarisbarang.model;

/**
 * Created by M.Rizkijuanda on 27/05/16.
 */
import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mrizkijuanda.crudinventarisbarang.R;

public class BarangCursorAdapter extends CursorAdapter {
    public BarangCursorAdapter(Context context, Cursor cursor){
        super(context, cursor, 0);
    }

    public View newView(Context context, Cursor cursor, ViewGroup parent){
        return LayoutInflater.from(context).inflate(R.layout.model, parent, false);

    }

    public void bindView(View view, Context context, Cursor cursor){
        String nama = cursor.getString(cursor.getColumnIndexOrThrow(AturBarangDB.NAMA_BARANG));
        TextView txtNama = (TextView) view.findViewById(R.id.txtNama);
        txtNama.setText(nama);

        String sku = cursor.getString(cursor.getColumnIndexOrThrow(AturBarangDB.KODE_SKU));
        TextView txtKode = (TextView) view.findViewById(R.id.txtKode);
        txtKode.setText(sku);

        String gambarStr = cursor.getString(cursor.getColumnIndexOrThrow(AturBarangDB.GAMBAR));
        ImageView txtGambar = (ImageView) view.findViewById(R.id.imageView);
        int posisi = Integer.parseInt(gambarStr);
        int [] gambar = {R.drawable.unavalaible,R.drawable.pampers,R.drawable.mamypokopant,R.drawable.sweety};
        txtGambar.setImageResource(gambar[posisi]);


    }
}

