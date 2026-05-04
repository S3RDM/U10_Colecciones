package a05;
import java.util.*;

public class A05 {
    public static void main(String[] args){
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> eliminar = new ArrayList<>();

        for(int i = 0; i < 100; i++){
            int num = (int)(Math.random() * 10) + 1;
            lista.add(num);
        }

        System.out.println("Lista original: ");
        System.out.println(lista);

        eliminar.add(5);

        lista.removeAll(eliminar);

        System.out.println("\nLista tras eliminar los 5: ");
        System.out.println(lista);
    }
}