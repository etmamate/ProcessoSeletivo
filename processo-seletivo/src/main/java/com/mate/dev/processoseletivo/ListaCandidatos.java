package com.mate.dev.processoseletivo;

import java.util.ArrayList;

public class ListaCandidatos {
    ArrayList<Candidatos> listaCandidatos = new ArrayList<>(5);
    int maximo = 10;
    int maximo_aprovados = 5;

    public void ListaCand() {
        this.listaCandidatos = new ArrayList<>();
    }

    void recebeCandidatos(Candidatos novoCandidatos) {
        if (listaCandidatos.size() != 10) {
            listaCandidatos.add(novoCandidatos);
        } else {
            System.out.println("MAXIMO DE CANDIDATOS ATINGIDO!!!");
        }
    }

    void listarCandidatosGeral() {
        System.out.println("Candidatos Registrados: ");
        for (Candidatos listarCandidatos : listaCandidatos) {
            listarCandidatos.listarCandidatosGeral();
        }
    }

    void candidatoAprovado() {
        System.out.println("Candidatos APROVADOS: ");
        for (Candidatos lista_candidatos : listaCandidatos) {
            lista_candidatos.Aprovados();
        }
    }

    void candidatoContraproposta() {
        System.out.println("Candidatos com CONTRA PROPOSTA: ");
        for (Candidatos lista_candidatos : listaCandidatos) {
            lista_candidatos.contraProposta();
        }
    }
}
