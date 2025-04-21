package ModuloUtillidades;

public class Configuracion {
        
    public static final int NUMMAX_VAGONES_MERCEDES = 28;
    public static final int NUMMAX_VAGONES_ARNOLD = 32;
    
    public static final int CAPACIDAD_TOTAL_VAGON = 40; 
    public static final int PERSONAL_ABORDO = 6; 
    public static final int ASIENTOS_PREMIUM = 4;
    public static final int ASIENTOS_EJECUTIVO = 8;
    public static final int ASIENTOS_ESTANDAR = 22;
    
    public static final int NUMMAX_EQUIPAJE_POR_PASAJERO = 2;
    public static final double PESO_MAX_EQUIPAJE = 80.0; 
    
    public static final int PROPORCION_VAGONES_CARGA_POR_PERSONA = 2; 
    public static final String[] CATEGORIAS_PASAJERO = {
            "Premium", "Ejecutivo", "Estandar"
    };
    
        public static void mostrarConfiguracion() {
            System.out.println(" CONFIGURACION DEL SISTEMA");
            System.out.println(" Vagones por tipo de tren:");
            System.out.println(" - Mercedes-Benz: max. " + NUMMAX_VAGONES_MERCEDES);
            System.out.println(" - Arnold: max. " + NUMMAX_VAGONES_ARNOLD);
    
            System.out.println("\n>> Capacidad por vagon de pasajeros:");
            System.out.println(" - Total (incluye tripulacion): " + CAPACIDAD_TOTAL_VAGON);
            System.out.println(" - Premium: " + ASIENTOS_PREMIUM);
            System.out.println(" - Ejecutivo: " + ASIENTOS_EJECUTIVO);
            System.out.println(" - Estandar: " + ASIENTOS_ESTANDAR);
            System.out.println(" - Personal a bordo: " + PERSONAL_ABORDO);
    
            System.out.println("\n>> Configuracion de equipaje:");
            System.out.println("   - Maximo por pasajero: " + NUMMAX_EQUIPAJE_POR_PASAJERO);
            System.out.println("   - Peso maximo por maleta: " + PESO_MAX_EQUIPAJE + " kg");
    
            System.out.println("\n>> Proporcion vagones de carga:");
            System.out.println(" - 1 vagon de carga cada " + PROPORCION_VAGONES_CARGA_POR_PERSONA + " de pasajeros");
    
            System.out.println("\n>> Categorias de pasajero:");
            for (String categoria : CATEGORIAS_PASAJERO) {
                System.out.println(" - " + categoria);
            }
           
}

}
