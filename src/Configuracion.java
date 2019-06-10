// @author Alison
 
public abstract class Configuracion {
    //Atributos
    protected String nombre;
    protected String nueva_foto;
    protected int nueva_contra;
    protected String nueva_ubicacion;
    protected String nuevo_idioma;
    protected String nuevo_correo;
    protected String configuracion_idioma;
    
    //Métodos 
    abstract void cambio_foto();
    abstract int nueva_contra();
    abstract String nueva_ubicacion();
    abstract String cambio_contra();
    abstract String cambio_idioma();
    abstract String nuevo_correo();
    abstract String cambiar_nombre();
   
}

 