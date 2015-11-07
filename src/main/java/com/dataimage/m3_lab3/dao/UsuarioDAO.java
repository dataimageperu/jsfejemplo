package com.dataimage.m3_lab3.dao;

import com.dataimage.m3_lab3.model.Usuario;

public interface UsuarioDAO {

    Usuario findByLogin(String usuario);
}
