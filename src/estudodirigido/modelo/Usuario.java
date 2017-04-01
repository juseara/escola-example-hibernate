/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.modelo;

import Commum.AssertionConcern;
import Commum.TipoUsuario;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author Renato
 */
@Entity
 public class Usuario extends AssertionConcern implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    private String login;
    private String senha;
    
    
    private TipoUsuario tipoUsuario;

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public Usuario() {
    }

    public void setId(long Id) {
        this.id = Id;
    }

    public long getId() {
        return id;
    }
    
    
    
    
    public Usuario(String login, String senha,TipoUsuario tipo) {
        this.assertArgumentNotEmpty(login, "Login obrigatorio!");
        this.assertArgumentNotEmpty(senha, "Senha Obrigatoria");
        this.login = login;
        this.senha = senha;
        this.tipoUsuario = tipo;
        
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
