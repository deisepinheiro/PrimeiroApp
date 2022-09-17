package com.example.mobiledeise1.viewmodel;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.mobiledeise1.BR;
import com.example.mobiledeise1.model.Usuario;

public class DisplayActivityViewModel extends BaseObservable {

    @Bindable
    private Usuario usuario = null;

    public DisplayActivityViewModel(Usuario user) {
        usuario = user;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Bindable
    public String getUserName() {
        return usuario.getNome();
    }

    public void setUserName(String email) {
        usuario.setNome(email);
        notifyPropertyChanged(BR.userName);
    }
}
