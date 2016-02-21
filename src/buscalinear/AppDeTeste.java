/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscalinear;

/**
 *
 * @author Eric Farias
 */

import java.util.Scanner;

public class AppDeTeste {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int []v = {76,4,23,12,4,2,53,1,45,7,57,57,37,4,32,1,5,75,3,65,45,1,23,4,5,};
        
        System.out.print("Informe um valor para ser buscado: ");
        int n = input.nextInt();
        
        System.out.print("O indice desse valor é: " + BuscaLinear.buscar(n, v));
    }
}
