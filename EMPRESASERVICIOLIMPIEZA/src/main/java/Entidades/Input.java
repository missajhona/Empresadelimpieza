package entidades;
import java.util.Scanner;

public class Input {
    static Scanner sc = new Scanner(System.in);

    static public int entero(String oracion, int min){
        int num;
        
        do {
            System.out.print(oracion);
            num = Integer.parseInt(sc.nextLine());
        } while (num < min);
        
        return num;
    }

    static public float flotante(String oracion, int min){
        float num;
        do {
            System.out.print(oracion);
            num = Float.parseFloat(sc.nextLine());
        } while (num < min);
        
        return num;
    }
    static public String cadena(String oracion){
        String cad;
        do {
            System.out.print(oracion);
            cad = sc.nextLine();
        } while (cad.isEmpty());
        
        return cad;
    }
}
