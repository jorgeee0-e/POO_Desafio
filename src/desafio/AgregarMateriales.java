/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

import java.util.*;
import desafio.AgregarMateriales;
import java.time.LocalTime;
import javax.swing.JDialog;
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
                String yearString = JOptionPane.showInputDialog("Ingrese el año");
                while(yearString.isEmpty()|| !isNumeric(yearString)) {
                    JOptionPane optionPane = new JOptionPane("Año no válido", JOptionPane.ERROR_MESSAGE);    
                    JDialog dialog = optionPane.createDialog("Failure");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    yearString = JOptionPane.showInputDialog("Ingrese el año");
                }
                int year = Integer.parseInt(yearString);
                String unidadesString = JOptionPane.showInputDialog("Ingrese el numero de unidades");
                while(unidadesString.isEmpty()|| !isNumeric(unidadesString)) {
                    JOptionPane optionPane = new JOptionPane("Unidad no válida", JOptionPane.ERROR_MESSAGE);    
                    JDialog dialog = optionPane.createDialog("Failure");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    unidadesString = JOptionPane.showInputDialog("Ingrese el numero de unidades");
                }
                int unidades = Integer.parseInt(unidadesString);
                String pagsString = JOptionPane.showInputDialog("Ingrese el numero de páginas del libro");
                while(pagsString.isEmpty()|| !isNumeric(pagsString)) {
                    JOptionPane optionPane = new JOptionPane("Número de páginas no válida", JOptionPane.ERROR_MESSAGE);    
                    JDialog dialog = optionPane.createDialog("Failure");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    pagsString = JOptionPane.showInputDialog("Ingrese el numero de páginas del libro");
                }
                int pags = Integer.parseInt(pagsString);
                id = "LIB" + id;
                listaMaterial.add(new Libro(autor,pags, editorialL,ISBN, year, unidades, L2, hierarchy, id, titulo ));
                JOptionPane.showMessageDialog(null, "Libro registrado exitosamente","Registro Exitoso",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                hierarchy = "Revista";
                L2="Material Escrito";
                String editorialR = JOptionPane.showInputDialog("Ingrese el editorial");               
                String period = JOptionPane.showInputDialog("Ingrese cada cuanto tiempo se publica");
                String dateSTR = JOptionPane.showInputDialog("Ingrese la fecha de publicación. Formato dd-mm-yyyy");                 
                Date date = utilities.parseDate(dateSTR);
                while(date == null) {
                    dateSTR = JOptionPane.showInputDialog("Ingrese la fecha de publicación. Formato dd-mm-yyyy");                 
                    date = utilities.parseDate(dateSTR);
                }
                String unitsString = JOptionPane.showInputDialog("Ingrese el numero de unidades");
                while(unitsString.isEmpty()|| !isNumeric(unitsString)) {
                    JOptionPane optionPane = new JOptionPane("Número de páginas no válida", JOptionPane.ERROR_MESSAGE);    
                    JDialog dialog = optionPane.createDialog("Failure");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    unitsString = JOptionPane.showInputDialog("Ingrese el numero de unidades");
                }
                int units = Integer.parseInt(unitsString);
                id = "REV" + id;
                listaMaterial.add(new Revista(editorialR, period, date,units,L2,hierarchy,id,titulo));
                JOptionPane.showMessageDialog(null, "Revista registrado exitosamente","Registro Exitoso",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                hierarchy = "CD";
                L2="Material Audiovisual"; 
                String artist = JOptionPane.showInputDialog("Ingrese el artista");  
                String genero = JOptionPane.showInputDialog("Ingrese el genero");  
                String duracionStr = JOptionPane.showInputDialog("Ingrese la duracion. Formato HH:mm:ss");                 
                LocalTime duracion = utilities.parseDuracion(duracionStr);
                while(duracion == null) {
                    duracionStr = JOptionPane.showInputDialog("Ingrese la duracion. Formato HH:mm:ss");                 
                    duracion = utilities.parseDuracion(duracionStr);
                }
                String cancionesString = JOptionPane.showInputDialog("Ingrese el numero de canciones del disco");
                while(cancionesString.isEmpty()|| !isNumeric(cancionesString)) {
                    JOptionPane optionPane = new JOptionPane("Numero de canciones no válida", JOptionPane.ERROR_MESSAGE);    
                    JDialog dialog = optionPane.createDialog("Failure");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    cancionesString = JOptionPane.showInputDialog("Ingrese el numero de canciones del disco");
                }
                int canciones = Integer.parseInt(cancionesString);
                String unidadesCString = JOptionPane.showInputDialog("Ingrese el numero de unidades");
                while(unidadesCString.isEmpty()|| !isNumeric(unidadesCString)) {
                    JOptionPane optionPane = new JOptionPane("Unidad no válida", JOptionPane.ERROR_MESSAGE);    
                    JDialog dialog = optionPane.createDialog("Failure");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    unidadesCString = JOptionPane.showInputDialog("Ingrese el numero de unidades");
                }
                int unidadesC = Integer.parseInt(unidadesCString);
                id = "CDA" + id;
                listaMaterial.add(new CD(artist, genero, duracion, canciones, unidadesC, L2, hierarchy, id, titulo));
                JOptionPane.showMessageDialog(null, "CD registrado exitosamente","Registro Exitoso",JOptionPane.INFORMATION_MESSAGE); 
                break;
            case 4:
                hierarchy = "DVD";
                L2="Material Audiovisual"; 
                String director = JOptionPane.showInputDialog("Ingrese el director");
                String duracionStrD = JOptionPane.showInputDialog("Ingrese la duracion. Formato HH:mm:ss");                 
                LocalTime duracionD = utilities.parseDuracion(duracionStrD);
                while(duracionD == null) {
                    duracionStrD = JOptionPane.showInputDialog("Ingrese la duracion. Formato HH:mm:ss");                 
                    duracionD = utilities.parseDuracion(duracionStrD);
                }
                String generoD= JOptionPane.showInputDialog("Ingrese el genero");                  
                id = "DVD" + id;
                listaMaterial.add(new DVD(director, duracionD, generoD, L2, hierarchy, id, titulo));
                JOptionPane.showMessageDialog(null, "DVD registrado exitosamente","Registro Exitoso",JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
               break;
        }     
    }
    
    public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Double.parseDouble(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }
    
    public ArrayList<Material> getLista(){
        return listaMaterial;
    }
    
}
