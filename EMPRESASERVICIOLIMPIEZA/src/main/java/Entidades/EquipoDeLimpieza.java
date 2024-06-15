package entidades;
import interfaces.IOperacionesEntidades;
import java.util.Scanner;
public class EquipoDeLimpieza implements IOperacionesEntidades {
    
    private int id;
    private String nombre;
    private float costoUnidad;
    private int cantidad;
    private String fechaIngreso;
    private int vidaUtil;
    
    public EquipoDeLimpieza(){

    }
    public EquipoDeLimpieza(int id, String nombre, float costoUnidad, int cantidad, String fechaIngreso,
            int vidaUtil) {
        this.id = id;
        this.nombre = nombre;
        this.costoUnidad = costoUnidad;
        this.cantidad = cantidad;
        this.fechaIngreso = fechaIngreso;
        this.vidaUtil = vidaUtil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id<= 0){
            System.out.println("El ID debe ser mayor a 0");
        } else {
            this.id = id;
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.isEmpty()){
            System.out.println("El nombre no debe estar vacío");
        }{
            this.nombre = nombre;
        }
        
    }

    public float getCostoUnidad() {
        return costoUnidad;
    }

    public void setCostoUnidad(float costoUnidad) {
        if(costoUnidad <0){
            System.out.println("El costo no debe ser negativo");
        } else {
            this.costoUnidad = costoUnidad;
        }
        
    }


    public int getCantidad() {
        return cantidad;
    }


    public void setCantidad(int cantidad) {
        if (cantidad <0){
            System.out.println("La cantidad no puede ser negativa");
        } else {
            this.cantidad = cantidad;
        }
        
    }


    public String getFechaIngreso() {
        return fechaIngreso;
    }


    public void setFechaIngreso(String fechaIngreso) {
        if (fechaIngreso.isEmpty()){
            System.out.println("La fecha no puede estar vacía");
        } else {
            this.fechaIngreso = fechaIngreso;
        }
        
    }

    public int getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(int vidaUtil) {
        if (vidaUtil <1 ){
            System.out.println("La vida útil no puede ser inferior a 1 día");
        } else {
            this.vidaUtil = vidaUtil;
        }
        
    }


    public void mostrar(){
        System.out.println(" "+getNombre()+ " ID "+getId()+":");
        System.out.println("Costo Unitario: $"+ getCostoUnidad() );
        System.out.println("Cantidad: "+getCantidad() );
        System.out.println("Fecha Ingreso: "+getFechaIngreso() );
        System.out.println("Vida Útil: "+getVidaUtil() );
        System.out.println("");

    }
    public void mostrarMinimo(){
        System.out.println(getNombre()+ " ID "+getId() +" Cantidad: "+getCantidad() );
        System.out.println("");

    }

    public void ingresarDatos(Scanner sc, int id){
        setId(id);
        String nombre;
        do {
            System.out.println("Nombre: ");
            nombre= sc.nextLine();
        } while(nombre.isEmpty());
        
        setNombre(nombre);
        int costo;
        do {
            System.out.println("Costo: ");
            costo = sc.nextInt();
        } while(costo<0);
        
        setCostoUnidad(costo);
        int cantidad;
        do{
            System.out.println("Cantidad: ");
            cantidad = sc.nextInt();
        } while(cantidad <0);
        
        setCantidad(cantidad);
        String fechaIngreso;
        do {
            System.out.println("Fecha de Ingreso: ");
            fechaIngreso= sc.nextLine();
        } while (fechaIngreso.isEmpty());
        
        setFechaIngreso(fechaIngreso);
        int vidaUtil;
        do{
            System.out.println("Vida Útil: ");
            vidaUtil = sc.nextInt();
        } while(vidaUtil<1);
        
        setVidaUtil(vidaUtil);
    }

    @Override
    public String obtenerIdentificador() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarIdentificador() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    
}