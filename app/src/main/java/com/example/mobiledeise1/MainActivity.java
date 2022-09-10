package com.example.mobiledeise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editUsuario;
    EditText editSenha;

    ArrayList<Usuario> listaUsuario = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editUsuario = findViewById(R.id.editUsuario);
        editSenha = findViewById(R.id.editSenha);

        listaUsuario.add(new Usuario("Deise", "1234"));
        listaUsuario.add(new Usuario("Diego", "5678"));
        listaUsuario.add(new Usuario("Eduardo", "9999"));
        listaUsuario.add(new Usuario("Enrico", "1234"));
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view){
        String login = editUsuario.getText().toString();
        String senha = editSenha.getText().toString();

        boolean userNotFound = true;
        for (Usuario usuario : listaUsuario) {
            if (usuario.getNome().equals(login) && usuario.getSenha().equals(senha)) {
                    userNotFound = false;
                Intent intent = new Intent(this, DisplayMessageActivity.class);
                intent.putExtra("login", login);
                intent.putExtra("senha", senha);
                startActivity(intent);
            }
        }
        if (userNotFound)
            editSenha.setError("Usuario ou senha incorretos");
    }
}