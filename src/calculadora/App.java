/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Estudiante
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Calculadora calc = new Calculadora(4,6);
        System.out.println("Suma="+calc.sumar());
        System.out.println("Resta="+calc.resta());
        System.out.println("Multiplicacion="+calc.multi());
        
        try{
            System.out.println("Division = "+calc.division());
        }
        catch(ExceptionDivisionCero exc){
            exc.printStackTrace();
        }
    }
    
}
