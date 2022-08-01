/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao2.Model;

import java.util.Date;

/**
 *
 * @author 13289069907
 */
public class Professor extends Pessoa {
    private String matricula;
    private String dataAdmissao;

    public Professor(String matricula, String dataAdmissao, String nome, long cpf) {
        super(nome, cpf);
        this.matricula = matricula;
        this.dataAdmissao = dataAdmissao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        return super.toString() + ", data admissão: " + dataAdmissao;
    }
    
}
