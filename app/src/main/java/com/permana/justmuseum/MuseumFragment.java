package com.permana.justmuseum;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.app.ListFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumFragment extends ListFragment {


    public MuseumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(),android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.museums));
        setListAdapter(adapter);
        return super.onCreateView(inflater,container,savedInstanceState);
    }

}
