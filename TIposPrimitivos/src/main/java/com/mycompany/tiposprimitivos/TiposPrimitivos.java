package com.mycompany.tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s é %.2f \n",  nome, nota);
    }
}

/** TIPOS PRIMITIVOS
 * Inteiro: int idade = 3;
 * Real: float sal = 1825.54f;
 * Caracter: char letra = 'G';
 * String: String nome = "Irineu";
 * Boleano: boolean casado = false;
 */

/** SAIDA DE DADOS
 * Saida simples: System.out.print();
 * Saida com quebra de linha: System.out.println();
 * Saida com formatação: System.out.printf();
 * Saida com formatação2: System.out.format();
 */

// IMPORTANTE: Não esquecer do ';' no fim das comandos!!