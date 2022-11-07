
package Modelo;

public class Vehiculo extends Persona{
    private String TipoVehiculo;
    private String nPlaca;
    private String Color;
    
    public Vehiculo(){
    
    }
    public Vehiculo(String Nombre, String Apellido, String TipoCargo,String BloqueParqueadero, int HorasUso, String TipoVehiculo, String nPlaca, String Color){
        super(Nombre, Apellido, TipoCargo, BloqueParqueadero, HorasUso);
        this.TipoVehiculo = TipoVehiculo;
        this.nPlaca = nPlaca;
        this.Color = Color;
    }

    public String getTipoVehiculo() {
        return TipoVehiculo;
    }

    public void setTipoVehiculo(String TipoVehiculo) {
        this.TipoVehiculo = TipoVehiculo;
    }

    public String getnPlaca() {
        return nPlaca;
    }

    public void setnPlaca(String nPlaca) {
        this.nPlaca = nPlaca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "TipoVehiculo=" + TipoVehiculo + ", nPlaca=" + nPlaca + ", Color=" + Color + '}';
    }
}
