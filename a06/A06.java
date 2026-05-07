package a06;
import java.util.*;

public class A06 {
    public static void main(String[] args){
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int num = (int)(Math.random() * 100) + 1;
            lista.add(num);
        }
        System.out.println("Lista original: " + lista);

        Integer[] array = lista.toArray(new Integer[0]);
        Arrays.sort(array);
        ArrayList<Integer> menorAMayor = new ArrayList<>(Arrays.asList(array));

        System.out.println("Lista ordenada de menor a mayor: " + menorAMayor);

        Arrays.sort(array, Collections.reverseOrder());
        ArrayList<Integer> mayorAMenor = new ArrayList<>(Arrays.asList(array));

        System.out.println("Lista ordenada de mayor a menor: " + mayorAMenor);
    }
}
