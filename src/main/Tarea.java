/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import formularios.Menu;
import formularios.NuevoEquipo;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author adawolfs
 */
public class Tarea {

    /**
     * @param args the command line arguments
     */
    
    public static Map<String,Equipo> elements = new HashMap<String,Equipo>();
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.setVisible(true);
    }
    
}
