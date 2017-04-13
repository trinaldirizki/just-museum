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
public class MuseumMaterialFragment extends Fragment {


    public MuseumMaterialFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        RecyclerView museumRecycler = (RecyclerView) inflater.inflate(R.layout.fragment_museum_material,container,false);

        String[] museumNames = new String[Museum.museums.length];
        for (int i = 0;i<museumNames.length;i++){
            museumNames[i] = Museum.museums[i].getName();
        }

        int[] museumImages = new int[Museum.museums.length];
        for (int i = 0; i < museumImages.length;i++){
            museumImages[i] = Museum.museums[i].getImageResourceId();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(museumNames,museumImages);
        museumRecycler.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        museumRecycler.setLayoutManager(layoutManager);

        adapter.setListener(new CaptionedImagesAdapter.Listener() {
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(),MuseumDetailActivity.class);
                intent.putExtra(MuseumDetailActivity.EXTRA_MUSEUMNO,position);
                getActivity().startActivity(intent);
            }
        });
        return museumRecycler;
    }

}
