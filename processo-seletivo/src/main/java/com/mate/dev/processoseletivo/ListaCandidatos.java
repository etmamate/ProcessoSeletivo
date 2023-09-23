package com.mate.dev.processoseletivo;

import java.util.ArrayList;

public class ListaCandidatos {
    ArrayList<Candidatos> listaCandidatos;
    int maximo = 10;
    int maximo_aprovados = 5;

    public void ListaCand(){
        this.listaCandidatos = new ArrayList<>();   
    }
    void recebeCandidatos(Candidatos novoCandidatos){
        if(listaCandidatos.size() != 10){
            listaCandidatos.add(novoCandidatos);
        }else{
            System.out.println("MAXIMO DE CANDIDATOS ATINGIDO!!!");
        }
    }
    
    void candidatoAprovado(){
        System.out.println("Candidatos APROVADOS: ");
        for(Candidatos lista_candidatos : listaCandidatos){
            lista_candidatos.Aprovados();
        }
    }
    void candidatoContraproposta(){
        System.out.println("Candidatos com CONTRA PROPOSTA: ");
        for(Candidatos lista_candidatos : listaCandidatos){
            lista_candidatos.contraProposta();
        }   
    }
}
