package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Professor extends Pessoas {

    Scanner scanner = new Scanner(System.in);

    public void cadastrarProfessor(){

        System.out.println(" por favor informe seu nome: ");
        super.nome = scanner.nextLine();
        System.out.println(" informe sua idade: ");
        super.idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" informe a materia: ");
        super.disciplina = scanner.nextLine();
        System.out.println(" informe seu genero");
        super.genero = scanner.nextLine();
    }

    List<Professor> listProfessor = new ArrayList<>();
    public void listarProfessor(){
        for (Professor professor:listProfessor) {
            System.out.println(super.nome);
            System.out.println(super.idade);

            
        }
    }
}
