
import java.util.Scanner;


public class EjecturoTerreno {
    public static void main(String[] args) {
        /*Terreno terreno1 = new Terreno(40,10 , 2);
        Terreno terreno2 = new Terreno(21,12 , 2);
        Terreno terreno3 = new Terreno(10,10 , 2);

        Terreno  arrayTerreno[] = new Terreno[3];
        arrayTerreno[0] = terreno1;
        arrayTerreno[1] = terreno2;
        arrayTerreno[2] = terreno3;
        
       */
       /* for (int i = 0; i < arrayTerreno.length; i++) {
            arrayTerreno[i].CalcularArea();
            arrayTerreno[i].CalcularCostoFinal();   
            System.out.println(arrayTerreno[i]);

        }*/
        /*for(Terreno terreno : arrayTerreno){
            terreno.CalcularArea();
            terreno.CalcularCostoFinal();
            System.out.println(terreno);
        }*/
        /*Terreno arrayTerrenos[] ={new Terreno(10,3,2),(new Terreno(2,3,4)), (new Terreno(5,6,1))};
        for(Terreno terreno : arrayTerrenos){
            terreno.CalcularArea();
            terreno.CalcularCostoFinal();
            System.out.println(terreno);
        }*/
        Scanner teclado = new Scanner(System.in);
        Terreno arrayTerrenos[] = new Terreno[2];
        int i = 0;
        String opc;
        while (true) {
            System.out.print("Dame alto, ancho y vcm: ");
            arrayTerrenos[i] = new Terreno(teclado.nextDouble(), teclado.nextDouble(), teclado.nextDouble());
            i++;
            System.out.print("Deseas más terrenos (S/N)?: ");
            opc = teclado.next();
            if (opc.equals("N") && (i < arrayTerrenos.length)) break;
            }
            System.out.println("Los terrenos ingresados son: ");
            for(Terreno terreno : arrayTerrenos){
                terreno.CalcularArea();
                terreno.CalcularCostoFinal();
                System.out.println(terreno);
            }
        }
    }
