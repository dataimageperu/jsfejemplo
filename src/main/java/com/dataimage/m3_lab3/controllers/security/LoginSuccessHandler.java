package com.dataimage.m3_lab3.controllers.security;

import com.dataimage.m3_lab3.dao.UsuarioDAO;
import com.dataimage.m3_lab3.model.Usuario;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component // se convierte en bean
public class LoginSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

    @Autowired
    private UsuarioDAO usuarioDAO;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
                                        HttpServletResponse response, 
                                        Authentication a) 
            throws IOException, ServletException {
        
        Usuario autenticado = usuarioDAO.findByLogin(a.getName());
        
        request.getSession().setAttribute("USUARIO_AUTENTICADO",autenticado.getPersona());
        
        setDefaultTargetUrl("/principal");
        
        super.onAuthenticationSuccess(request, response, a);
    }
}
