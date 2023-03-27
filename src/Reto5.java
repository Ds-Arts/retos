/*se importa los diferentes medos que hay en la biblioteca java */
import java.util.*;
public class Reto5 {
    /*se instancia el metodo main */
    public static void main(String [] args) {
        /*nombre del reto */
    System.out.println("PIEDRA,PAPEL O TIJERA");
    /*intanciar variables*/
        int dato, aleatorio=0, vida=3, edad;
        String nombre;
        /*instanciar la clase scanner */
        Scanner leer = new Scanner (System.in);
        /*solicitar datos */
        System.out.println("digite su nombre");
        /*capturar datos */ 
        nombre=leer.next();
        System.out.println("digite su edad");
        edad=leer.nextInt();
        /*se instancia la condicion */
    do{
        /*solicitar datos */
        System.out.println("digite si piensa\n 1 piedra\n 2 papel\n 3 tijera");
        /*capturar datos */ 
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
        /*instnciar la condicion if con diferentes casos que puede haber*/
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
            System.out.println("sus vidas son "+vida);
            vida=vida-0; 
        }else if (dato==2 && aleatorio==1){
            System.out.println("empate");
            vida=vida-0; 
            System.out.println("sus vidas son "+vida); 
        }else if (dato==3 && aleatorio==2){
            System.out.println("empate");
            vida=vida-0;             
            System.out.println("sus vidas son "+vida); 
        }else if (dato==1 && aleatorio==1){
            System.out.println("perdiste");
            vida=vida-1;
            System.out.println("sus vidas son "+vida);
        }else if (dato==1 && aleatorio==2){
            System.out.println("ganaste");
            vida=vida-0; 
            System.out.println("sus vidas son "+vida); 
        }else if (dato==2 && aleatorio==0){
            System.out.println("ganaste");
            vida=vida-0; 
            System.out.println("sus vidas son "+vida);
        }else if (dato==2 && aleatorio==2){
            System.out.println("perdiste");
            vida=vida-1;    
            System.out.println("sus vidas son "+vida);
        }else if (dato==3 && aleatorio==0){
            System.out.println("perdiste");
            vida=vida-1;
            System.out.println("sus vidas son "+vida);
        }else if (dato==3 && aleatorio==1){
            System.out.println("perdiste");
            vida=vida-1;
            System.out.println("sus vidas son "+vida);
        }
        /*instnciar la condicion if con diferentes casos que puede haber*/
         if (vida==0) {
        System.out.println("si quieres volver a jugar precio 1 si no preciona 4");
        dato=leer.nextInt();
        }
        /*se instancia la condicion */
    }while (vida>0);
    /*se cierra el buffer */
    leer.close();
}
}