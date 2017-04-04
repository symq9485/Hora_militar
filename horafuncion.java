
package horamilitar;

public class horafuncion {

    protected int hora;
    protected int minuto;
    protected int segundos;
    protected int millisegundos;
    String hh;
    String mm;
    String ss;
    String hh2;
    String mm2;
    String ss2;

    
    void horafuncion(){
        hora = 0;
        minuto = 0;
        segundos = 0;
        hh = "";
        ss = "";
        mm = "";
        hh2 = "";
        mm2 = "";
        ss2 = "";
    }
    
    protected void horainicializada(int hora){
        this.hora = hora;
        hh = String.format("%02d",hora);
    }
    
    protected void minutoInicializado(int minuto){
        this.minuto = minuto;
        mm = String.format("%02d", minuto);
    }
    
    protected void segundoInicializado(int segundos){
        this.segundos = segundos;
        ss = String.format("%02d", segundos); 
    }
    
     protected void horainicializada2(int hora2){
        this.hora = hora2;
        hh2 = String.format("%02d",hora);
    }
    
    protected void minutoInicializado2(int minuto2){
        this.minuto = minuto2;
        mm2 = String.format("%02d", minuto);
    }
    
    protected void segundoInicializado2(int segundos2){
        this.segundos = segundos2;
        ss2 = String.format("%02d", segundos); 
    }
       
    void mostrarHora(){
        System.out.println("La hora es: " + hh + ":" + mm + ":" + ss);
    }
       
    void mostrarHora2(){
        System.out.println("La hora es: " + hh2 + ":" + mm2 + ":" + ss2);
    }
    
    void ticSegundo(){
        segundos = ++segundos;
        if (segundos > 59) {
            segundos = 0;
            minuto = minuto++;
            if (minuto > 59) {
                minuto = 0;
                hora = hora++;
                if (hora > 23){
                    hora = 0;
                }
            }
        }
        hh = String.format("%02d",hora);
        mm = String.format("%02d", minuto);
        ss = String.format("%02d", segundos);
        System.out.println("La hora, con un segundo mas, es: " + hh + ":" + mm + ":" + ss);
    }
    
    void sumaHora(int hora1, int hora2, int min1, int min2, int seg1, int seg2){
        hora = hora1 + hora2;
        if (hora > 23){
            hora = hora-24; 
        }
        
        minuto = min1 + min2;
        if (minuto > 59){
            minuto = minuto-60;
            hora = hora+1;
            if (hora > 23){
                hora = 0;
            }
        }
        
        segundos = seg1 + seg2;
        if (segundos > 59){
            segundos = segundos-60;
            minuto = minuto + 1;
            if (minuto > 59){
                minuto = 0;
                hora = hora + 1;
                if (hora > 23 ){
                    hora = 0;
                }
            }
        }
        hh = String.format("%02d",hora);
        mm = String.format("%02d", minuto);
        ss = String.format("%02d", segundos);
        System.out.println("La hora es: " + hh + ":" + mm + ":" + ss);
    }
    
    void convertirMillisegundos (int hora, int minuto, int segundos){
        millisegundos = ( hora * 360000 ) + ( minuto * 60000 ) + ( segundos * 1000);
        System.out.println("La hora en millisegundos es: " + millisegundos);
    }
    
}
