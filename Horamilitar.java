
package horamilitar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 *
 * @author Victoria Borras
 */
public class Horamilitar {

    public static void main(String[] args) throws IOException {    
        Random tiempo = new Random();
        horafuncion Hora = new horafuncion();
        int hora1 = tiempo.nextInt(24);
        int hora2 = tiempo.nextInt(24);
        int min1 = tiempo.nextInt(60);
        int min2 = tiempo.nextInt(60);
        int seg1 = tiempo.nextInt(60);
        int seg2 = tiempo.nextInt(60);
        
        String var_1="s";
        String opcion="";
        boolean sumado = false;
        boolean repetir = true;
        boolean milisegundeado = false;
        
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        while("s".equals(var_1)){
            sumado = false;
            repetir = true;
            milisegundeado = false;

            Hora.horainicializada(hora1);
            Hora.horainicializada2(hora2);

            Hora.minutoInicializado(min1);
            Hora.minutoInicializado2(min2);

            Hora.segundoInicializado(seg1);
            Hora.segundoInicializado2(seg2);

            Hora.mostrarHora();
            Hora.mostrarHora2();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            
            while(repetir == true){
                if(sumado == false){
                    System.out.println("Elige una opcion: \nA.- Pasar un segundo. \nB.- Sumar horas.\nC.-Convertir hora total a milisegundos.\nX.-Salir.");
                }
                else{
                    if(milisegundeado == false){
                        System.out.println("Elige una opcion: \nC.- Convertir a milisegundos.\nX.- Salir.");
                    }
                    else{
                        System.out.println("La unica opcion restante en:\nX.- Salir.");
                    }
                    
                }

                try{
                opcion=br.readLine().toLowerCase();
                }
                catch(Exception e){
                    System.err.println("Se produjo un Error: " + e.getMessage());
                }

                switch(opcion.toLowerCase()){
                    case ("x"):
                        repetir = false;
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        break;

                    case ("a"):
                        Hora.ticSegundo();
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        break;

                    case ("b"):
                        Hora.sumaHora(hora1, hora2, min1, min2, seg1, seg2);
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        sumado = true;
                        break;

                    case ("c"):
                        if(sumado == true){
                            Hora.convertirMillisegundos(hora2, min2, seg2);
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            milisegundeado = true;
                        }
                        else{
                            Hora.sumaHora(hora1, hora2, min1, min2, seg1, seg2);
                            Hora.convertirMillisegundos(hora2, min2, seg2);
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            sumado = true;
                            milisegundeado = true;
                        }
                        break;
                }
            }
                
            System.out.println("Desea continuar utilizando el programa...?\nS.- Si.\nPara salir ingrese cualquier caracter aparte de \"s\"");
            try{
                var_1=br.readLine().toLowerCase();
            }
            catch(Exception e){
                System.err.println("Se produjo un Error: " + e.getMessage());
                var_1="s";
            }
        }
    }
}
