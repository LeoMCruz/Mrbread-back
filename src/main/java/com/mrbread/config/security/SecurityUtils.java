package com.mrbread.config.security;

import com.mrbread.domain.model.PerfilAcesso;
import com.mrbread.domain.model.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.UUID;

public class SecurityUtils {
    public static UUID obterOrganizacaoId() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null && auth.getPrincipal() instanceof User user) {
            return user.getOrganizacao().getIdOrg();
        }
        throw new IllegalStateException("Usuário não autenticado ou inválido");
    }

    public static PerfilAcesso perfilAcesso() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if(auth != null && auth.getPrincipal() instanceof User user){
            return user.getPerfilAcesso();
        }
        throw new IllegalStateException("Usuário não autenticado ou inválido");
    }

    public static boolean isAdmin() {
        return perfilAcesso() == PerfilAcesso.ADMIN;
    }

    public static boolean isManager() {
        return perfilAcesso() == PerfilAcesso.MANAGER;
    }

    //sem necessidade de usar esse metodo.
    public static boolean isDefault() {
        return perfilAcesso() == PerfilAcesso.DEFAULT;
    }

    public static String getEmail(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if(auth != null && auth.getPrincipal() instanceof User user){
            return user.getLogin();
        }
        throw new IllegalStateException("Usuário não autenticado ou inválido");
    }
}
