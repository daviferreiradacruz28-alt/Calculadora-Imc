package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Pessoa p = new Pessoa();
        Calculadora c = new Calculadora();
        while (true) {
            System.out.println("======= CALCULADORA =======");
            
            System.out.println("1 - Cadastrar\n2 - Calcular meu IMC\n3 - Classificar meu Imc\n4 - Ver Perfil\n5 - Resetar\n0 - Sair");
            System.out.print("Escolha uma opcao: ");
            int opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                 p.cadastrar();
                break;
                
                case 2:
                 c.calcularImc(p);
                break;
                
                case 3:
                 c.classificarSeuImc(p);
                break;
                
                case 4:
                 p.verPerfil();
                break;
                
                case 5:
                 p.resetarPerfil();
                break;
                
                case 0:
                 System.out.println("Saindo...");
                 return;
                
                default:
                 System.out.println("Opcao invalida!");
            }
        }
    }
}