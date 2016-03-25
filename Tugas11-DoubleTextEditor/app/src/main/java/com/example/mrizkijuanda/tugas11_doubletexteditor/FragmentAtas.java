package com.example.mrizkijuanda.tugas11_doubletexteditor;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by M.Rizkijuanda on 25/03/16.
 */
public class FragmentAtas extends Fragment {

    public FragmentAtas() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_atas, container, false);
    }
}
