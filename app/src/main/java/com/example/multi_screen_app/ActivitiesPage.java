package com.example.multi_screen_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.multi_screen_app.databinding.FragmentActivitiesPageBinding;

public class ActivitiesPage extends Fragment {

    private FragmentActivitiesPageBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentActivitiesPageBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.football.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ActivitiesPage.this)
                        .navigate(R.id.action_ActivtiesPage_to_Football);
            }
        });

        binding.soccer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ActivitiesPage.this)
                        .navigate(R.id.action_ActivitiesPage_to_soccer2);
            }
        });

        binding.basketball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ActivitiesPage.this)
                        .navigate(R.id.action_ActivitiesPage_to_basketball2);
            }
        });

        binding.tennis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ActivitiesPage.this)
                        .navigate(R.id.action_ActivitiesPage_to_tennis2);
            }
        });

        binding.track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ActivitiesPage.this)
                        .navigate(R.id.action_ActivitiesPage_to_track2);
            }
        });

        binding.baseball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ActivitiesPage.this)
                        .navigate(R.id.action_ActivitiesPage_to_baseball2);
            }
        });

        binding.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });

        //((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("MHHS Tour");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}