package Administrador;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.EquipoDeLimpieza;
public class AdministradoraEquipoDeLimpieza {
    Scanner sc = new Scanner(System.in);
    static public ArrayList<EquipoDeLimpieza> equipos = new ArrayList<>();
    static public int generarId(){
        int id;
        id = equipos.size() +1;
        return id;
    }
    public EquipoDeLimpieza obtenerEquipo(){
        this.mostrarMinimizado();
        int indexEquipoElegido;
        do{
            System.out.println("Index del equipo: ");
            indexEquipoElegido= sc.nextInt();
            indexEquipoElegido-=1;
        } while (0>indexEquipoElegido || indexEquipoElegido>=AdministradoraEquipoDeLimpieza.equipos.size());
        
        EquipoDeLimpieza equipo= AdministradoraEquipoDeLimpieza.equipos.get(indexEquipoElegido);
        return equipo;
    }

    public void agregar(EquipoDeLimpieza equipoNuevo){
        boolean yaExiste=false;
        for (EquipoDeLimpieza equipo: equipos){
            if (equipo.getId() == equipoNuevo.getId()){
                yaExiste=true;
                break;
            }
        }
        if (yaExiste){
            System.out.println("Error: El ID debe ser único.");
        } else {
            equipos.add(equipoNuevo);
        }
        
    }
    public void agregar(EquipoDeLimpieza equipoExistente, int cantidad){
        if (cantidad <=0){
            System.out.println("Debe agregar al menos un elemento");
        } else {
            equipoExistente.setCantidad(equipoExistente.getCantidad()+ cantidad);
        }
        
    }
    public void quitar(EquipoDeLimpieza equipo){
        equipos.remove(equipo);
    }
    public void quitar(EquipoDeLimpieza equipo, int cantidad){
        if (cantidad > equipo.getCantidad()){
            System.out.println("Error: no puede quitar más de "+equipo.getCantidad() +" equipos." );
        } else{
            equipo.setCantidad(equipo.getCantidad() - cantidad);
        }
        
    }
    public void mostrarMinimizado(){
        int cont=1;
        if (equipos.size() ==0){
            System.out.println("No hay equipos todavía.");
        } else {
            System.out.println("");
            for (EquipoDeLimpieza equipo:equipos){
                System.out.print(cont+ ". ");
                equipo.mostrarMinimo();
                cont++;
            }
        }
    }
    public void mostrar(){
        int cont=1;
        if (equipos.size() ==0){
            System.out.println("No hay equipos todavía.");
        } else {
            for (EquipoDeLimpieza equipo:equipos){
                System.out.print(cont+ ". ");
                equipo.mostrar();
                cont++;
            }
        }
        
    }
    public void buscar(String nombre){
        boolean encontrado=false;
        for( EquipoDeLimpieza equipo: AdministradoraEquipoDeLimpieza.equipos){
            if (equipo.getNombre().equalsIgnoreCase(nombre)){
                System.out.println("Equipo encontrado");
                encontrado = true;
                equipo.mostrar();
            } 
        }
        if (!encontrado){
            System.out.println("No se encontró ningún equipo con ese nombre");
            
        }
    }
    public void buscar(int id){
        boolean encontrado=false;
        for( EquipoDeLimpieza equipo: AdministradoraEquipoDeLimpieza.equipos){
            if (equipo.getId()== id){
                System.out.println("Equipo encontrado");
                encontrado = true;
                equipo.mostrar();
            } 
        }
        if (!encontrado){
            System.out.println("No se encontró ningún equipo con ese nombre");
            
        }
    }
}
