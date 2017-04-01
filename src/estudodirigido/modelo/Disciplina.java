/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.modelo;

/**
 *
 * @author Renato
 */
public class Disciplina {
    private int DisciplinaId;
    private String nome;    
    public static final  double Media = 6;

    public Disciplina(int disciplinaid,String nome) {
        this.DisciplinaId=disciplinaid;
        this.nome = nome;
        
    }

    public int getDisciplinaId() {
        return DisciplinaId;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public double calcularMedia(double nota1,double nota2,double ed){
    //    this.media=(nota1*0.3)+(nota2*0.5)+(ed*0.2);
        return this.Media;
    }
}
