package a03;
import java.util.*;

public class A03 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> sinRepetidos = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            int num = (int)(Math.random() * 10) + 1;
            lista.add(num);
        }
        for(int n : lista){
            if(!sinRepetidos.contains(n)){
                sinRepetidos.add(n);
            }
        }
        System.out.println("Lista original: " + lista);
        System.out.println("Lista sin repetidos: " + sinRepetidos);
    }
}