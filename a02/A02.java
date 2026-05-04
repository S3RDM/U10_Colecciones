package a02;
import java.util.*;

public class A02 {
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in)){
            int num;
            System.out.println("Introducir números enteros no negativos (-1 para terminar): ");
            while(true){
                try{
                    num = sc.nextInt();
                    if(num == -1){
                        break;
                    }
                    if(num < -1){
                        System.out.println("Solo se permiten números no negativos o -1 para salir.");
                        continue;
                    }
                    numeros.add(num);
                }catch(Exception e){
                    System.out.println("Entrada inválida. Introduce un número entero.");
                    sc.next();
                }
            }
        }
        System.out.println("\nColección completa: ");
        System.out.println(numeros);
        System.out.println("\nNúmeros pares: ");
        for(int n : numeros){
            if(n % 2 == 0){
                System.out.print(n + " ");
            }
        }
        Iterator<Integer> it = numeros.iterator();
        while(it.hasNext()){
            if(it.next() % 3 == 0){
                it.remove();
            }
        }
        System.out.println("\n\nColección tras eliminar múltiplos de 3: ");
        System.out.println(numeros);
    }
}