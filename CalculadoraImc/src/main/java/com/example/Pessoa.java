package com.example;
import java.util.Scanner;

public class Pessoa {
    Scanner sc = new Scanner(System.in);
    private String nome;
    private double peso;
    private double altura;
    private double imc;
    private String classificacao;
    private boolean jaCalculou;
    private boolean cadastrado;
    private boolean jaClassificou;
    
    public void cadastrar() {
        System.out.println("======= CADASTRAR ======");
        
        System.out.print("Nome: ");
        this.nome = sc.nextLine();
        
        System.out.print("Peso: ");
        this.peso = sc.nextDouble();
        
        System.out.print("Altura: ");
        this.altura = sc.nextDouble();
        
        this.cadastrado = true;
        
        System.out.println("Cadastrado!");
    }
    
    public void verPerfil() {
        System.out.println("====== PERFIL ======");
        
        if (this.cadastrado) {
            System.out.println("Nome: "+this.nome);
            System.out.println("Peso: "+this.peso+"KG");
            System.out.println("Altura: "+this.altura+"CM");
            
            if (this.jaCalculou) {
                System.out.printf("IMC: %.2f", this.imc);
                System.out.println();
            } else {
                System.out.println("IMC: Voce ainda nao calculou seu IMC.");
            }
            
            if (this.jaClassificou) {
                System.out.println("Class: "+this.classificacao);
            } else {
                System.out.println("Class: Voce ainda nao classificou seu peso");
            }
            
        } else {
            System.out.println("Voce nao esta cadastrado!");
        }
    }
    
    public void imcRecebe(double rec) {
        this.imc = rec;
    }
    
    public void classificacaoRecebe(String rec) {
        this.classificacao = rec;
        System.out.println("Voce recebeu: "+rec);
        this.jaClassificou = true;
    }
    
    public void resetarPerfil() {
        if (this.cadastrado) {
            this.nome = " ";
            this.altura = 0;
            this.peso = 0;
            this.imc = 0;
            this.classificacao = " ";
            this.cadastrado = false;
            this.jaCalculou = false;
            this.jaClassificou = false;
            
            System.out.println("Nome: "+this.nome);
            System.out.println("Altura: "+this.altura);
            System.out.println("Peso: "+this.peso);
            System.out.println("IMC: "+this.imc);
            System.out.println("Class: "+this.classificacao);
            System.out.println("Cadastrado: "+this.cadastrado);
            System.out.println("Ja calculou IMC: "+this.jaCalculou);
            System.out.println("Ja classificou o IMC: "+this.jaClassificou);
        } else {
            System.out.println("Voce nem tem conta para resetar");
        }
    }
    
    public void jaCalculouVirarTrue() {
        this.jaCalculou = true;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public double getPeso() {
        return this.peso;
    }
    
    public double getAltura() {
        return this.altura;
    }
    
    public double getImc() {
        return this.imc;
    }
    
    public boolean getCadastrado() {
        return this.cadastrado;
    }
    
    public String getClassificacao() {
        return this.classificacao;
    }
    
    public boolean getJaCalculou() {
        return this.jaCalculou;
    }
    
    public boolean getJaClassificou() {
        return this.jaClassificou;
    }
}