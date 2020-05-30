/*
Implemente un algoritmo que le permita solicitar el ingreso por teclado 6 caracteristicas del software
GitHub.
 */
package caracteristicasgithub;

/**
 *
 * @author Junior Steven Cangui Toapanta
 */
import java.util.Scanner;
public class CaracteristicasGitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner(System.in); //new, reserva espacio de memoria
        System.out.println("          UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE             ");
        System.out.println("Autor: Junior Steven Cangui Toapanta"); 
        System.out.println("NRC:7450");
        System.out.println("Fecha: 21/05/2020");
        System.out.println("Tema: Caracteristicas del software GitHub\n");
    
        System.out.println("Ingrese la primera caracteristica:");
        String c1=objeto.nextLine (); 
        
        System.out.println("Ingrese la segunda caracteristica:");
        String c2=objeto.nextLine ();
        
        System.out.println("Ingrese la tercera caracteristica:");
        String c3=objeto.nextLine ();
        
        System.out.println("Ingrese la cuarta caracteristica:");
        String c4=objeto.nextLine ();
        
          System.out.println("Ingrese la quinta caracteristica:");
        String c5=objeto.nextLine (); 
        
        System.out.println("           GRACIAS POR SU ATENCION            ");
        
    }
    
}
