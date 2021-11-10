package com.example.multi_screen_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.multi_screen_app.databinding.FragmentFootballBinding;

public class FootBall extends Fragment {

    private FragmentFootballBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFootballBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FootBall.this)
                        .navigate(R.id.Football_to_Activities);
            }
        });

        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("MHHS Tour");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}