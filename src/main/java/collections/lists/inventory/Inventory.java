package collections.lists.inventory;

import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List<Product> products;

    public Inventory(){
        products = new LinkedList<>();
    }

    public void newProduct(int id, String name, int existence, double price) {
        Product newProduct = new Product(id, name, existence, price);

        boolean success = products.add(new Product());

        if(success){
            System.out.println("El producto " + name + "se añadío correctamente al inventario");
        }else{
            System.out.println("Ocurrió un problema al agregar el producto " + name + " al inventario");
        }
    }
}
