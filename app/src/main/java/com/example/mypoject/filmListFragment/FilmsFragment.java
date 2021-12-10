package com.example.mypoject.filmListFragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mypoject.R;
import com.example.mypoject.databinding.FragmentFilmsBinding;


public class FilmsFragment extends Fragment {

private FragmentFilmsBinding binding;

    public FilmsFragment() {
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFilmsBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}