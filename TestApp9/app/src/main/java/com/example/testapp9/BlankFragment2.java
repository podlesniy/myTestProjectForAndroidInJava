package com.example.testapp9;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.testapp9.databinding.FragmentBlank2Binding;


public class BlankFragment2 extends Fragment {

    private FragmentBlank2Binding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_blank2, container, false);

        viewContact(Generator.contactInfo(BlankFragment.str));

        return binding.getRoot();
    }

    public void viewContact(UserModel contact){
            binding.name.setText(contact.name);
            binding.phone.setText(contact.phone);
            binding.email.setText(contact.email);
            binding.adr.setText(contact.adr);
            binding.imageView.setImageResource(contact.image);
    }
}