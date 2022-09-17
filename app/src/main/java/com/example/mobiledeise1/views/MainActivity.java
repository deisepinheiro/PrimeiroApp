package com.example.mobiledeise1.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mobiledeise1.R;
import com.example.mobiledeise1.databinding.ActivityMainBinding;
import com.example.mobiledeise1.model.Usuario;
import com.example.mobiledeise1.viewmodel.UsuarioViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewModel(new UsuarioViewModel());
        activityMainBinding.executePendingBindings();
    }

    @BindingAdapter({"returnLogin"})
    public static void runMe(View view, Usuario usuario) {
        if (usuario != null){
            Intent intent = new Intent(view.getContext(), DisplayActivity.class) ;
            intent.putExtra("usuario",usuario);
            view.getContext().startActivity(intent);
        }else{
            Toast.makeText(view.getContext(), "Usuário ou senha incorretos!", Toast.LENGTH_SHORT).show();
        }

    }
}