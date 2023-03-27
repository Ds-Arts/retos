/*se importa los diferentes medos que hay en la biblioteca java */
import java.util.*;
public class Reto3 {
    /*instanciar el metodo main */
    public static void main(String [] args) {
         /*nombre del reto */
         System.out.println("CARA O SELLO");
         /*intanciar variables*/
        int dato, aleatorio=0, edad;
        String Nombre;
        var  min =1;
        var max = 2;
        /*instanciar la clase scanner */
        Scanner leer = new Scanner (System.in);
        /*capturar datos */
        System.out.println("digite su nombre");
        Nombre=leer.next();
        System.out.println("digite su edad");
        edad=leer.nextInt();
        System.out.println("digite si piensa\n 1 cara\n 2 sello");
        dato=leer.nextInt();
        /*se instancia la clase maht con el metodo random el cual ayudara a generar numeros aleatorios */
        aleatorio = (int) (Math.random()*(max+min)-min);
        /*instnciar la condicion if con diferentes casos que puede haber*/
        if (edad>100){
            System.out.println("no puede jugar");  
        }else if(edad==0){
            System.out.println("digito una edad no adecuada");
        }else if (edad<18){
            System.out.println("no puede jugar");  

        }else if (dato==1){
            System.out.println("el sistema saco sello");
        }else if (dato==2){
            System.out.println("el sistema saco cara");
        }else{
            System.out.println("ingreso datos incorrectos");
        }
        if (dato==aleatorio){
            System.out.println("la moneda callo en"+aleatorio+Nombre+" gano");
        }else{ 
            System.out.println("la moneda callo en  "+aleatorio+" la maquina gano");
        }
        /*se cierra el buffer */
        leer.close();
    } 
}
