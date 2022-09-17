package com.example.mobiledeise1.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import com.example.mobiledeise1.databinding.*;

import com.example.mobiledeise1.R;
import com.example.mobiledeise1.model.Usuario;
import com.example.mobiledeise1.viewmodel.DisplayActivityViewModel;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDisplayMessageBinding displayActivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_display_message);
        Usuario user = (Usuario) getIntent().getSerializableExtra("usuario");
        displayActivityBinding.setViewModel(new DisplayActivityViewModel(user));

    }
}