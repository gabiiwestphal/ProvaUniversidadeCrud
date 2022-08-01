/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao2.Model;

/**
 *
 * @author 13289069907
 */
public abstract class Pessoa implements Comparable<Pessoa> {
    protected String nome;
    protected long cpf;

    public Pessoa(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + '}';
    }

    @Override
    public int compareTo(Pessoa o) {
        if(this.getCpf() > o.getCpf()) {
            return 1;
        } else if(this.getCpf() < o.getCpf()) {
            return -1;
        } else {
            return 0;
        }
    }
    
    
    
}
