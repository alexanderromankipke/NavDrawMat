package com.example.alexander.navdrawmat;

/**
 * Created by Alexander on 12.04.2016.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class LecturerFragment extends Fragment {

    private Activity activity;

    public LecturerFragment(){};

    FloatingActionButton fab;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        fab = (FloatingActionButton)getView().findViewById(R.id.fab);
//        fab.setOnClickListener(this);
        return inflater.inflate(R.layout.lecturerdetail2,null);


    }

//
//    @Override
//    public void onClick(View v) {
//    Intent intent = new Intent(activity,FixtureFragment.class);
//        startActivity(intent);
//    }
}
