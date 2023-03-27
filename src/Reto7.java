/*se importa los diferentes medos que hay en la biblioteca java */
import java.util.*;
public class Reto7 {
    /*se instancia el metodo main */
    public static void main(String [] args) {
        /*intanciar variables*/
        String usuario;
        int dato=0, id,formulario, contraseña;
        /*instanciar la clase scanner */
        Scanner leer = new Scanner (System.in);
        /*se instancia la condicion */
        do{ 
            /*solicitar datos */
            System.out.println("digite su numero de identificacion");
            /*capturar datos */ 
            id=leer.nextInt();
            System.out.println("digite el nombre de usuario que desea");
            usuario=leer.next();
            System.out.println("digite su contraseña");
            formulario=leer.nextInt();
            System.out.println("confirme su contraseña");
            contraseña=leer.nextInt();
            if(contraseña!=formulario){
                System.out.println("su contraseña no coincide 1 para intentar de nuevo y 2 para cancelar");
                dato=leer.nextInt();
            }
            /*se instancia la condicion */
        while(contraseña==formulario){
        System.out.println("1 para confirmar y 0 para anular registro");
            dato=leer.nextInt();
            /*instnciar la condicion if con diferentes casos que puede haber*/
            if(dato==1){
                System.out.println("registro exitoso");
            }
            System.out.println("desea registrar usuario\n 1 si\n 2 no");
            dato=leer.nextInt();
        }
        /*se cierra el ciclo do */
        }while(dato>0 && dato<2);
            System.out.println("gracias por usar nuestro programa");
            /*se cierra el buffer */
        leer.close();
    }
}
