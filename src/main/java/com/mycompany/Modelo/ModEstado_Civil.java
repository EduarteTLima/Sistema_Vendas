/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Modelo;

/**
 *
 * @author eduardo.3946
 */
public class ModEstado_Civil {
private int id;
    String nome;

    public ModEstado_Civil(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public ModEstado_Civil() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "ModEstadoCivil{" + "id=" + id + ", nome=" + nome + '}';
    }
}
