package Empresaserviciolimpieza;
import java.util.Scanner;
import Administrador.AdministradoraEquipoDeLimpieza;
import entidades.EquipoDeLimpieza;
public class EMPRESASERVICIOLIMPIEZA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
            System.out.println("0. Salir");
            op = sc.nextInt();
        
            switch (op) {
                case 0:
                    seguir = false;  
                    break;
                case 1:
                    System.out.println("Agregando nuevo producto...");
                    
                    EquipoDeLimpieza eq = new EquipoDeLimpieza();
                    eq.ingresarDatos(sc,AdministradoraEquipoDeLimpieza.generarId());
                    adm.agregar(eq);
                    break;
                case 2:
                    System.out.println("\nAgregando más productos de un equipo existente...");
                    
                    EquipoDeLimpieza equipo= adm.obtenerEquipo();
                    
                    int cantidadaAgregar;
                    do {
                        System.out.println("Cantidad a agregar: ");
                        cantidadaAgregar= sc.nextInt();
                    } while (cantidadaAgregar <0);
                    
                    equipo.setCantidad(equipo.getCantidad()+cantidadaAgregar);
    
                    break;
                case 3:
                    System.out.println("\nMostando inventario...");
                    adm.mostrar();
                    break;
                case 4:
                    EquipoDeLimpieza equip= adm.obtenerEquipo();
                    System.out.println("\nEliminando Equipo... ");
                    
                    int cant;
                    do {
                        System.out.println("Cantidad (-1 si quiere eliminar todo): ");
                        cant = sc.nextInt();
                    } while (cant<-1);
                    
                    if (cant ==-1){
                        
                        adm.quitar(equip);
                    } else {
                        System.out.println("\nEliminando "+ cant + "elementos");
                        adm.quitar(equip, cant);
                    }
                    
                    break;
                case 5:
                System.out.println("\nBuscando Equipo por nombre...");
                    String nombr;
                    do{
                        System.out.println("Nombre: ");
                        nombr = sc.nextLine();
                    } while (nombr.isEmpty());
                    
                    adm.buscar(nombr);
                    break;
            
                default:
                    System.out.println("\nOpción no válida");
                    break;
            }
        }
        
        
    }
    
}
