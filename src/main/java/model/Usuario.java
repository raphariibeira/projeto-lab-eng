/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author fabricio
 */

@Entity(name="usuario")
public class Usuario {
    @Id   
    private  long id;
    @Column(name="nome")
    private  String nome;       
    public Usuario(){}
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }  
}
