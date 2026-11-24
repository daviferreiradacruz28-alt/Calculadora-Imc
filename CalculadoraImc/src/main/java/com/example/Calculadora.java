package com.example;
import java.util.Scanner;

public class Calculadora {
    Scanner sc = new Scanner(System.in);
    
    public void calcularImc(Pessoa p) {
        if (p.getCadastrado()) {
            double cal = p.getPeso() / (p.getAltura() * p.getAltura());
            p.imcRecebe(cal);
            
            System.out.printf("IMC: %.2f", p.getImc());
            System.out.println();
            
            p.jaCalculouVirarTrue();
        } else {
            System.out.println("Voce nao esta cadastrado!");
        }
    }
    
    public void classificarSeuImc(Pessoa p) {
        if (p.getCadastrado() && p.getJaCalculou()) {
            if (p.getImc() < 18.5) {
                p.classificacaoRecebe("Abaixo do peso");
            } else if (p.getImc() < 25) {
                p.classificacaoRecebe("Peso normal");
            } else if (p.getImc() < 30) {
                p.classificacaoRecebe("Sobrepeso");
            } else if (p.getImc() < 35) {
                p.classificacaoRecebe("Obesidade grau I");
            } else if (p.getImc() < 40) {
                p.classificacaoRecebe("Obesidade grau II");
            } else {
                p.classificacaoRecebe("Obesidade grau III");
            }
        } else {
            System.out.println("Voce nao calculou seu IMC ainda, ou nao esta cadastrado em nosso sistema.");
        }
    }
}