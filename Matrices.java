package matrices;

import matrices.matriz.*;
import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        int mat1[][] = new int[0][0];
        int mat2[][] = new int[0][0];
        int res[][];
        int fil1,col1,fil2,col2;
        
        ///definimos las matriz 1
        Scanner ent = new Scanner(System.in);
        System.out.println("ingrese la fila de la matriz 1:");
        fil1  = ent.nextInt();
        System.out.println("ingrese la columna de la matriz 2");
        col1 = ent.nextInt();
        ///creamos un objeto matriz
        matriz mat11 = new matriz();
        
        mat11.matriz(mat1);///inicializamos la matriz
        mat11.matriz(fil1, col1);
        
        System.out.println("cargamos la matriz 1");
        mat11.cargarMatriz();
        mat11.mostrarMatriz();
        ///definimos la matriz 2
        System.out.println("ingrese la fila de la matriz 2");
        fil2 = ent.nextInt();
        System.out.println("ingrese la columna de la matriz 2");
        col2 = ent.nextInt();
        
        matriz mat22 = new matriz();
        mat22.matriz(mat2);
        mat22.matriz(fil2,col2);
        
        System.out.println("cargamos la segunda matriz");
        mat22.cargarMatriz();
        mat22.mostrarMatriz();
        
        ///verificamos que se pueda hacer el producto
        if(col1 != fil2)
           throw new RuntimeException("no se puede multiplicar");
        res = new int[fil1][col2];
        mat11.productoDeMatrices(mat22, res);
        
        matriz result = new matriz();
        result.matriz(res);
        System.out.println("mostramos la matriz resultado");
        
        result.mostrarMatriz();
    }
}
