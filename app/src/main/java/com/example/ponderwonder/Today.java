package com.example.ponderwonder;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public class Today extends Fragment {

    private GoogleSignInAccount mGoogleSignInAccount;

    public Today() {
        // Required empty public constructor
    }

    public static Today newInstance() {
        Today fragment = new Today();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final NavController navController = Navigation.findNavController(super.getActivity(), R.id.mainNavigationFragment);
        final View todayView = inflater.inflate(R.layout.fragment_today, container, false);
        final Button button = todayView.findViewById(R.id.testButton);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.signIn);
            }
        });

        // Inflate the layout for this fragment
        return todayView;
    }

}
