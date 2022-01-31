package collections.lists.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArrayList1 {
    public static void main(String[] args) {
        //Creación de ArrayList
        List<String> listaColores = new ArrayList<>();

        //Creación mediante la clase Arrays
        String [] nombres = {"Erick","Joseph","Mateo","Valentina","Valeria"};

        List<String> listaNombres = Arrays.asList(nombres);

        //Adición de elementos individuales
        listaColores.add("Azul");
        listaColores.add("Amarillo");
        listaColores.add("Morado");
        listaColores.add("Rosado");
        listaColores.add("Negro");

        //Construir lista a partir de otra lista
        List<String> elementos = new ArrayList<>(listaColores);

        //Adición de elementos de otra colección.
        elementos.addAll(listaNombres);
        //Iteración a través del ArraList
        System.out.println("Lista de Nombres:");
        listaNombres.forEach(System.out::println);

        System.out.println("Lista de Colores:");
        listaColores.forEach(System.out::println);

        System.out.println("Lista de Elementos:");
        elementos.forEach(System.out::println);

        //Iteración a traves del ArrayList
        ListIterator<String> iterador = listaColores.listIterator();

        System.out.println("\n\nRecorrido con Iterador: ");
        while (iterador.hasNext()){
            System.out.println("Color: " + iterador.next());
        }


        System.out.println("\n\nRecorrido inverso con Iterador: ");
        while (iterador.hasPrevious()){
            System.out.println("Color: " + iterador.previous());
        }

        while (iterador.hasNext()){
            if(iterador.next().equals("Amarillo")){
                iterador.remove();
            }
        }

        System.out.println("\n\nRecorrido con iterador sin amarillo: ");
        for(ListIterator<String> iter = listaColores.listIterator(); iter.hasNext(); ){
            System.out.println("Color: " + iter.next());
        }

        //Convertir en Array

        //Insertar elemento en una posición aleatoria
    }
}
