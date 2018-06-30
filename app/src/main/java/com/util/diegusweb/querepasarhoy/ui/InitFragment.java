package com.util.diegusweb.querepasarhoy.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.util.diegusweb.querepasarhoy.R;
import com.util.diegusweb.querepasarhoy.adapter.AdapterInit;

/**
 * A simple {@link Fragment} subclass.
 */
public class InitFragment extends Fragment {

    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private AdapterInit adapterInit;

    public InitFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_init, container, false);

        recyclerView = view.findViewById(R.id.reciclador);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        adapterInit = new AdapterInit();
        recyclerView.setAdapter(adapterInit);
        return view;

    }

}
