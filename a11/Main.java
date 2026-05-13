package a11;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Integer> almacen = new TreeMap<>();
        int opcion;
        
        do{
            System.out.println("\n---GESTION DE ALMACEN---");
            System.out.println("1. Alta producto");
            System.out.println("2. Baja producto");
            System.out.println("3. Actualizar stock");
            System.out.println("4. Listar existencias");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion){
                case 1 -> {
                    System.out.print("Codigo del producto: ");
                    String codigoAlta = sc.nextLine();
                    if(almacen.containsKey(codigoAlta)){
                        System.out.println("El producto ya existe.");
                    }else{
                        System.out.print("Stock inicial: ");
                        int stock = sc.nextInt();
                        almacen.put(codigoAlta, stock);
                        System.out.println("Producto registrado.");
                    }
                }
                case 2 -> {
                    System.out.print("Codigo del producto a eliminar: ");
                    String codigoBaja = sc.nextLine();
                    if(almacen.containsKey(codigoBaja)){
                        almacen.remove(codigoBaja);
                        System.out.println("Producto eliminado.");
                    }else{
                        System.out.println("El producto no existe.");
                    }
                }
                case 3 -> {
                    System.out.print("Codigo del producto: ");
                    String codigoActualizar = sc.nextLine();
                    if(almacen.containsKey(codigoActualizar)){
                        System.out.print("Nuevo stock: ");
                        int nuevoStock = sc.nextInt();
                        almacen.put(codigoActualizar, nuevoStock);
                        System.out.println("Stock actualizado.");
                    }else{
                        System.out.println("El producto no existe.");
                    }
                }
                case 4 -> {
                    System.out.println("\n---EXISTENCIAS---");
                    if(almacen.isEmpty()){
                            System.out.println("No hay productos en el sistema.");
                        }else{
                            for(String codigo : almacen.keySet()){
                                System.out.println("Codigo: " + codigo + " | Stock: " + almacen.get(codigo));
                            }
                        }
                }
                case 5 -> System.out.println("Saliendo del programa.");
                default -> System.out.println("Opcion invalida.");
            }
        }while(opcion != 5);
        sc.close();
    }
}