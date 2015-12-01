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
public class diferencia_matrices {

    public double[][] DiferenciaMatrices(double[][] matriz1, double[][] matriz2, int tami,int tamj ){
        double[][] matrizRes=null;
        
        
        matrizRes= new double[tami][tamj];
        for (int i = 0; i < tami; i++) {
            for (int j = 0; j < tamj; j++) {             
                matrizRes[i][j]=matriz1[i][j]-matriz2[i][j]; 
            }
        }
              
  
        return matrizRes;
    }
}
