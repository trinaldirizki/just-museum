package com.permana.justmuseum;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class HistoryMaterialFragment extends Fragment {


    public HistoryMaterialFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        RecyclerView historyRecycler = (RecyclerView) inflater.inflate(R.layout.fragment_history_material,container,false);

        String[] historyNames = new String[History.histories.length];
        for (int i = 0;i<historyNames.length;i++){
            historyNames[i] = History.histories[i].getName();
        }

        int[] historyImages = new int[History.histories.length];
        for (int i = 0; i < historyImages.length;i++){
            historyImages[i] = History.histories[i].getImageResourceId();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(historyNames,historyImages);
        historyRecycler.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        historyRecycler.setLayoutManager(layoutManager);
        adapter.setListener(new CaptionedImagesAdapter.Listener() {
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(),HistoryDetailActivity.class);
                intent.putExtra(HistoryDetailActivity.EXTRA_HISTORYNO,position);
                getActivity().startActivity(intent);
            }
        });
        return historyRecycler;
    }

}
