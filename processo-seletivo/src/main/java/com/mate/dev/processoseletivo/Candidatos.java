package com.mate.dev.processoseletivo;

public class Candidatos {
    String nome;
    double salarioProposto;
    double salarioBase = 2000.00;

    public Candidatos() {

    }

    public Candidatos(String nome, double salarioProposto) {
        setNome(nome);
        setSalarioProposto(salarioProposto);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioProposto() {
        return salarioProposto;
    }

    public void setSalarioProposto(double salarioProposto) {
        this.salarioProposto = salarioProposto;
    }

    void listar() {
        System.out.println("\nNome: " + this.nome);
    }

    void Aprovados() {
        if (salarioProposto < salarioBase) {
            System.out.println("Ligar para o candidato " + this.nome + " APROVADO!\n");
        }
    }

    void listarAprovados(){
        System.out.println(nome + " Situação: Aprovado" );
    }
    void contraProposta() {
        if (salarioProposto > salarioBase) {
            System.out.println("Ligar para o candidato" + this.nome + "com uma contra proposta \n");
        }
    }

    public void listarCandidatosGeral() {
    }
}