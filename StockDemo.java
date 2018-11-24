/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2011.07.31
 */
public class StockDemo
{
    private StockManager sww;
    private Client gameDP;
    private Product p1;
    private Product p2;
    private Product p3;
    private Product p4;
    private Product p5;
    private Product p6;
    private Product p7;
    private Product p8;
    private Product p9;
    private Product p10;
    private Product p11;
    private Product p12;
    private Product p13;
    private Product p14;
    private Product p15;
    private Product p16;
    private Product p17;
    private Product p18;
    private Product p19;
    private Product p20;
    private Product p21;
    private Product p22;
    private Product p23;
    private Product p24;
    private Product p25;
    

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo()
    {
        sww = new StockManager();
        gameDP = new Client("gameDP", 10, 30, "Cáceres");
        p1 = new Product(1, "Figura Han Solo", 2, 3);
        p2 = new Product(2, "Figura Luke Skywalker", 2, 3);
        p3 = new Product(3, "Figura Leia Organa", 5, 3);
        p4 = new Product(4, "Figura Darth Vader", 5, 3);
        p5 = new Product(5, "Figura Obi-Wan Kenobi", 5, 3);
        p6 = new Product(6, "Figura R2-D2", 5, 3);
        p7 = new Product(7, "Figura C-3PO", 5, 3);
        p8 = new Product(8, "Figura Kylo Ren", 4, 2);
        p9 = new Product(9, "Figura Conde Dooky", 4, 2);
        p10 = new Product(10, "Figura Padme Amidala", 4, 2);
        p11 = new Product(11, "Figura Rey", 4, 2);
        p12 = new Product(12, "Figura Emperador Palpatine", 0, 1);
        p13 = new Product(13, "Figura Darth Maul", 4, 2);
        p14 = new Product(14, "Figura Jabba the Hutt", 4, 2);
        p15 = new Product(15, "Figura Yoda", 4, 2);
        p16 = new Product(16, "Figura General Hux", 4, 1);
        p17 = new Product(17, "Nave Enterprise", 6, 2);
        p18 = new Product(18, "Nave Halcon Milenario", 6, 2);
        p19 = new Product(19, "Nave Tie Fighter", 0, 2);
        p20 = new Product(20, "Nave X-Wing", 6, 2);
        p21 = new Product(21, "Maqueta Alderaan", 8, 2);
        p22 = new Product(22, "Maqueta Dagobah", 8, 2);
        p23 = new Product(23, "Maqueta Hoth", 8, 2);
        p24 = new Product(24, "Maqueta Corellia", 8, 2);
        p25 = new Product(25, "Figura Chewbacca", 5, 3);
        
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void puntos1y2()
    {
        System.out.println("Puntos 1 y 2: StockManager(sww) y Cliente(gameDP) creados en el constructor");     
    }
    
    public void punto3() {
        System.out.println("Punto 3:");
        sww.findProduct(1);
    }
    
    public void demoPunto4() {
        System.out.println("Punto 4: Añadimos las figuras de Han Solo y Darth Vader y probamos a buscar.");
        gameDP.AnadirProducto("Han Solo", p1);
        gameDP.AnadirProducto("Darth Vader", p4);
        gameDP.buscarEnFavoritos("Han Solo");
        gameDP.buscarEnFavoritos("Darth Vader");
    }
    
    public void demoPuntos567() {
        System.out.println("Puntos 5, 6 y 7. Añadiendo 25 productos");
        sww.addProduct(p1);  
        sww.addProduct(p2); 
        sww.addProduct(p3); 
        sww.addProduct(p4); 
        sww.addProduct(p5); 
        sww.addProduct(p6); 
        sww.addProduct(p7); 
        sww.addProduct(p8);
        sww.addProduct(p9); 
        sww.addProduct(p10); 
        sww.addProduct(p11); 
        sww.addProduct(p12); 
        sww.addProduct(p13); 
        sww.addProduct(p14); 
        sww.addProduct(p15); 
        sww.addProduct(p16); 
        sww.addProduct(p17); 
        sww.addProduct(p18); 
        sww.addProduct(p19); 
        sww.addProduct(p20); 
        sww.addProduct(p21); 
        sww.addProduct(p22); 
        sww.addProduct(p23); 
        sww.addProduct(p24); 
        sww.addProduct(p25);
        sww.mostrarListaProductos();
    }
    public void punto8() {
        System.out.println("Punto 8:");
        sww.findProduct(16);
    }
    
    public void punto9() {
        System.out.println("Punto 9:");
        gameDP.buscarEnFavoritos("Figura Yoda");
    }
    
    public void punto10() {
        gameDP.AnadirProducto("Han", p1);
        gameDP.AnadirProducto("Darth", p4);
        gameDP.AnadirProducto("5", p5);
        gameDP.AnadirProducto("8", p8);
        gameDP.AnadirProducto("19", p19);
        gameDP.AnadirProducto("23", p23);
        gameDP.AnadirProducto("12", p12);
        gameDP.AnadirProducto("25", p25);
        gameDP.HacerPedidoFavoritos();
    }
    
    /**
     * Show details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void showDetails(int id)
    {
        Product product = getProduct(id);
        if(product != null) {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Sell one of the given item.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int id)
    {
        Product product = getProduct(id);
        
        if(product != null) {
            showDetails(id);
            product.sellOne();
            showDetails(id);
        }
    }
    
    /**
     * Get the product with the given id from the manager.
     * An error message is printed if there is no match.
     * @param id The ID of the product.
     * @return The Product, or null if no matching one is found.
     */
    public Product getProduct(int id)
    {
        Product product = sww.findProduct(id);
        if(product == null) {
            System.out.println("Product with ID: " + id +
                               " is not recognised.");
        }
        return product;
    }

    /**
     * @return The stock manager.
     */
    public StockManager getManager()
    {
        return sww;
    }
}
