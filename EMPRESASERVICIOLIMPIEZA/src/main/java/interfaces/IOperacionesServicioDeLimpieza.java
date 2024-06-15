package interfaces;
public interface IOperacionesServicioDeLimpieza {
    // Constantes
    float DESCUENTO = 0.10f;

    // Métodos abstractos
    void calcularCostoFinal();

    void calcularCostoFinal(int DuracionServicio, int empleados);

    void mostrarDetalles();
}
 

