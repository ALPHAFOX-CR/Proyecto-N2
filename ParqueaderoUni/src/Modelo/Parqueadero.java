package Modelo;

public abstract class Parqueadero implements Tarifa {

    private String BloqueParqueadero;
    private int HorasUso;

    public Parqueadero() {

    }

    public Parqueadero(String BloqueParqueadero, int HorasUso) {
        this.BloqueParqueadero = BloqueParqueadero;
        this.HorasUso = HorasUso;
    }

    public String getBloqueParqueadero() {
        return BloqueParqueadero;
    }

    public void setBloqueParqueadero(String BloqueParqueadero) {
        this.BloqueParqueadero = BloqueParqueadero;
    }

    public int getHorasUso() {
        return HorasUso;
    }

    public void setHorasUso(int HorasUso) {
        this.HorasUso = HorasUso;
    }

    @Override
    public double PagoTarifa() {
        double Descuento, Total;
        double Valor = 3000;
        Descuento = Valor * Tarifa.valorTarifa;
        Total = Valor - Descuento;
        return Total;
    }
}
