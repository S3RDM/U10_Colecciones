package a09;
import java.util.*;

public class A09 {
    public static void main(String[] args){
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            int num = (int)(Math.random() * 100) + 1;
            lista.add(num);
        }
        System.out.println("Lista original: " + lista);
        
        Set<Integer> listaHash = new HashSet<>(lista);
        System.out.println("Lista sin repetidos: " + listaHash);
        
        Set<Integer> listaTree = new TreeSet<>(lista);
        System.out.println("Lista con TreeSet: " + listaTree);
        
        Set<Integer> listaLinked = new LinkedHashSet<>(lista);
        System.out.println("Lista con LinkedHashSet: " + listaLinked);
    }
}