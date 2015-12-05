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
public class transpuesta_matrices {

    public transpuesta_matrices() {
    }
    
    public double[][] TranpuestaMatriz(double[][] matriz, int x, int y){
        double [][] transpuesta = new double[y][x] ;
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                transpuesta[j][i]=matriz[i][j];
            }
            
        }
         return transpuesta;
    } 
}
