/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author llnev
 */
public class Aluno {
    private int  ra;
    private String nome;
    private int idade;
    private String cpf; 
    private int turma;
    private int faltas;
    
    public int getFaltas(){
        return faltas;
    }
    public void setFaltas(int faltas){
        this.faltas = faltas;
    }
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getTurma(){
        return turma;
    }
    public void setTurma(int turma){
        this.turma = turma;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}
