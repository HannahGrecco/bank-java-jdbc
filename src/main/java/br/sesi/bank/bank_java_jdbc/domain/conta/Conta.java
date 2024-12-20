package br.sesi.bank.bank_java_jdbc.domain.conta;

import br.sesi.bank.bank_java_jdbc.domain.cliente.Cliente;

import java.math.BigDecimal;
import java.util.Objects;

public class Conta {
    private Integer numero;
    private BigDecimal valor;
    private Cliente titular;
    private boolean ativo;

    public Conta(Integer numero, BigDecimal valor, Cliente titular, Boolean ativo){
        this.numero = numero;
        this.valor = valor;
        this.titular = titular;
        this.ativo = ativo;
    }
    public boolean possuiSaldo(){
        return this.valor.compareTo(BigDecimal.ZERO) !=0;
    }
    public void sacar (BigDecimal valor){
        this.valor = this.valor.subtract(valor);
    }
    public void depositar(BigDecimal valor){
        this.valor = this.valor.add(valor);
    }
    public Integer getNumero(){
        return numero;
    }
    public BigDecimal getSaldo(){
        return valor;
    }
    public Cliente getTitular(){
        return titular;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return numero.equals(conta.numero);
    }
    public int hashCode(){
        return Objects.hash(numero);
    }
    @Override
    public String toString(){
        return "Conta{" +
                "numero='" + numero + '\'' +
                ", saldo=" + valor +
                ",titular" + titular +
                '}';


    }
    public boolean isAtivo(){
        return ativo;
    }
    public void setAtivo (boolean ativo){
        this.ativo = ativo;
    }
}
