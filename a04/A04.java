package a04;
import java.util.*;

public class A04 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            int num = (int)(Math.random() * 10) + 1;
            numeros.add(num);
        }
        System.out.println("Lista original: " + numeros);
        
        Iterator<Integer> it = numeros.iterator();
        while(it.hasNext()){
            if (it.next() == 5){
                it.remove();
            }
        }
        System.out.println("Lista tras eliminar los 5: " + numeros);
    }
}