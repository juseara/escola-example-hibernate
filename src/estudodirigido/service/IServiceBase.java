/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.service;

import java.util.List;
import estudodirigido.infra.IRepositorioGenerico;

/**
 *
 * @author jose
 * @param <T>
 */
public interface IServiceBase<T> extends IRepositorioGenerico<T>{
    List<T> getAll();
}
