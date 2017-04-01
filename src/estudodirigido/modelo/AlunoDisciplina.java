/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.modelo;



/**
 *
 * @author Andre
 */
public class AlunoDisciplina {
    
    private Aluno Aluno;
    private Disciplina Disciplina;
    private int Faltas;
    private double U1;
    private double U2;
    private double ED;
    private double MediaFinal;

    public AlunoDisciplina(Aluno Aluno, Disciplina Disciplina) {
        this.Aluno = Aluno;
        this.Disciplina = Disciplina;
        this.Faltas = 0;
        this.ED=0;
        this.MediaFinal=0;
        this.U1=0;
        this.U2=0;
    }

    public Aluno getAluno() {
        return Aluno;
    }

    public Disciplina getDisciplina() {
        return Disciplina;
    }

    public int getFaltas() {
        return Faltas;
    }

    public double getU1() {
        return U1;
    }

    public double getU2() {
        return U2;
    }

    public double getED() {
        return ED;
    }

    public double getMediaFinal() {
        return MediaFinal;
    }

    public void setFaltas(int Faltas) {
        this.Faltas = Faltas;
    }

    public void setU1(double U1) {
        this.U1 = U1;
    }

    public void setU2(double U2) {
        this.U2 = U2;
    }

    public void setED(double ED) {
        this.ED = ED;
    }

    public void setMediaFinal(double MediaFinal) {
        this.MediaFinal = MediaFinal;
    }
    
    public double calcularMedia(double nota1,double nota2,double ed){
        this.MediaFinal =(nota1*0.3)+(nota2*0.5)+(ed*0.2);
        return this.MediaFinal;
    }
    
}
