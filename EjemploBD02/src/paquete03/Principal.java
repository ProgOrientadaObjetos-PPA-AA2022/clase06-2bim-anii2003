/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import java.util.Locale;
import java.util.Scanner;
import paquete01.Enlace;
import paquete02.Auto;

/**
 *
 * @author reroes
 */
public class Principal {
    
    public static void main(String[] args) throws SQLException {
        Scanner leer = new Scanner(System.in);
        leer.useLocale(Locale.US);
        
        String placa;
        double matricula;
        String continuar;
        
        Enlace c = new Enlace();
        
        do {
            System.out.println("Por favor ingrese la placa del Automóvil: ");
            placa = leer.nextLine();
            
            System.out.println("Ingrese el valor de la matrícula: ");
            matricula = leer.nextDouble();
            
            Auto a = new Auto();
            a.establecerPlaca(placa);
            a.establecerValorMatricula(matricula);
            
            c.insertarAuto(a);
            
            System.out.println("¿Desea ingresar más ciudades?\n"
                    + "Pulse S para seguir ingresando o N para salir");
            leer.nextLine();
            continuar = leer.nextLine();
            
        } while (continuar.equals("S"));

        /*for (int i = 0; i < c.obtenerDataAuto().size(); i++) {
            System.out.printf("%s\n", c.obtenerDataAuto().get(i));
        }*/
    }
}
