package com.example.multi_screen_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.multi_screen_app.databinding.FragmentInformationPageBinding;

public class InformationPage extends Fragment {

    private FragmentInformationPageBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentInformationPageBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });

        binding.staff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(InformationPage.this)
                        .navigate(R.id.Information_to_Staff);
            }
        });

        binding.counselors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(InformationPage.this)
                        .navigate(R.id.Information_to_Counselor);
            }
        });

        binding.schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(InformationPage.this)
                        .navigate(R.id.action_InformationPage_to_SchedulePage);
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