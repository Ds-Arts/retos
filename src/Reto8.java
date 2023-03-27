/*se importa los diferentes medos que hay en la biblioteca java */
import java.util.*;
public class Reto8 {
    /*se instancia el metodo main */
    public static void main(String [] args) {
        /*intanciar variables*/
        String j1, j2;
        int vidas=3,v=3, d=0,j=0, n;
        /*instanciar la clase scanner */
    Scanner leer = new Scanner (System.in);
                /*solicitar datos */
                System.out.println("digite nombre de jugador 1");
                /*capturar datos */ 
                j1=leer.next();
                System.out.println("digite nombre de jugador 2");
                j2=leer.next();
                /*se instancia la condicion */
                do{  
                /*capturar datos */    
                System.out.println("su numero total de vidas es "+vidas);
                System.out.println("tira los dados");
                /*se instancia la clase maht con el metodo random el cual ayudara a generar numeros aleatorios */
                d= (int) (Math.random()*6)+1;
                /*se instancia la clase maht con el metodo random el cual ayudara a generar numeros aleatorios */
                j= (int) (Math.random()*6)+1;
                System.out.println("jugador 1 saco "+j);
                System.out.println("jugador 2 saco "+d);
                /*instnciar la condicion if con diferentes casos que puede haber*/
                if (j>d){
                    System.out.println("esta ronda la gana "+ j1);
                    v=v-1;
                    System.out.println("las vidas del jugados 2 son "+v);
                }else if (j<d){
                    System.out.println("esta ronda la gana "+ j2);
                    vidas=vidas-1;
                    System.out.println("las vidas del jugados 1 son "+vidas);
                }else if (j==d){
                    System.out.println("Empate su numero de vidas quedan igual");
                }
                /*se instancia la condicion */
                while (v<=0 || vidas<=0){
                    /*instnciar la condicion if con diferentes casos que puede haber*/
                if (vidas==0){
                System.err.println("jugador 2 gana");
                }
                if (v==0){               
                     System.err.println("jugador 1 gana");
                }
            }  
             
            System.out.println("digite 1 para volver a intentar y 0 para terminar");
                n=leer.nextInt();
                /*se instancia la condicion */         
        }while(n>0 && n<2);
        /*se cierra el buffer */
        leer.close();

        }
}
