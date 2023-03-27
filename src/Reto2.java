/*se importa el metodo scanner */
import java.util.Scanner;
public class Reto2 {
    /*instanciar el metodo main */
    public static void main(String [] args) {
        /*nombre del reto */
        System.out.println("BEBE");
        /*intanciar variables*/
        int pBebe, mBebe;
        double dosis=0;
        /*instanciar la clase scanner */
        Scanner leer = new Scanner (System.in);
        /*solicitar datos */
        System.out.println("Digite el peso del bebe");
        /*capturar datos */
        pBebe=leer.nextInt();
        System.out.println("Digite el meses de edad del bebe");
        mBebe=leer.nextInt();
        dosis=(pBebe+15)/(mBebe*15)*10;
        /*instnciar la condicion if con diferentes casos que puede haber*/
        if (mBebe>11){
            System.out.println("Esta vacuna no puede ser inyectada en bebes de un año o mas");  
        }else if(mBebe<1){
            System.out.println("Esta edad no existe");
        }else{
            System.out.println("la dosis a aplicar es"+dosis);
        }
        /*se cierra el buffer */
        leer.close();
    }
}
