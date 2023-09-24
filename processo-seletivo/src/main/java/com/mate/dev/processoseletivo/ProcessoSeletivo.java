package com.mate.dev.processoseletivo;

import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double salarioBase = 2200.00;
        double salarioProposto;
        String nome;
        Candidatos novoCandidato = new Candidatos();
        ListaCandidatos lista_Candidatos = new ListaCandidatos();
        int opcao;
        String breakline = "-".repeat(12);

        do {
            System.out.println("\n Processo Seletivo - ");
            System.out.println(breakline);
            System.out.println("1 - Cadastrar Candidato");
            System.out.println("2 - Listar Canditatos");
            System.out.println("3 - Mostrar Situação do Processo de Candidato");
            System.out.println("0 - Sair");
            System.out.println(breakline);
            opcao = scn.nextInt();
            switch (opcao) {
                case 1:

                    System.out.println("Insira o nome do candidato: ");
                    nome = scn.next();
                    System.out.println("Insira seu salario proposto: ");
                    salarioProposto = scn.nextDouble();
                    
                    novoCandidato = new Candidatos(nome, salarioProposto);
                    lista_Candidatos.recebeCandidatos(novoCandidato);

                    System.out.println("Candidato Cadastrado!");
                    break;

                case 2:

                    lista_Candidatos.listarCandidatosGeral();
                    break;

                default:
            }
        } while (opcao != 0);
        scn.close();
    }
}