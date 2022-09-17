package com.example.mobiledeise1.viewmodel;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.mobiledeise1.BR;
import com.example.mobiledeise1.model.ListUsuarios;
import com.example.mobiledeise1.model.Usuario;

public class UsuarioViewModel extends BaseObservable {

    private Usuario usuario;

    @Bindable
    private Usuario usuarioLogado = null;

    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    private void setUsuarioLogado(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
        notifyPropertyChanged(BR.usuarioLogado);
    }

    public void setUserName(String email) {
        usuario.setNome(email);
        notifyPropertyChanged(BR.userName);
    }

    @Bindable
    public String getUserName() {
        return usuario.getNome();
    }

    @Bindable
    public String getUserPassword() {
        return usuario.getSenha();
    }

    public void setUserPassword(String password) {
        usuario.setSenha(password);
        notifyPropertyChanged(BR.userPassword);
    }

    public UsuarioViewModel() {
        usuario = new Usuario("","");
    }

    public void onLoginClicked() {
        if (ListUsuarios.autenticaUsuario(usuario)) {
            setUsuarioLogado(usuario);
        }else {
            setUsuarioLogado(null);
        }
    }
}

