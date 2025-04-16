package ModuloModelos;

public class VagonEquipaje extends Vagon{
    private Equipaje[] equipaje;

    public VagonEquipaje(Equipaje[] equipaje) {
        this.equipaje = equipaje;
    }

    public Equipaje[] getEquipaje() {
        return equipaje;
    }

    public void setEquipaje(Equipaje[] equipaje) {
        this.equipaje = equipaje;
    }
}
