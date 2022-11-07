 
package Modelo;

public class Persona extends Parqueadero{
    private String Nombre;
    private String Apellido;
    private String TipoCargo;
    
    public Persona(){
    
    }
    public Persona(String Nombre, String Apellido, String TipoCargo, String BloqueParqueadero, int HorasUso){
        super(BloqueParqueadero, HorasUso);
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.TipoCargo = TipoCargo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTipoCargo() {
        return TipoCargo;
    }

    public void setTipoCargo(String TipoCargo) {
        this.TipoCargo = TipoCargo;
    }
  
}
