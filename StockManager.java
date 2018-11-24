import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (Abel Gonzalo y Angel Cañada)
 * @version (0)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<Product>();
    }

    /**
     * Devuelve la lista de productos.
     *
     * @param  
     * @return   ArrayList de productos en stock
     */
    public ArrayList getStockList() {
        return stock;
    }
    
    /**
     * Muestra por consola la lista de productos en stock.
     *
     * @param  
     * @return 
     */
    public void mostrarListaProductos(){
        Product p;
        System.out.println("***Mostrando detalles de los productos de la lista***");
        
        for(int i=0; i < stock.size() ; i++){               
            System.out.println("Producto "+ (i + 1)  + "  " + stock.get(i));
        }                                               
    }
    
    /**
     * Prueba de ejemplo
     *
     * @param  
     * @return    
     */
    void pruebaAddProduct(){
        System.out.println("Iniciando prueba de addProduct: ");
        System.out.println("Añadiendo productos con id's: 1, 2 y 3.");
        Product p1 = new Product(1, "camiseta",10, 5);
        printProductDetails();
        
        addProduct(p1);
        mostrarListaProductos(); 
        
        if(p1 == stock.get(0)){
            System.out.println("Producto 1 probado correctamente :) ");
        }
        
    }
    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
        for (Product producto : stock) {
            if (producto.getID() == id) {
                producto.increaseQuantity(amount);
            }
            else {
                System.out.println("No existe el producto con el identificador "+ id + "." );
            }
        }
    }
    
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {   
        boolean existe = false;
        Product p1 = new Product();
        for (Product producto : stock) {
            if ( (id == producto.getID()) && (producto.getQuantity() <=0) ) {
              p1 = producto;
              System.out.println("Producto con la id: "+ id + " ha sido encontrado.");
              existe = true;
            }
        }
        if ( existe == false ) {            
            System.out.println("no existe/no hay productos.");
        }    
        return p1;
    }
    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        int cantidad = 0;
        for (Product producto : stock) {
            if (id == producto.getID()) {
                cantidad = producto.getQuantity();
                if (cantidad == 0) {
                    System.out.println("No hay stock del producto: " + id + ".");
            
                }
            }
            else {
                System.out.println("No existe el producto: " + id + ".");
            }       
        }
          
        return cantidad;
    }

    /**
     * Print details of all the products.
     */
    public void printProductDetails()
    {
        for(int i=0; i < stock.size() ; i++){               
            System.out.println("Producto "+ (i + 1) + "  " + stock.get(i));
        } 
    }
}
