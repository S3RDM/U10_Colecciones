package a01;
import java.util.Arrays;

public class A01 {
    public static void main(String[] args) {
        String[] s = {"A1","A2"};
        s = guardar("B1", s);
        s = guardar("B2", s);
        
        System.out.println(Arrays.toString(s));
        
        Integer[] i = {2,3};
        i = guardar(1, i);
        i = guardar(2, i);
        
        System.out.println(Arrays.toString(i));
    }
    
    public static <E> E[] guardar (E elemento,E tabla []){
        tabla = Arrays.copyOf(tabla, tabla.length +1);
        tabla[tabla.length-1]= elemento;
        return tabla;
    }
}