
package com.portfolio.mng.Security.Dto;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;


public class JwtDto {
 private String toke;
 private String bearer = "Bearer";
 private String nombreUsuario;
 private Collection<? extends GrantedAuthority> authorities;

    public JwtDto(String toke, String nombreUsuario, Collection<? extends GrantedAuthority> authorities) {
        this.toke = toke;
        this.nombreUsuario = nombreUsuario;
        this.authorities = authorities;
    }

    public String getToke() {
        return toke;
    }

    public void setToke(String toke) {
        this.toke = toke;
    }

    public String getBearer() {
        return bearer;
    }

    public void setBearer(String bearer) {
        this.bearer = bearer;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }



}