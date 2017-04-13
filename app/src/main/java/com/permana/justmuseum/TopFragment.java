package com.permana.justmuseum;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;
import android.widget.RelativeLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class TopFragment extends Fragment {


    public TopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        RelativeLayout layout = (RelativeLayout) inflater.inflate(R.layout.fragment_top,container,false);
        RecyclerView museumRecycler = (RecyclerView) layout.findViewById(R.id.museum_recycler);
        String[] museumNames = new String[2];
        for (int i = 0; i < 2;i++){
            museumNames[i] = Museum.museums[i].getName();
        }
        int[] museumImages = new int[2];
        for (int i = 0; i < 2;i++){
            museumImages[i] = Museum.museums[i].getImageResourceId();
        }
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(),2);
        museumRecycler.setLayoutManager(layoutManager);
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(museumNames,museumImages);
        adapter.setListener(new CaptionedImagesAdapter.Listener() {
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(),MuseumDetailActivity.class);
                intent.putExtra(MuseumDetailActivity.EXTRA_MUSEUMNO,position);
                getActivity().startActivity(intent);
            }
        });
        museumRecycler.setAdapter(adapter);

        return layout;
    }

}
