/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

/**
 *
 * @author dam104
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            
           VentanaCasino miVentana = new VentanaCasino();
     
        miVentana.show(); 
        }catch(Exception e){
            
            System.out.println("No se pudo establecer el aspecto deseado: " + e);
        }
    }
    
}
