
/**
 * Write a description of class Comment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comment
{
    // instance variables - replace the example below with your own
    private Client cliente;
    private Product producto;
    private String comentario;
    private int puntuacion;

    /**
     * Constructor for objects of class Comment
     */
    public Comment()
    {
        // initialise instance variables
        cliente = new Client();
        producto = new Product();
        comentario = "";
        puntuacion = 0;
    }
    
    /**
     * Pone en la variable puntuacion un valor introducido por parametros
     * 
     * @param puntuacion ( valor de la puntuacion )
     * @return 
     */
    public void setPuntuacion(int puntuacion){
        
        this.puntuacion = puntuacion;       
        
    }
    
    /**
     * Pone en la variable comentario un texto.
     * 
     * @param comentario ( comentario a añadir )
     * @return 
     */
    public void setComentario(String comentario){
        
        this.comentario = comentario;
                
    }

    /**
     * Reliza un comentario un cliente concreto sobre un producto concreto
     * 
     * @param c (cliente que hace el comentario), p (producto sobre el cual se hace el comentario), puntuacion (valor numerico de la puntuacion),
     * comentario (texto que contiene el comentario a añadir
     * @return      
     */
    public void hacerComentario(Client c, Product p,int puntuacion, String comentario)
    {   
        
        if ( c.getNumeroComentarios() == 0 ){
            if(puntuacion >= 1 && puntuacion <= 5){
                this.puntuacion = puntuacion;
                this.comentario = comentario;
                c.setNumeroComentarios(1);
                System.out.println("Comentario creado correctamente");
            }
            else{
               System.out.println("Comentario rechazado porque la puntuacion no esta entre 1 y 5."); 
                
            }
        }
        else{
            System.out.println("Comentario rechazado porque el cliente "+ c.getNombreCliente() + "  ya tenia un comentario");
        }
    }
    
    
}
