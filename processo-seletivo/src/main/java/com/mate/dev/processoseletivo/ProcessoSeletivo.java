package com.mate.dev.processoseletivo;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();

    }

    static void selecaoCandidatos() {
        String[] candidatos = { "MATEUS", "ANA", "JULIA", "FERNANDO", "TOMAS", "PEDRO", "MAURICIO", "VITOR", "DANNILO",
                "RODRIGO" };
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String canditado = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O CANDIDATO " + canditado + " Solicitou esse valor de salario: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O Candidato " + canditado + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.00;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM UMA CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}