/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.modelo;

import Commum.AssertionConcern;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Renato
 */
public class Curso extends AssertionConcern{
    private int CursoId;
    private String nome;
    private String descricao;
    private String periodo;
    private List<Disciplina> Disciplinas;

    public Curso(int cursoId,String nome, String descricao, String periodo) {
        
        this.assertArgumentNotEmpty(nome, "Nome curso obrigatorio!");
        this.assertArgumentNotEmpty(descricao, "Descricao obrigatoria!");
        this.assertArgumentNotEmpty(periodo, "Periodo obrigatorio!");
        this.CursoId=cursoId;
        
        this.nome = nome;
        this.descricao = descricao;
        this.periodo = periodo;
        this.Disciplinas = new ArrayList<Disciplina>();
    }

    public int getCursoId() {
        return CursoId;
    }

    public List<Disciplina> getDisciplinas() {
        return Disciplinas;
    }

    public void setDisciplinas(List<Disciplina> Disciplinas) {
        this.Disciplinas = Disciplinas;
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    @Override public String toString() {
        return getNome();
    }
    
    
}
