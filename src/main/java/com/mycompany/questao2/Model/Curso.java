/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao2.Model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author 13289069907
 */
public class Curso {
    private int codigo;
    private String nome;
    
    private List<Turma> turmas;

    public Curso(int codigo, String nome) {
        this.turmas = new ArrayList<>();
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public void listarTurmasAlunoPorMatricula(String matricula) {
        for(Turma t : turmas) {
            for(Aluno a : t.getAlunosMatriculados()) {
                if(a.getMatricula().equals(matricula)) {
                    System.out.println(t.toString());
                }
            }
        }
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", nome=" + nome + ", turmas=" + turmas + '}';
    }
    
    
}
