package com.example.mobiledeise1.model;

import java.util.ArrayList;

public class ListUsuarios {

    private static  ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>(){
        {
            add(new Usuario("Deise", "1234"));
            add(new Usuario("Diego", "5678"));
            add(new Usuario("Eduardo", "9999"));
            add(new Usuario("Enrico", "1234"));
        }
    };

    public static boolean autenticaUsuario(Usuario user){
        for (Usuario usuario : listaUsuario) {
            if (usuario.equals(user))
                return true;
        }
        return false;
    }
}
