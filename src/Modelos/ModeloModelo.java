/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

public class ModeloModelo {
    private int $tam;
    int vector[];
    public void set$tam(int _tam) {
        this.$tam = _tam;
    }
    public void setVector(int[] _vector) {
        this.vector = _vector;
    }
    public int get$tam() {
        return $tam;
    }
    public int[] getVector() {
        return vector;
    }
    int NumMayor(){
        int n = 0;
        for (int a = 0; a < this.vector.length; a++){
            if (vector[a] < n){
                n = vector[a];
            }
        }
        return n;
    }
}
