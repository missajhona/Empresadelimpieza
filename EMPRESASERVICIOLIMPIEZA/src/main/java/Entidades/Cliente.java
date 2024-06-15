package entidades;

import java.util.Scanner;

public class Cliente extends Personal {

    private String direccion;
    private String telefono;

    //Constructor por defecto
    public Cliente() {
        super();
    }

    //Constructor parametrizado
    public Cliente(String nombres, String apellidos, String cedula, 
            String email, String direccion, String telefono) {
        super(nombres, apellidos, cedula, email);
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Getters y Setters
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        String telefonoRegex = "^[0-9]{10}$";
        if (telefono.length() != 10) {
            System.out.println("El telefono debe tener 10 digitos");
        } else if (!telefono.matches(telefonoRegex)) {
            System.out.println("El telefono debe tener solo digitos");
        } else {
            this.telefono = telefono;
        }
    }

    //sobrescritura de metodos
    @Override
    public void saludar() {
        System.out.println("Hola, soy un cliente. Mi nombre es " 
                + this.getNombres());
    }

    @Override
    public void realizarActividad() {
        System.out.println("Estoy solicitando un servicio de limpieza.");
    }

    @Override
    public String toString() {
        return "Cliente: " + super.toString() 
                + ", direccion=" + direccion + ", telefono=" + telefono;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Mostrando Cliente");
        super.mostrarInfo();
        System.out.println("Direccion: " + this.direccion);
        System.out.println("Telefono: " + this.telefono);
    }

    @Override
    public void ingresarDatos(Scanner scan) {
        System.out.println("\nIngresando Cliente");
        super.ingresarDatos(scan);
        System.out.print("Direccion: ");
        this.setDireccion(scan.nextLine());
        System.out.print("Telefono: ");
        this.setTelefono(scan.nextLine());
    }

    @Override
    public String obtenerIdentificador() {
        return this.getCedula();
    }

    @Override
    public void mostrarIdentificador() {
        System.out.println("Identificador del cliente: " + this.getCedula());
    }
}
