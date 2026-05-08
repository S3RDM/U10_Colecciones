package a10;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Set<Socio> socios = new HashSet<>();

        socios.add(new Socio("111", "Ana"));
        socios.add(new Socio("333", "Luis"));
        socios.add(new Socio("222", "Marta"));
        boolean insertado = socios.add(new Socio("111", "Carlos"));

        System.out.println("Duplicado insertado: " + insertado);
        System.out.println("\nHashSet: ");
        for(Socio s : socios){
            System.out.println(s);
        }

        Set<Socio> sociosOrden = new TreeSet<>(socios);
        sociosOrden.add(new Socio("255", "Juan"));
        
        System.out.println("\nTreeSet (ordenado por DNI): ");
        for(Socio s : sociosOrden){
            System.out.println(s);
        }
        
        List<Socio> listaSocios = new ArrayList<>(sociosOrden);
        Socio ganador = listaSocios.get(1);
        System.out.println("\nGanador del premio: " + ganador);
    }
}