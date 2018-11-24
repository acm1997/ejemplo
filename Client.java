 import java.util.HashMap;
/**
 * Write a description of class Client here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
   public class Client
   {
   private StockManager manager;   
   private String nombre;
   private int id;
   private int edad;
   private String localidad;
   private int numeroComentarios;
   private HashMap <String, Product> favoritos = new HashMap<> ();   
   
   /**
    * Constructor por defecto de la clase Client.
    */
   public Client()
   {
       manager = new StockManager();
       this.nombre = "";
       this.id = 0;
       this.edad = 0;
       this.numeroComentarios = 0;
       this.localidad = "";
   }
            
   /**
    * Constructor parametrizado del a clase Client.
    */
   public Client(String nombre, int id, int edad, String localidad)
   {
       this.nombre = nombre;
       this.id = id;
       this.edad = edad;
       this.localidad = localidad;
       manager = new StockManager();
   }
   
   /**
     * Pone en la variable numeroComentarios el valor que se introduce por parámetro
     *
     * @param      comentarios ( numero de comentarios )
     * @return     the sum of x and y
     */
   public void setNumeroComentarios(int comentarios){
       
       this.numeroComentarios = comentarios;
       
    }
   
   /**
     * Devuelve el numero de comentarios que ha hecho el Cliente
     *
     * @param      comentarios ( numero de comentarios )
     * @return     numero de comentarios
     */        
   public int getNumeroComentarios(){  
       
       return this.numeroComentarios;
       
   }
   
   /**
     * Devuelve el valor del cliente
     *
     * @param      
     * @return     nombre del cliente
     */
   public String getNombreCliente(){  
       
       return this.nombre;
       
   }
   /**
    * Añade un producto a la lista de favoritos. 
    * @param   nombreFav (Nombre con el que guardas un producto en tu lista de favoritos) producto (Un objeto producto)   
    * @return    
    */
   public void AnadirProducto(String nombreFav, Product producto) 
   {
       favoritos.put(nombreFav, producto);
   }
   
   /**
    * Elimina un producto de la lista de favoritos.
    * @param nombreFav (nombre producto que quieres eliminar)
    * @return
    */      
   public void EliminarProducto(String nombreFav) 
   {
       favoritos.remove(nombreFav);
   }
       
    /**
     * Pide una cantidad especifica de un producto.
     *
     * @param  El nombre del producto en la lista de favoritos y la cantidad.
     * @return  
     */
    public void HacerPedido(String producto, int cantidad)
    {   
        int stockRestante = 0;
        int stock = 0;
        Product p1 = favoritos.get(producto);       
        
        stock = p1.getQuantity();
        stockRestante = stock - cantidad;
        
        if (stockRestante >= 0) {
            p1.setQuantity(stockRestante);
            
            if (p1.getQuantity() < p1.getStockMinimo()) {            
                p1.setQuantity(p1.getStockMinimo()+1);
                System.out.println("Stock reestablecido del producto " + p1.getName() +".");
            }                       
        }
        else {
            System.out.println("No hay suficiente stock del producto " + producto + ".");
        }      
    }  
    
    /**
     * Pide una unidad de cada producto añadido a la lista de favoritos.
     *
     * @param  
     * @return 
     */
    public void HacerPedidoFavoritos(){
        
        for(String key : favoritos.keySet()){
            HacerPedido(key,1);    
        }
        
    }
    
    /**
     * Comprueba que existe un producto en la lista de favoritos.
     *
     * @param  nombreFav El nombre del producto a buscar.
     * @return  
     */
    public void buscarEnFavoritos(String nombreFav){
               
        for(String key : favoritos.keySet())
        {
               
            if (favoritos.size() == 0  || !favoritos.containsKey(nombreFav)) {
                System.out.println("No existe/no hay productos favoritos");
            }
            
            if (favoritos.containsKey(nombreFav)){
                System.out.println("Producto con nombre " + nombreFav + " encontrado");
            }                                   
        }
    }
    
}
