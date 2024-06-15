package Entidades;
//import java.util.ArrayList;
import java.util.Scanner;
import interfaces.IOperacionesServicioDeLimpieza;
import interfaces.IOperacionesEntidades;
public class ServicioDeLimpieza implements IOperacionesServicioDeLimpieza, IOperacionesEntidades
{
    //Atributos
    private String nombreDeservicio;
    private String descripcion;
    private float precioServicio;
    private int tiempo;
    //private Supervisor supervisor; // cada servicio de limpieza debe conta con un supervisor
    // private Estudiante[] listaEstudiante;
    
    //private ArrayList<PersonalDeLimpieza> listaPersonalDeLimpieza = new
     //ArrayList();
        
    // El servicio de limpieza cuenta con el listado de personal de limpieza, relacion de asociacion
    //CONSTRUCTOR
        
    public ServicioDeLimpieza() {
        this.nombreDeservicio = "Para verificacion";
    }
  
    public ServicioDeLimpieza(String nombreDeServicio, String descripcion, float precioServicio, int tiempo) {
        this.nombreDeservicio = nombreDeServicio;
        this.descripcion = descripcion;
        this.precioServicio = precioServicio;
        this.tiempo = tiempo;
    }

    // Métodos get y set
    public String getNombreDeservicio() {
        return nombreDeservicio;
    }

    public void setNombreDeservicio(String nombreDeServicio) {
        this.nombreDeservicio = nombreDeServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecioServicio() {
        return precioServicio;
    }

    public void setPrecioServicio(float precioServicio) {
         if (precioServicio <= 0 || precioServicio > 99999) {
            System.out.println("Precio no valido el precio debe ser mayor a 0 y mejor a 99999");
        } else {
         this.precioServicio = precioServicio;
        }
    }
    public int getTiempo() {
        return tiempo;
    }
    
    public void setTiempo(int tiempo){
        this.tiempo= tiempo;
    }

    //public void setHorario(int DuracionServicio) {
    //    this.duracionServicio = DuracionServicio;
    //}
    // get y set para supervisor
    //public Supervisor getSupervisor() {
    //    return this.supervisor;
    //
    //public void setSupervisor(Supervisor super) {
    //    this.supervisor = super;
    //}
       //get y set para lista Personal de limpieza
    //public ArrayList<PersonalDeLiempieza> getListaPersonalDeLiempieza() {
    //    return this.PersonalDeLiempieza;
    //}

    //public void setListaPersonalDeLiempieza(ArrayList<PersonalDeLiempieza> lista) {
    //    this.listaPersonalDeLiempieza = lista;
    //}
        // sobrecarga de metodos
    //public void calcularPrecioFinal(float porcentajeDescuento) {
    //    this.precio = this.precio - (this.precio * porcentajeDescuento);
    //}

    //public double calcularPrecioFinal(int horas) {
    //    if (horas > 100) {
    //        this.precio = this.precio - (this.precio * 0.10f);
            // aplica 10% de descuento
    //    }
    //    return this.precio;//
    //}
        public void mostrarInfo() {
        System.out.println("\nMostrando Servicio:");
        System.out.println("Nombre del Servicio: " + this.getNombreDeservicio());
        System.out.println("Decripcion: " + this.getDescripcion());
        System.out.println("Precio: " + this.getPrecioServicio());
        System.out.println("Supervisor: ");
        //if (this.Supervisor != null) {
        //    this.supervisor.mostrarInfo();
        //}
        System.out.println("Lista de Personal de limpieza: ");
        //if (this.listaPersonalDeLimpieza != null) {
            // recorre la lista de estudiantes y
            // llama a metodo mostrarInfo de cada uno
            //for (int i = 0; i < listaPersonalDeLimpeza.size(); i++) {
            //    listaPersonalDeLimpieza.get(i).mostrarInfo();
            //}
        //}
        System.out.println("Lista de Equipo de limpieza: ");
        if (this.listaEquipoDeLimpieza != null) {
            // recorre la lista de personal de limpieza y llama a metodo mostrarInfo de cada uno
            for (int i = 0; i < listaEquipoDeLimpeza.size(); i++) {
                listaEquipoDeLimpieza.get(i).mostrarInfo();
            }
        }    
    }
        
    public void ingresarDatos(Scanner scan) {
        System.out.println("\nIngresando Servicio de limpieza:");
        System.out.println("Nombre del servicio: ");
        this.setNombreDeservicio(scan.nextLine());
        System.out.println("Descripcion: ");
        this.setDescripcion(scan.nextLine());
        System.out.print("Precio del servicio: ");
        //this.precioServicio = Float.parseFloat(scan.nextLine())
                }
    
   // modificar un metodo heredado por esta clase (sobreescritura)
    // toString se hereda de Object

    @Override
    public void calcularCostoFinal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void calcularCostoFinal(int DuracionServicio, int empleados) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarDetalles() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
