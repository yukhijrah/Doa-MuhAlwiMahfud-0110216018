package com.alwi.ole.mydoa.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alwi.ole.mydoa.R;
import com.alwi.ole.mydoa.adapter.JadwalAdapter;
import com.alwi.ole.mydoa.model.mJadwal;

import java.util.ArrayList;
import java.util.List;


public class home extends Fragment {
    private List<mJadwal>jadwals=new ArrayList<>();

    RecyclerView lstJadwal;
    LinearLayoutManager linear;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view= inflater.inflate(R.layout.fragment_home,container,false);
        lstJadwal=view.findViewById(R.id.rvJadwal);
        linear=new LinearLayoutManager(getActivity());
        lstJadwal.setLayoutManager(linear);

        JadwalAdapter adapter = new JadwalAdapter(jadwals);
        lstJadwal.setAdapter(adapter);

        jadwalsCollect();

        return view;
    }
    private void jadwalsCollect(){
        jadwals.add(new mJadwal("Imsak","03:55"));
        jadwals.add(new mJadwal("Subuh","04:05"));
        jadwals.add(new mJadwal("Fajr","05:22"));
        jadwals.add(new mJadwal("Dzuhur","11:39"));
        jadwals.add(new mJadwal("Ashar","15:00"));
        jadwals.add(new mJadwal("Maghrib","17:51"));
        jadwals.add(new mJadwal("Isya","19.04"));
    }

}
