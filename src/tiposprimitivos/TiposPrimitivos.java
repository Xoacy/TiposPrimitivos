/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

/**
 *
 * @author jyjun
 */
public class TiposPrimitivos {
    

    /**
     * @param args the command line arguments
     */
    // Verificação de aprovação de nota em algoritmo simples.
    public static void main(String[] args) {
        int nota1 = 1;
        int nota2 = 5;
        int media = nota1 + nota2;
        if (nota1 + nota2 >= 7) {
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
        
        
    }
    
}
