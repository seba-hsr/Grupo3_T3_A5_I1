/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Vistas.FrmAyuda;
import Vistas.FrmVista;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 *
 * @author PC_14
 */
public class Modelo implements ActionListener{
    private Vistas.FrmVista $Vista;
    private Modelo $Modelo;
    private Vistas.FrmAyuda $Ayuda;
    private Vistas.FrmCrearVector $Vector;
    private Vistas.FrmingresoDatos $Datos;

    public Modelo(FrmVista _Vista) {
        this.$Vista = _Vista;
        $Ayuda = new Vistas.FrmAyuda();
        this.$Vista.itemAcerca.addActionListener(this);
        this.$Vector.btnCrearVector.addActionListener(this);
        this.$Vector.btnCerrarVentanaCrearVector.addActionListener(this);
        this.$Datos.btnenvtam.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        
        if (evt.getSource() == this.$Vista.itemAcerca){
            $Ayuda.setVisible(true);
        }
        if (evt.getSource() == this.$Vista.vectro){
            $Vector.setVisible(true);
        }
        if (evt.getSource() == this.$Vista.datos){
            $Vector.setVisible(true);
        }
        
        
    }
}
