/*se importa los diferentes medos que hay en la biblioteca java */
import java.util.*;
public class Reto6 {
    /*se instancia el metodo main */
    public static void main(String [] args) {
        /*intanciar variables*/
        String palabra="jeringa",nombre,dato;
        int a, vidas=0;
        /*instanciar la clase scanner */
        Scanner leer = new Scanner (System.in);
        /*se instancia la condicion */
        do{
            /*solicitar datos */
    System.out.println("¿Cuál es el instrumento que se mete y deja líquido dentro?");

    System.out.println("digite la palabra que cree necesaria");
    /*capturar datos */ 
    dato=leer.next();
    /*instnciar la condicion if con diferentes casos que puede haber*/
    if(dato.equals("a")){
        System.out.println("tiene 1 a la palabra");

    }else if(dato.equals("e")){
        System.out.println("tiene 1 e la palabra");

    }else if(dato.equals("g")){
        System.out.println("tiene 1 g la palabra");

    }else if(dato.equals("i")){
        System.out.println("tiene 1 i la palabra");

    }else if(dato.equals("j")){
        System.out.println("tiene 1 j la palabra");

    }else if(dato.equals("n")){
    System.out.println("tiene 1 n la palabra");
 
    }else{
        System.out.println("palabra equivocada");

    }
    System.out.println("presione 1 para continuar o 0 para escribir la palabra"); 
    a=leer.nextInt();
    /*se instancia la condicion */
    }while (a>0 && a<2);
    System.out.println("digite el numero de intentos que desea tener");

    vidas=leer.nextInt();;
    /*se instancia la condicion */
    while (vidas>0){
    System.out.println("digite la palabra");
    nombre=leer.next();
    /*instnciar la condicion if con diferentes casos que puede haber*/
    if (nombre.equals(palabra)){
    System.out.println("palabra correcta");
    System.out.println("ganaste");
    }else{
    System.out.println("palabra incorrecta");
    vidas=vidas-1;
        System.out.println("su numero de intentos es "+vidas);
    }
    /*instnciar la condicion if con diferentes casos que puede haber*/
    if(vidas==0){
    System.out.println("perdiste");
    }
    System.out.println("presione 1 para intentar de nuevo o 0 para terminar");    
    a=leer.nextInt();
}
System.out.println("gracias por usar nuestro programa");

        
/*se cierra el buffer */    
leer.close();
        
}
    
}
