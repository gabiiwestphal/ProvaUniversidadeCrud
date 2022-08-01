/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao2.Model;

import com.mycompany.questao2.Exception.TurmaCompletaException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author 13289069907
 */
public class Turma {
    private int codigo;
    private String nomeDisciplina;
    private int qtdVagas;
    
    private Curso curso;
    private Professor professor;
    private List<Aluno> alunosMatriculados;

    public Turma(int codigo, String nomeDisciplina, int qtdVagas) {
        this.alunosMatriculados = new ArrayList<>();
        this.codigo = codigo;
        this.nomeDisciplina = nomeDisciplina;
        this.qtdVagas = qtdVagas;
    }
    
    public void listarAlunos() {
        for(Aluno a : alunosMatriculados) {
            System.out.println(a.toString());
        }
 
    }    

    public void matricularAluno(Aluno aluno) throws TurmaCompletaException {
        if(this.alunosMatriculados.size() == qtdVagas) {
            throw new TurmaCompletaException();
        }
        
        this.alunosMatriculados.add(aluno);
        
    }
    
    public void ordernarAlunosPorNome() {
        Comparator<Aluno> comp = new Comparator<>() {
            @Override
            public int compare(Aluno o1, Aluno o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        };
        
        alunosMatriculados.sort(comp);
    }
    
    public void ordenarAlunosPorCPF() {
        Iterator<Aluno> it = alunosMatriculados.iterator();
        
        while(it.hasNext()) {
            for(Aluno a : alunosMatriculados) {
                a.compareTo(it.next());
            }
        }
        
        Collections.sort(alunosMatriculados);
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getQtdVagas() {
        return qtdVagas;
    }

    public void setQtdVagas(int qtdVagas) {
        this.qtdVagas = qtdVagas;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    @Override
    public String toString() {
        return "Turma{" + "codigo=" + codigo + ", nomeDisciplina=" + nomeDisciplina + ", qtdVagas=" + qtdVagas + ", curso=" + curso + ", professor=" + professor + ", alunosMatriculados=" + alunosMatriculados + '}';
    }
    
    
}
