/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;
import java.util.Date;


/**
 *
 * @author Jorge LG
 */
public class utilities {
     public static LocalTime parseDuracion(String duracionStr){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        try{
        return LocalTime.parse(duracionStr, formatter);    
        } catch (DateTimeParseException e){
            JOptionPane.showMessageDialog(null, "Formato incorrecto. Utilice hh:mm:ss");
            return null;
            
        }      
    }
     
     public static Date parseDate(String dateStr){
         SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
         Date date = null;
         
         try{
             date = dateFormat.parse(dateStr);
         } catch (ParseException e) {
             JOptionPane.showMessageDialog(null, "Fecha ingresada incorrectamente");
         }
         return date;
     }
}
