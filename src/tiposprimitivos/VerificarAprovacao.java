/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;
import java.util.Scanner;
/**
 *
 * @author jyjun
 */
// Algoritmo de Verificação de aprovação com média de 4 bimestres com entrada System.in e saida System.out
public class VerificarAprovacao {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o Nome do Aluno: ");
        String nomeAluno = entrada.nextLine();
        System.out.println("Digite a Nota do Primeiro Bimestre: ");
        Float nota1 = entrada.nextFloat();
        System.out.println("Digite a Nota do Segundo Bimestre: ");
        Float nota2 = entrada.nextFloat();
        System.out.println("Digite a Nota do Terceiro Bimestre: ");
        Float nota3 = entrada.nextFloat();
        System.out.println("Digite a Nota do Quarto Bimestre: ");
        Float nota4 = entrada.nextFloat();
        Float media = (nota1 + nota2 + nota3 + nota4) /4;
        if (media >= 7.0) {
            System.out.println("O Aluno " + nomeAluno + " foi aprovado com a média " + media);            
        }else{
            System.out.println("O Aluno " + nomeAluno + " foi reprovado com a média " + media);
        }
        
        
        
    }
}
