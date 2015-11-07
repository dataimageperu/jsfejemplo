package com.dataimage.m3_lab3.controllers.security;

import com.dataimage.m3_lab3.dao.UsuarioDAO;
import com.dataimage.m3_lab3.model.Usuario;
import java.util.ArrayList;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userDetailsService")
@Transactional(readOnly = true)
public class UserDetailsServiceImp implements UserDetailsService {

    @Autowired
    private UsuarioDAO usuarioDAO;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        
        Usuario usuario = usuarioDAO.findByLogin(nombreUsuario);
        
        if (usuario == null) {
            throw new UsernameNotFoundException("Usuario no encontrado");
        }
        
        String username = usuario.getUsername();
        String password = usuario.getPassword();
        
        Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority(usuario.getRol())); //si tienes varios roles se hace for each
        
        //User es objeto de spring
        return new User(username, password, authorities);
    }
}
