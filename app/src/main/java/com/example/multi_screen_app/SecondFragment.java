package com.example.multi_screen_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewpager.widget.ViewPager;

import com.example.multi_screen_app.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    // creating object of ViewPager
    ViewPager mViewPager;

    // images array
    int[] images = {R.drawable.abuilding1, R.drawable.abuilding2};

    // Creating Object of ViewPagerAdapter
    ViewPagerAdapter mViewPagerAdapter;

//private FragmentSecondBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        /*
        // Initializing the ViewPager Object
        mViewPager = (ViewPager) view.findViewById(R.id.slideshow1);

        // Initializing the ViewPagerAdapter
        mViewPagerAdapter = new ViewPagerAdapter(SecondFragment.this, images);

        // Adding the Adapter to the ViewPager
        mViewPager.setAdapter(mViewPagerAdapter);

        //binding = FragmentSecondBinding.inflate(inflater, container, false);
        */

        return view;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });
    }


@Override
    public void onDestroyView() {
        super.onDestroyView();
        //binding = null;
    }

    public void getSystemService(String layoutInflaterService) {
    }
}