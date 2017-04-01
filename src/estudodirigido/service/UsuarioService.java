/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.service;

import Commum.AssertionConcern;
import Commum.HibernateUtil;
import estudodirigido.infra.IUsuarioRepositorio;
import estudodirigido.modelo.Usuario;
import estudodirigido.infra.UsuarioRepositorio;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jose
 */
public class UsuarioService extends AssertionConcern implements IUsuarioService {

    IUsuarioRepositorio _repositorio;

    public UsuarioService() {
        this._repositorio = new UsuarioRepositorio(HibernateUtil.getSessionFactory());
    }

    @Override
    public Usuario Autenticar(String login, String senha) {

        this.assertArgumentNotEmpty(login, "Campo login obrigatorio!");
        this.assertArgumentNotEmpty(senha, "Campo senha obrigatorio!");
        Usuario user = (Usuario) _repositorio.getAll().stream().filter(p
                -> p.getLogin().equals(login) && p.getSenha().equals(senha)).findAny().orElse(null);

        this.assertArgumentNotNull(user, "Usuario não encontrado!");

        return user;
    }

    @Override
    public Usuario save(Usuario obj) {
        return _repositorio.save(obj);
    }

    @Override
    public List<Usuario> getAll() {
        return _repositorio.getAll();
    }

}
