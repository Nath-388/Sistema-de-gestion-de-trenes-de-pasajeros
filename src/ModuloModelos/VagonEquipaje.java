package ModuloModelos;

public class VagonEquipaje extends Vagon{
    private Equipaje[] equipaje;

    public VagonEquipaje(String id, double cargaMaxim, Equipaje[] equipaje) {
        super(id,cargaMaxim);
        this.equipaje = equipaje;
    }

    public Equipaje[] getEquipaje() {
        return equipaje;
    }

    public void setEquipaje(Equipaje[] equipaje) {
        this.equipaje = equipaje;
    }
}
