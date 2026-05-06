package a08;
import java.util.*;

public class A08 {
    public static void main(String[] args){
        List<String> listaA = new ArrayList<>(Arrays.asList("Ana","Luis","Marta","Luis"));
        List<String> listaB = new ArrayList<>(Arrays.asList("Ana","Luis","Marta","Luis"));
        
        System.out.println("Lista A y B son iguales: " + listaA.equals(listaB));
        
        System.out.println("Primer indice de Luis: " + listaB.indexOf("Luis"));
        System.out.println("Ultimo indice de Luis: " + listaB.lastIndexOf("Luis"));
        
        listaA.sort(null);

        System.out.println("Lista A y B son iguales: " + listaA.equals(listaB));
        
        listaB.sort(Comparator.reverseOrder());
        System.out.println("Lista B en orden inverso: " + listaB);
        
    }
}