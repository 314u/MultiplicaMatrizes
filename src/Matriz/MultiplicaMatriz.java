/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriz;

/**
 *
 * @author PYU
 */
public class MultiplicaMatriz implements Runnable {

    private final int[]l;
    private final int[]c;
    private int valor;

    public MultiplicaMatriz(int[] a, int[] b) {
        this.l=a;
        this.c=b;
    }

    @Override
    public void run() {
        int aux=0;
        for (int i = 0; i < l.length; i++) {
            aux+=this.l[i]*this.c[i];
        }
        this.valor=aux;
    }

    /**
     * @return the valor
     */
    protected int getValor() {
        return valor;
    }

}
