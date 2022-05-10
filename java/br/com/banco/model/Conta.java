package br.com.banco.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name="conta")
public class Conta implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_conta")
    private Long id_conta;                        //primary key

    
    @Column(name="nome_responsavel", length=50)
    private String nome_responsavel; //size 50

    public Conta(Long id_conta, String nome_responsavel){
        this.id_conta = id_conta;
        this.nome_responsavel = nome_responsavel;
    }

    public Conta(){
        
    }
    
}
