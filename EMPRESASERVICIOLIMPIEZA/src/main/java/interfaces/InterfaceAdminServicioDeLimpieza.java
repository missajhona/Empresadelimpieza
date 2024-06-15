package interfaces;
import Entidades.ServicioDeLimpieza;
import java.util.Scanner;
public interface InterfaceAdminServicioDeLimpieza {

    public void agregar(ServicioDeLimpieza Ser);

    public void elminar(ServicioDeLimpieza Ser);

    public void mostrar();

    public ServicioDeLimpieza buscarServicioxNombre(String nom);
    
    public ServicioDeLimpieza buscarServicioxId(String id);

    public void agregarSupervisorAServicio(Scanner em); // agregar Supervisor a un Servicio

    public void agregarEmpleadoAServicio(Scanner em); // agregar Empleado a la lista de Empleado de un servicio

    public void menuDeOpciones();

}
