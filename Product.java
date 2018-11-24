import java.util.ArrayList;
/**
 * Model some details of a product sold by a company.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2011.07.31
 */
public class Product
{
    // An identifying number for this product.
    private int id;
    // The name of this product.
    private String name;
    // The quantity of this product in stock.
    private int quantity;
    //El minimo de stock que debe existir de este producto
    private int stockMinimo;
    
    
    
    private ArrayList<Comment> listaComentarios;

    /**
     * Constructor for objects of class Product.
     * The initial stock quantity is zero.
     * @param id The product's identifying number.
     * @param name The product's name.
     */
    public Product(int id, String name, int quantity, int stockMinimo)
    {
        this.id = id;
        this.name = name;
        this.stockMinimo = stockMinimo;
        if(quantity < 0) {
         this.quantity = this.stockMinimo+1;
        }
        else{
         this.quantity = quantity;
        }    
        
        listaComentarios = new ArrayList <Comment>();
        
    }
    
    /**
     * Constructor por defecto de la clase Product.
     */
    public Product()
    {
        this.id = 0;
        this.name = "";
        quantity = 0;
        this.stockMinimo = 0;
    }

  
    /**
     * @return The product's id.
     */
    public int getID()
    {
        return id;
    }
    
    /**
     * Establece el numero de unidades de este producto.
     */
    public void setQuantity(int cantidad) {
        this.quantity = cantidad;
    }

    /**
     * @return The product's name.
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return The quantity in stock.
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * @return The id, name and quantity in stock.
     */
    public String toString()
    {
        return id + ": " +
               name +
               " stock level: " + quantity;
    }
    
    void mostrarListaComentarios(){
        
        for(int i=0 ; i <listaComentarios.size() ; i++){
          listaComentarios.get(i); 
        }
       
    }
    
    
    

    /**
     * Restock with the given amount of this product.
     * The current quantity is incremented by the given amount.
     * @param amount The number of new items added to the stock.
     *               This must be greater than zero.
     */
    public void increaseQuantity(int amount)
    {
        if(amount > 0) {
            quantity += amount;
        }
        else {
            System.out.println("Attempt to restock " +
                               name +
                               " with a non-positive amount: " +
                               amount);
        }
    }

    /**
     * Sell one of these products.
     * An error is reported if there appears to be no stock.
     */
    public void sellOne()
    {
        if(quantity > 0) {
            quantity--;
        }
        else {
            System.out.println(
                "Attempt to sell an out of stock item: " + name);
        }
    }
    
    /**
     * Devuelve el stock minimo establecido para este producto.
     */
    public int getStockMinimo() {
        return stockMinimo;
    }
    
    /**
     * Añade un comentario a la lista de comentarios del producto.
     * 
     * @param comentario (comentario que añades)
     * @return 
     */
    public void anadirComentarioLista(Comment comentario){
        
        listaComentarios.add(comentario);
        
    }
}
