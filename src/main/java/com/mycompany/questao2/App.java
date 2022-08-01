/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao2;

import com.mycompany.questao2.Exception.TurmaCompletaException;
import com.mycompany.questao2.Model.Aluno;
import com.mycompany.questao2.Model.Curso;
import com.mycompany.questao2.Model.Pessoa;
import com.mycompany.questao2.Model.Professor;
import com.mycompany.questao2.Model.Turma;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 13289069907
 */
public class App {
    public static void main(String[] args) {
       Curso c1 = new Curso(1, "Engenharia de Software");
       
       Pessoa p1 = new Aluno("123", "Cauê", 923123122);
       Pessoa p2 = new Professor("345", "20/06/2005", "Jonas", 2319382198l);
       Pessoa p3 = new Aluno("789", "Lucas", 37439247l);
       Pessoa p4 = new Aluno("00123", "Pedro", 823912l);
       
       Turma t1 = new Turma(2, "prog2", 2);
       
        try {
            
            t1.matricularAluno((Aluno) p3);
            t1.matricularAluno((Aluno) p1);
            t1.matricularAluno((Aluno) p4);
        } catch (TurmaCompletaException e) {
            System.out.println(e.getMessage());
        }
        
        t1.listarAlunos();
        
        System.out.println("------------------------------");
        
        c1.listarTurmasAlunoPorMatricula(((Aluno) p1).getMatricula());
        
        System.out.println("------------------------------");
        
        t1.ordernarAlunosPorNome();
        
        System.out.println("------------------------------");
        
        for(Aluno a : t1.getAlunosMatriculados()) {
            System.out.println(a);
        }
        
        System.out.println("------------------------------");
        
        t1.ordenarAlunosPorCPF();
        
        for(Aluno a : t1.getAlunosMatriculados()) {
            System.out.println(a);
        }
    }
}
