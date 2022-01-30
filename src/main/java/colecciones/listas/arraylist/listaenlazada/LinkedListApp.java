package colecciones.listas.arraylist.listaenlazada;

public class LinkedListApp {
    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();
        list.push(1.23);
        list.push(3.21);
        list.push(8.28);
        list.push(8.20);

        list.printContent();

        Node nodo = list.insert(8.28, 78.4);
        if(nodo == null){
            System.out.println("no se pudo insertar un nuevo nodo");
        }
        else{
            System.out.println("El nodo se ha insertado correctamente");
        }
        System.out.println("El nuevo contenido de la lista enlazada es: ");
        list.printContent();

        nodo = list.contains(1.23);

        if(nodo == null){
            System.out.println("El nodo no se ha encontrado en la lista");
        }
        else{
            System.out.println("El valor 1.23 se ha encontrado en la lista");
        }

        System.out.println("Eliminación de nodos: ");
        while(!list.isempty()){
            nodo = list.pop();
            System.out.println("Nodo eliminado");
            nodo.showContent();
        }

        list.printContent();

        list.push("Cat");
        list.push("Dog");

        list.printContent();

        list.delete("Cat");

        System.out.println("Lista despues de eliminado Cat");

        list.printContent();
    }
}
