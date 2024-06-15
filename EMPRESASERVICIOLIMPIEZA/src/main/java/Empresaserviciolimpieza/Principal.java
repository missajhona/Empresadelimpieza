import Administracion.AdministradoraEquipoDeLimpieza;
import entidades.EquipoDeLimpieza;
import entidades.Input;
public class Principal {
    
    public static void main(String[] args) {
        int op=10;
        boolean seguir = true;
        AdministradoraEquipoDeLimpieza adm = new AdministradoraEquipoDeLimpieza();
        while(seguir){
            System.out.println("\nEquipos de Limpieza:");
            System.out.println("1. Agregar equipo de limpieza");
            System.out.println("2. Aumentar cantidad de un equipo existente");
            System.out.println("3. Mostrar Inventario");
            System.out.println("4. Eliminar equipo");
            
            System.out.println("5. Buscar por nombre");
            System.out.println("6. Buscar por ID");
            System.out.println("0. Salir");
            op = Input.entero("Opción: ", 0);
        
            switch (op) {
                case 0:
                    seguir = false;  
                    break;
                case 1:
                    System.out.println("Agregando nuevo producto...");
                    
                    EquipoDeLimpieza eq = new EquipoDeLimpieza();
                    eq.ingresarDatos(AdministradoraEquipoDeLimpieza.generarId());
                    adm.agregar(eq);
                    break;
                case 2:
                    System.out.println("\nAgregando más productos de un equipo existente...");
                    
                    EquipoDeLimpieza equipo= adm.obtenerEquipo();
                    
                    int cantidadaAgregar = Input.entero("Cantidad a agregar: ", 0);
                    
                    equipo.setCantidad(equipo.getCantidad()+cantidadaAgregar);
    
                    break;
                case 3:
                    System.out.println("\nMostando inventario...");
                    adm.mostrar();
                    break;
                case 4:
                    EquipoDeLimpieza equip= adm.obtenerEquipo();
                    System.out.println("\nEliminando Equipo... ");
                    
                    int cant = Input.entero("Cantidad (-1 si quiere eliminar todo): ",-1);
                    
                    if (cant ==-1){
                        
                        adm.quitar(equip);
                    } else {
                        System.out.println("\nEliminando "+ cant + "elementos");
                        adm.quitar(equip, cant);
                    }
                    
                    break;
                case 5:
                    System.out.println("\nBuscando Equipo por nombre...");
                    String nombr= Input.cadena("Nombre: ");
                    adm.buscar(nombr);
                    break;
                case 6:
                    System.out.println("\nBuscando por Id...");
                    int id= Input.entero("ID: ", 0);
                    adm.buscar(id);
                    break;
            
                default:
                    System.out.println("\nOpción no válida");
                    break;
            }
        }
        
        
    }
    
}
