package com.govindas.restaurant.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class JwtUserDetails  implements UserDetails{

   private String username;
   private String token;
   private int id;
   private Collection<? extends  GrantedAuthority>authorities;
    public JwtUserDetails(String username, int id, String token, List<GrantedAuthority> grantedAuthorities) {
        this.username = username;
        this.id = id;
        this.token = token;
        this.authorities = grantedAuthorities;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }
    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    @Override
    public boolean isEnabled() {
        return true;
    }
    public String getToken() {
        return token;
    }
    public int getId() {
        return id;
    }
        public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }
}
