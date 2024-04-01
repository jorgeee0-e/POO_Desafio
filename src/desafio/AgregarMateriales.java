/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

import java.util.*;
import desafio.AgregarMateriales;
import java.time.LocalTime;
import javax.swing.JOptionPane;
/**
 *
 * @author Jorge LG
 */
public class AgregarMateriales {
    ArrayList <Material> listaMaterial = new ArrayList<>();
    public void registroMateriales(int tipo){
        String titulo = JOptionPane.showInputDialog("Ingrese el título del material a registrar");
        String id = JOptionPane.showInputDialog("Ingrese el id");
        String hierarchy, L2;
        
        switch (tipo) {
            case 1:
                hierarchy = "Libro";
                L2="Material Escrito";
                String autor = JOptionPane.showInputDialog("Ingrese el autor");
                String editorialL = JOptionPane.showInputDialog("Ingrese el editorial");
                String ISBN = JOptionPane.showInputDialog("Ingrese el ISBN");
                int year = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año"));
                int unidades = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de unidades"));
                int pags = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de páginas del libro"));
                listaMaterial.add(new Libro(autor,pags, editorialL,ISBN,year, unidades,L2,hierarchy,id,titulo ));
                JOptionPane.showMessageDialog(null, "Libro registrado exitosamente","Registro Exitoso",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                hierarchy = "Revista";
                L2="Material Escrito";
                String editorialR = JOptionPane.showInputDialog("Ingrese el editorial");               
                String period = JOptionPane.showInputDialog("Ingrese cada cuanto tiempo se publica");
                String date = JOptionPane.showInputDialog("Ingrese la fecha de publicación. Formato dd-mm-yyyy");
                int units = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de unidades"));  
                listaMaterial.add(new Revista(editorialR, period,date,units,L2,hierarchy,id,titulo));
                JOptionPane.showMessageDialog(null, "Revista registrado exitosamente","Registro Exitoso",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                hierarchy = "CD";
                L2="Material Audiovisual"; 
                String artist = JOptionPane.showInputDialog("Ingrese el artista");  
                String genero = JOptionPane.showInputDialog("Ingrese el genero");  
                String duracionStr = JOptionPane.showInputDialog("Ingrese la duracion. Formato HH:mm:ss");  
                int canciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de canciones del disco"));
                int unidadesC = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de unidades"));
                listaMaterial.add(new CD(artist, genero,  duracionStr, canciones, unidadesC,L2, hierarchy, id, titulo));
                JOptionPane.showMessageDialog(null, "CD registrado exitosamente","Registro Exitoso",JOptionPane.INFORMATION_MESSAGE); 
                break;
            case 4:
                hierarchy = "DVD";
                L2="Material Audiovisual"; 
                String director = JOptionPane.showInputDialog("Ingrese el director");
                String duracionStrD = JOptionPane.showInputDialog("Ingrese la duracion. Formato HH:mm:ss");  
                String generoD= JOptionPane.showInputDialog("Ingrese el genero");  
                listaMaterial.add(new DVD(director, duracionStrD, generoD,L2, hierarchy, id,titulo));
                JOptionPane.showMessageDialog(null, "DVD registrado exitosamente","Registro Exitoso",JOptionPane.INFORMATION_MESSAGE);
                break;
                
            default:
               break;
        }     
    }
    public ArrayList<Material> getLista(){
        return listaMaterial;
    }
    
}
