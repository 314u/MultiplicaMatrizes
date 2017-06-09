package main;

import Matriz.Matriz;
import java.util.Scanner;

/**
 *
 *    0x3 + 2x2 = 4
 *   0x2 + 2x2 = 2
 *     
 * 
 * 
 * @author PYU
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        int l1, c1, l2, c2;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a quantidade de linhas da matriz 1 : ");
        l1 = ler.nextInt();
        System.out.println("Digite a quantidade de colunas da matriz 1 : ");
        c1 = ler.nextInt();
        System.out.println("Digite a quantidade de linhas da matriz 2 : ");
        l2 = ler.nextInt();
        System.out.println("Digite a quantidade de colunas da matriz 2 : ");
        c2 = ler.nextInt();
        Matriz _1 = new Matriz(l1, c1);
        Matriz _2 = new Matriz(l2, c2);
        
        Matriz r = _1.multiplicaMatriz(_2);
        _1.imprime();
        _2.imprime();
        r.imprime();
    }
}
