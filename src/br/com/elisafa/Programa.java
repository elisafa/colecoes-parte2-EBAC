package br.com.elisafa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando listas para armazenar homens e mulheres
        List<String> homens = new ArrayList<>();
        List<String> mulheres = new ArrayList<>();

        while (true) {
            // Lendo o nome
            System.out.print("Digite o nome (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();

            // Verificando se o usuário quer sair
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            // Lendo o sexo
            System.out.print("Digite o sexo (M para Masculino, F para Feminino): ");
            String sexo = scanner.nextLine();

            // Verificando e separando por grupo
            if (sexo.equalsIgnoreCase("M")) {
                homens.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                mulheres.add(nome);
            } else {
                System.out.println("Sexo inválido! Tente novamente.");
            }

            System.out.println();
        }

        // Exibindo os grupos
        System.out.println("Grupo Masculino: " + homens);
        System.out.println("Grupo Feminino: " + mulheres);

        scanner.close();
    }
}
