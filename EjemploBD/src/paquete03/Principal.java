/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import java.util.Scanner;
import paquete01.Enlace;
import paquete02.Ciudad;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) throws SQLException {
        Scanner leer = new Scanner(System.in);
        String continuar;
        String ciudad;
        int poblacion;
        int opc = 0;
        
        Enlace c = new Enlace();

        do {
            System.out.println("Por favor ingrese el nombre de la ciudad: ");
            ciudad = leer.nextLine();
            
            System.out.println("Ingrese la población de la ciudad "+ciudad);
            poblacion = leer.nextInt();
            
            Ciudad c1 = new Ciudad(ciudad, poblacion);
            
            c.insertarCiudad(c1);

            System.out.println("¿Desea ingresar más ciudades?\n"
                    + "Pulse S para seguir ingresando o N para salir");
            leer.nextLine();
            continuar = leer.nextLine();
            
        } while (continuar.equals("S"));
        
        /*for (int i = 0; i < c.obtenerDataCiudad().size(); i++) {
            System.out.printf("%s", c.obtenerDataCiudad().get(i));
        }*/

    }
}
