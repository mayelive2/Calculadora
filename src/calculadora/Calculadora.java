/*
 * Mayeleen Rodriguez Gomez 
   Cod: 2016114118 
 */
package calculadora;

/**
 *
 * @author Estudiante
 */
public class Calculadora {
    
    private double numero1;
    private double numero2;

  
     public double division() throws ExceptionDivisionCero{
        if(numero2==0){
            throw new ExceptionDivisionCero("No Se Puede Dividir Entre Cero");
        }
        return numero1/numero2;
    }
    
    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
     public double sumar(){
        return numero1+numero2;
    }
    
    public double resta(){
        return numero1-numero2;
    }
    
    public double multi(){
        return numero1*numero2;
    }

    
    
}
