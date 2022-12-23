
package matrices;
import java.util.Scanner;

public class matriz{
    private int[][] matriz;

    public int[][] getMatriz() {
        return matriz;
    }
    
    public void matriz(int mat[][]){
        this.matriz = mat;
    }
    public void matriz(int filas_,int columnas_){
        this.matriz = new int[filas_][columnas_];
    }
    public void cargarMatriz(){
        int i,j;
        Scanner lectura = new Scanner(System.in);
        for(i = 0;i<this.matriz.length;i++){
            for(j =0 ;j<this.matriz[0].length;j++){
                System.out.println("matriz["+i+"]["+j+"]:");
                this.matriz[i][j] = lectura.nextInt();
            }
        }
    }
    public void mostrarMatriz(){
        int i,j;
        for(i = 0;i<this.matriz.length;i++){
            for(j = 0;j<this.matriz[0].length;j++){
                System.out.print("["+this.matriz[i][j]+"]\t");
            }
            System.out.println();
        }
    } 
    public boolean esIdentidad(){
        
        int i,j;
        for(i = 0;i<this.matriz.length;i++){
            if(this.matriz[i][i] != 1)
                return false;
            for(j = 0;j<this.matriz[0].length;j++){
                if(j!=i)
                    if(this.matriz[i][j]!=0)
                        return false;
            }
        }
        return true;
        
    }
    public boolean esDiagonal(){
         int i,j;
        for(i = 0;i<this.matriz.length;i++){
            if(this.matriz[i][i] == 0)
                return false;
            for(j = 0;j<this.matriz[0].length;j++){
                if(j!=i)
                    if(this.matriz[i][j]!=0)
                        return false;
            }
        }
        return true;
    }
    public boolean esSimetrica(){
        int i,j;
        if(this.matriz[0].length!=this.matriz.length)
            return false;
        for(i = 0;i<this.matriz.length-1;i++)
            for(j = i+1;j<this.matriz[0].length;j++)
                if(this.matriz[i][j]!=this.matriz[j][i])
                    return false;
        return true;
    }
    public void trasponerFilasXColumnas(){
        int i,j,aux;
        for(i = 0;i<this.matriz.length-1;i++){
            for(j = i+1;j<this.matriz[0].length;j++){
                aux = this.matriz[i][j];
                this.matriz[i][j] = this.matriz[j][i];
                this.matriz[j][i] = aux;
            }
        }
    }
    
    
    
    public void productoDeMatrices(matriz m2,int res[][]){
       int suma = 0;

        for(int i = 0;i<this.matriz.length;i++){
            for(int j = 0;j<m2.matriz[0].length;j++){
                for(int k = 0;k<m2.matriz.length;k++){
                   suma+=this.matriz[i][k]*m2.matriz[k][j];
                    System.out.println("suma:"+suma);
                           
                }
                res[i][j] = suma;
                suma = 0;
            }
        }
    }
    public int sumarPorDebajoDiagPrincipalIncluida(){
        int sumatoria = 0;
        for (int i = 0; i < this.matriz.length; i++) {
            for(int j = i;j>=0;j--)
                sumatoria+=this.matriz[i][j];
        }
        return sumatoria;
    }
    public int sumarPorArribaDiagonalPrincipalIncluida(){
        int sumatoria = 0;
        for(int i = 0;i<this.matriz.length;i++)
            for(int j = i;j<this.matriz[0].length;j++)
                sumatoria+=this.matriz[i][j];
        return sumatoria;
    }
    public int sumarTrazaDiagPrincipal(){
        int sumatoria = 0;
        for(int i =0 ;i<this.matriz.length;i++)
            sumatoria+=this.matriz[i][i];
        return sumatoria;
    }
    public void rotar90grados(int matR[][]){
        for(int i = 0;i<this.matriz.length;i++){
            for(int j = 0;j<this.matriz[0].length;j++)
                matR[i][j] = this.matriz[this.matriz[0].length-j-1][i]; 
        }
    }
}
