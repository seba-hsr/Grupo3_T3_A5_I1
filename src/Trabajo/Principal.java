/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo;

/**
 *
 * @author PC_14
 */
public class Principal {

    public static void main(String[] args) {
        Vistas.FrmVista $objVista = new Vistas.FrmVista();
        Modelos.Modelo $objModelo = new Modelos.Modelo($objVista);
        $objVista.setVisible(true);
        System.out.println("AMO A LA MARUSWDHA");
    }
    
}
