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
        
        //HashSet para que no haya repetidos y con un orden aleatorio
        Set<Integer> listaHash = new HashSet<>(lista);
        System.out.println("Lista sin repetidos: " + listaHash);
        
        //TreeSet para ordenar ascendentemente sin repetidos
        Set<Integer> listaTree = new TreeSet<>(lista);
        System.out.println("Lista con TreeSet: " + listaTree);
        
        //LinkedHashList para usar el orden de la lista original sin repetidos
        Set<Integer> listaLinked = new LinkedHashSet<>(lista);
        System.out.println("Lista con LinkedHashSet: " + listaLinked);
    }
}