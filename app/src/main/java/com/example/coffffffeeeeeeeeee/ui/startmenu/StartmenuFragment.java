package com.example.coffffffeeeeeeeeee.ui.startmenu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.coffffffeeeeeeeeee.databinding.FragmentStartmenuBinding;

public class StartmenuFragment extends Fragment {

    private FragmentStartmenuBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        StartmenuViewModel startmenuViewModel =
                new ViewModelProvider(this).get(StartmenuViewModel.class);

        binding = FragmentStartmenuBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textStartmenu;
        startmenuViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}