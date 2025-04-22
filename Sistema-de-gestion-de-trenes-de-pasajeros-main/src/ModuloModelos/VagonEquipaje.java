package ModuloModelos;

public class VagonEquipaje extends Vagon{
    private Equipaje[] equipaje;
    private int CargaMaxima;

    public VagonEquipaje(String id, double CargaMaxima, Equipaje[] equipaje) {
        super(id,CargaMaxima);
        this.equipaje = equipaje;
    }

    public Equipaje[] getEquipaje() {
        return equipaje;
    }

    public void setEquipaje(Equipaje[] equipaje) {
        this.equipaje = equipaje;
    }
}
