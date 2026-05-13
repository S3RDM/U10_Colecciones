package a12;
import java.util.*;

public class Main {
    public static void main(String[] args){
        List<Integer> premios = new ArrayList<>(Arrays.asList(1000,50,500,50,200));
        
        int premios50 = Collections.frequency(premios, 50);
        System.out.println("Cantidad de premios de 50: " + premios50);
        
        int premioMax = Collections.max(premios);
        int premioMin = Collections.min(premios);
        System.out.println("Premio maximo: " + premioMax + "\nPremio minimo: " + premioMin);
        
        Collections.shuffle(premios);
        System.out.println("Lista desordenada: " + premios);
        
        Collections.sort(premios);
        System.out.println("Lista ordenada: " + premios);
        
        int posicion500 = Collections.binarySearch(premios,500);
        System.out.println("Posicion de 500: " + posicion500);
    }
}