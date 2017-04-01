/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.Controle;

import Commum.TipoUsuario;
import estudodirigido.modelo.Aluno;
import estudodirigido.modelo.AlunoDisciplina;
import estudodirigido.modelo.Curso;
import estudodirigido.modelo.Disciplina;
import estudodirigido.modelo.Professor;
import estudodirigido.modelo.Usuario;
import estudodirigido.modelo.Turma;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author Renato
 */
public class RepositorioBase {

    
    
    
    public List<Curso> Cursos;
    public List<Professor> Professores;
    public List<Aluno> Alunos;
    public List<Usuario> Usuarios;
    public List<Disciplina> Disciplinas;
    public List<AlunoDisciplina> alunoDisciplinas;
    public List<Turma> Turmas;

    public RepositorioBase() {
        this.Usuarios  = new ArrayList<Usuario>();
        this.Alunos = new ArrayList<Aluno>();
        this.Cursos  = new ArrayList<Curso>(); 
        this.Professores  = new ArrayList<Professor>();
        this.Disciplinas = new ArrayList<Disciplina>();
        this.alunoDisciplinas = new ArrayList<AlunoDisciplina>();
        this.Turmas = new ArrayList<Turma>();
        
        Curso curso = new Curso(1,"Engenharia da Computação ","nao entendi","Noturno");
       // Curso curso2 = new Curso(2,"Analise e desenvolvimento de Sistemas","nao entendi","Noturno");
        this.Cursos.add(curso);
       // this.Cursos.add(curso2);
        
        Usuario usurio1 = new Usuario("Renato","12345",TipoUsuario.Aluno);
        Usuario usurio2 = new Usuario("Juliana","12345",TipoUsuario.Professor);
        
        
        
       // Aluno aluno1 = new Aluno("Renato",00001,"33211232103",curso,usurio1.getLogin(),usurio2.getSenha());
       // Professor professor1 = new Professor("Juliana",1111,"Javeira",usurio2.getLogin(), usurio2.getSenha());
        //this.Alunos.add(aluno1);
     //   this.Professores.add(professor1);
        
        this.Usuarios.add(usurio1);
        this.Usuarios.add(usurio2);
        
        
        Disciplina banco = new Disciplina(1,"Banco de dados 2");
        Disciplina oop = new Disciplina(1,"Programacao Orientada a Objeto");
        Disciplina cs2 = new Disciplina(1,"Circuitos Sequenciais 2");
        Disciplina ampop = new Disciplina(1,"Amplificadores operacionais");
        
        Disciplina algoritmo = new Disciplina(1,"Algoritmos");
        Disciplina programacao = new Disciplina(1,"Programação Web");
        
        this.Disciplinas.add(algoritmo);
        this.Disciplinas.add(programacao);
        
        this.Disciplinas.add(banco);
        this.Disciplinas.add(oop);
        this.Disciplinas.add(cs2);
        this.Disciplinas.add(ampop);
        
        
//        AlunoDisciplina alunoDiscplina1 = new AlunoDisciplina(aluno1, ampop);
//        AlunoDisciplina alunoDiscplina2 = new AlunoDisciplina(aluno1, banco);
//        AlunoDisciplina alunoDiscplina3 = new AlunoDisciplina(aluno1, cs2);
        
//        this.alunoDisciplinas.add(alunoDiscplina1);
//        this.alunoDisciplinas.add(alunoDiscplina2);
//        this.alunoDisciplinas.add(alunoDiscplina3);
        
        curso.setDisciplinas(Disciplinas);
        
        List<Disciplina> disciplina2 = new ArrayList<Disciplina>();
        
        disciplina2.add(algoritmo);
        disciplina2.add(programacao);
        //curso2.setDisciplinas(disciplina2);
       // Turma tuma1 = new Turma(1, "1ENGC", Alunos, professor1, curso);
        
       // this.Turmas.add(tuma1);
    }

    public RepositorioBase(Class<Usuario> aClass, SessionFactory sessionFactory) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

}
