/*se importa los diferentes medos que hay en la biblioteca java */
import java.util.*;
public class Reto4 {
    /*se instancia el metodo main */
    public static void main(String [] args) {
    /*nombre dle reto */
    System.out.println("PIEDRA,PAPEL O TIJERA");
    /*intanciar variables*/
    int dato, aleatorio=0, edad;
    String Nombre;
    Scanner leer = new Scanner (System.in);
    /*solicitar datos */
    System.out.println("digite su nombre");
    /*capturar datos */
    Nombre=leer.next();
    System.out.println("digite su edad");
    edad=leer.nextInt();
    /*instanciar la clase scanner */
    System.out.println("digite si piensa\n 1 piedra\n 2 papel\n 3 tijera");
    dato=leer.nextInt();
    /*se instancia la clase maht con el metodo random el cual ayudara a generar numeros aleatorios */
    aleatorio = (int) (Math.random()*3);
    /*instnciar la condicion if con diferentes casos que puede haber*/
    if (edad>100){
        System.out.println("no puede jugar");  
    }else if(edad==0){
        System.out.println("digito una edad no adecuada");
    }else if (edad<18){
        System.out.println("no puede jugar");  
    } 
    if (aleatorio==0){
        System.out.println("el sistema saco piedra");
    }else if (aleatorio==1){
        System.out.println("el sistema saco papel");
    }else if (aleatorio==2){
        System.out.println("el sistema saco tijera");
    }
    /*instnciar la condicion if con diferentes casos que puede haber*/
    if(dato==1 && aleatorio==0){
        System.out.println("empate"); 
    }else if (dato==2 && aleatorio==1){
        System.out.println("empate");
    }else if (dato==3 && aleatorio==2){
        System.out.println("empate");
    }else if (dato==1 && aleatorio==1){
        System.out.println("perdiste");
    }else if (dato==1 && aleatorio==2){
        System.out.println("ganaste");
    }else if (dato==2 && aleatorio==0){
        System.out.println("ganaste");
    }else if (dato==2 && aleatorio==2){
        System.out.println("perdiste");
    }else if (dato==3 && aleatorio==0){
        System.out.println("perdiste");
    }else if (dato==3 && aleatorio==1){
        System.out.println("perdiste");
    }else{
        System.out.println("ingreso datos incorrectos");
}
/*se cierra el buffer */
leer.close();
}
}
