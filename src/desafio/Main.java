/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;
import javax.swing.JOptionPane;
import desafio.AgregarMateriales;
import desafio.MiTabla.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.ArrayList;
import desafio.MiTabla;
import desafio.ModeloTabla;

/**
 *
 * @author Jorge LG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int option;
        AgregarMateriales registro = new AgregarMateriales();
        MiTabla frame = new MiTabla(new ArrayList<>());
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:\n" +
                    "1. Agregar Material\n" +
                    "2. Modificar Material\n" +
                    "3. Lista de Materiales disponibles\n" +
                    "4. Borrar Material\n" +
                    "5. Buscar Material\n"+
                    "6. Salir\n"));
            switch (option){
                    case 1 :
                        frame.setVisible(false);
                        
                        int material;
                        do {        
                        material = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:\n" +
                    "1. Agregar libro\n" +
                    "2. Agregar revista\n" +
                    "3. Agregar CD\n" +
                    "4. Agregar DVD\n" +
                    "5. Regresar al menu anterior\n"));
                        
                            if (material<5) {
                                registro.registroMateriales(material);
                            } 
                        } while(material !=5);   
                                                  
                        break;
                    case 2:
//                        Modificar material
                        break;
                    case 3:
                        ArrayList<Material> materiales =new ArrayList<>(registro.getLista());
                        frame = new MiTabla(materiales);
                        frame.setVisible(true);
                        break;
                    case 4:
//                        Borrar Material
                        break;
                    case 5:
//                        Buscar Material
                        break;
                    case 6:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida, seleccione nuevamente.","Advertencia",JOptionPane.WARNING_MESSAGE);
                        break;                     
            }
                        
                        
        } while (option != 6);
        
    }
    
}
