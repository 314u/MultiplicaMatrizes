package Matriz;
/**
 *
 * @author PYU
 */
public class Matriz {

    private final int matriz[][];

    public Matriz(int l, int c) {
        this.matriz = new int[l][c];
        for (int[] mt : this.matriz) {
            for (int j = 0; j < mt.length; j++) {
                mt[j] = (int) (Math.round(Math.random() * 3));
            }
        }
    }

    public Matriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public void imprime() {
        for (int[] mt : this.matriz) {
            System.out.println("\n");
            for (int j = 0; j < mt.length; j++) {
                System.out.printf("%d|", mt[j]);
            }
        }
        System.out.println("");
    }

//    public Matriz multiplicaMatriz(Matriz b) {
//    if(this.getMatriz()[0].length != b.getMatriz().length)throw new RuntimeException("Dimensões inconsistentes. Impossível multiplicar as matrizes");
//    
//    int[][] _1 = this.getMatriz();
//    int[][] _2 = b.getMatriz();
//    
//    int[][] result = new int[this.getMatriz().length][b.getMatriz()[0].length];
//
//
//    for (int i = 0; i < this.getMatriz().length; i++)
//        for (int j = 0; j < b.getMatriz()[0].length; j++) 
//            for (int k = 0; k < this.getMatriz()[0].length; k++) 
//                result[i][j] += (_1[i][k] * _2[k][j]);
//    
//    Matriz m = new Matriz(result);
//    return m;
//}
    public Matriz multiplicaMatriz(Matriz b) throws InterruptedException {
        if (this.getMatriz()[0].length != b.getMatriz().length) {
            throw new RuntimeException("Dimensões inconsistentes. Impossível multiplicar as matrizes");
        }

        int[][] _1 = this.getMatriz();
        int[][] _2 = b.getMatriz();

        int[][] result = new int[this.getMatriz().length][b.getMatriz()[0].length];

        for (int i = 0; i < this.getMatriz().length; i++) {
            for (int j = 0; j < b.getMatriz()[0].length; j++) {
                MultiplicaMatriz t = new MultiplicaMatriz(_1[i],b.retornaColuna(b, j));
                new Thread(t).start();
                Thread.sleep(100);
                result[i][j]=t.getValor();
            }
        }

        Matriz m = new Matriz(result);
        return m;
    }

    public int[] retornaColuna(Matriz m, int c) {
        int[][] aux = m.getMatriz();
        int[] v = new int[aux.length];
        for (int i = 0; i < aux[c].length; i++) {
            v[i] = aux[i][c];
        }
        return v;
    }

    /**
     * @return the matriz
     */
    protected int[][] getMatriz() {
        return matriz;
    }

}
