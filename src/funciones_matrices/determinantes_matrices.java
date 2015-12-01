/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones_matrices;

/**
 *
 * @author edson
 */
public class determinantes_matrices {

    public determinantes_matrices() {
    }
    
    public double DeterminanteMatriz( double[][] matriz){
        double determinante=0;
        int c_col, c_fila;
        c_col=0;
        c_fila=0;
        if (matriz.length==2) {
            determinante = matriz[0][0]*matriz[1][1]-matriz[0][1]*matriz[1][0];
        } else{
            for (int i = 0; i < 10; i++) {
                    
            }
        }
        
        
        return determinante;
    }
}
