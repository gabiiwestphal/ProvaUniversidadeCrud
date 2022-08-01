/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao2.Model;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author 13289069907
 */
public class Aluno extends Pessoa {
    private String matricula;
    private List<Turma> turmas;

    public Aluno(String matricula, String nome, long cpf) {
        super(nome, cpf);
        this.matricula = matricula;
    }
   

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
    @Override
    public String toString() {
        return super.toString() + ", matricula=" + matricula + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        return Objects.equals(this.matricula, other.matricula);
    }

    
    
}
