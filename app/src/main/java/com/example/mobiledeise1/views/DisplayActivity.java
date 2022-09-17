package com.example.mobiledeise1.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.example.mobiledeise1.databinding.ActivityDisplayMessageBinding;

import com.example.mobiledeise1.R;
import com.example.mobiledeise1.model.Usuario;
import com.example.mobiledeise1.viewmodel.DisplayActivityViewModel;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDisplayMessageBinding activityDisplayMessageBinding = DataBindingUtil.setContentView(this, R.layout.activity_display_message);
        Usuario user = (Usuario) getIntent().getSerializableExtra("usuario");
        activityDisplayMessageBinding.setViewModel(new DisplayActivityViewModel(user));

    }
}