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
public class CityMaterialFragment extends Fragment {


    public CityMaterialFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        RecyclerView cityRecycler = (RecyclerView) inflater.inflate(R.layout.fragment_city_material,container,false);

        String[] cityNames = new String[City.cities.length];
        for (int i = 0;i<cityNames.length;i++){
            cityNames[i] = City.cities[i].getName();
        }

        int[] cityImages = new int[City.cities.length];
        for (int i = 0; i < cityImages.length;i++){
            cityImages[i] = City.cities[i].getImageResourceId();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(cityNames,cityImages);
        cityRecycler.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        cityRecycler.setLayoutManager(layoutManager);
        adapter.setListener(new CaptionedImagesAdapter.Listener() {
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(),CityDetailActivity.class);
                intent.putExtra(CityDetailActivity.EXTRA_CITYNO,position);
                getActivity().startActivity(intent);
            }
        });
        return cityRecycler;
    }

}
