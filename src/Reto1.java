/*se importa el metodo scanner */
import java.util.Scanner;
public class Reto1 {
    /*se instancia el metodo main */
    public static void main(String [] args) {
        /*nombre dle reto */
        System.out.println("HORNO");
        /*intanciar variables*/
        int g, conversion;
        double grados=0;
        /*instanciar la clase scanner */
        Scanner leer = new Scanner(System.in);
        /*solicitar datos */
        System.out.println("este programa te ayudara a pasar de grados celcius a farengeit o kelvin y al contrario mas el valor 100, con las siguietes opciones:");
        System.out.println("Digite los grados de la estufa");
        /*capturar datos */
        g =leer.nextInt();
        System.out.println("seleccione tipo de conversion:\n 1 celcius a fahrenheit\n,2 celcius a kelvin\n,3 kelvin a celcius\n,4 fahrenheit a celcius");
       conversion=leer.nextInt();
       /*instnciar la condicion switch con los casos necesarios para esta clase*/
       switch (conversion){
      case 1:
        grados=(g*1/8)+32+100;
        System.out.println("su convercion de celcius a fahrenheit es"+grados+"°f");
        /*cierra el caso */
       break;
       case 2:
       grados=g+273+100;
       System.out.println("su convercion de celcius a kelvin es"+grados+"k");
       /*cierra el caso */
      break;
       case 3:
       grados=g-273+100;
       System.out.println("su convercion kelvin a celcius es"+grados+"°c");
       /*cierra el caso */
      break;
       case 4:
       grados=(g-32)/1.8+100;
      System.out.println("su convercion kelvin a celcius es"+grados+"°c");
      /*cierra el caso */
      break;
        default:
        System.out.println("ingreso datos incorrectos");
        /*cierra el caso default */
    break;
    }
    /*se cierra el buffer */
    leer.close();
    }
}
