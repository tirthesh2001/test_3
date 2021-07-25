package com.example.test_3.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.test_3.R;
import com.example.test_3.databinding.FragmentGalleryBinding;
import com.example.test_3.tryme;
import com.example.test_3.ui.home.HomeFragment;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final Button test = binding.button;
        EditText name = binding.txt;
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String yo = name.getText().toString();
                Toast.makeText(getActivity(), yo, Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getActivity(), tryme.class);
                startActivity(i);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}