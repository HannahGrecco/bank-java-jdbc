package br.sesi.bank.bank_java_jdbc.domain.cliente;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;

    public Cliente(DadosCadastroCliente dados){
        this.nome=dados.nome;
        this.cpf=dados.cpf;
        this.email=dados.email;
    }
    public String getNome(){
        return this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public String getEmail(){
        return this.email;
    }
    public boolean equals(){
        return true;
    }
    public int hashCode (){
        return 0;
    }
}
