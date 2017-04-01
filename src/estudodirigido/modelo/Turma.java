/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.modelo;


import java.util.List;

/**
 *
 * @author Renato
 */
public class Turma {
    private int TurmaId;
    private String nome;
    private List<Aluno> Alunos;
    private Professor professor;
    private Curso curso;    

    public Turma(int turmaId,String nome, List<Aluno> alunos, Professor professor, Curso curso) {
        this.TurmaId=turmaId;
        this.nome = nome;
        this.Alunos = alunos;
        this.professor = professor;
        this.curso = curso;
        
    }

    public int getTurmaId() {
        return TurmaId;
    }   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return Alunos;
    }

    public void setAlunos(List<Aluno> Alunos) {
        this.Alunos = Alunos;
    }

    

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

}
