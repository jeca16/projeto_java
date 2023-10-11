package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {
    public void executarMenu(){

        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        do {
            System.out.println(" 1- cadastrar professor");
            System.out.println(" 2- cadastrar aluno");
            System.out.println(" 3- listar alunos");
            System.out.println(" 4- listar alunos");
            System.out.println(" 5- consultar notas");
            System.out.println(" 6- sair");

            int opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println(" cadastro prof");
                    break;
                case 2:
                    System.out.println(" cadastro aluno");
                    break;
                case 3:
                    System.out.println(" listar aluno");
                    break;
                case 4:
                    System.out.println(" listar professor");
                case 5:
                    System.out.println("notas");
                    break;
                case 6:
                    continuar = false;
                    break;
            }

        }while (continuar);

    }
}
