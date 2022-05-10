package br.com.banco.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import lombok.Data;


@Data
@Entity
@Table(name= "transferencia")
public class Operation implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "id")
    private Long id;

  
    @Column(name="data_transferencia", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date data_transferencia;            //not null


    @Column(name="valor",precision=20, scale=2)
    private BigDecimal valor;
    

    @Column(name="tipo",nullable = false, length= 15)
    private String tipo;                    //not null / size 15
    
    @Column(name="nome_operador_transacao", length=50)
    private String nome_operador_transacao; // size 50
    
   
    @ManyToOne
    @JoinColumn(name = "conta_id", nullable = false )
    private Conta conta;               //fk contas

    public Operation(){

    }

    public Operation(Long id, Date data_transferencia, BigDecimal valor, String tipo, String nome_operador_transacao, Conta conta){
        this.id = id;
        this.data_transferencia = data_transferencia;
        this.valor = valor;
        this.tipo = tipo;
        this.nome_operador_transacao = nome_operador_transacao;
        this.conta = conta;
    }



    
}
