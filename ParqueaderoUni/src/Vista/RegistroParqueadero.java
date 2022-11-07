
package Vista;

import Modelo.*;
import java.util.ArrayList;

public class RegistroParqueadero {


    public static void main(String[] args) {
        Parqueadero nn = new Persona();
        Persona n1 = new Vehiculo("DIEGO", "CHINCHILLA", "PARTICULAR", "BLOQUE H", 8, "BICICLETA", "SDF-321", "NEGRO");
        Persona n2 = new Vehiculo("JUAN", "PEREZ", "ESTUDIANTE", "BLOQUE A", 3, "MOTO", "VBF-621", "BLANCO");
        Persona n3 = new Vehiculo("ANDRES", "LOPEZ", "DOCENTE", "BLOQUE B", 5, "CARRO", "KJH-981", "ROJO");
        Persona n4 = new Vehiculo("JORGE", "CHIMAS", "FUNCIONARIO", "BLOQUE P", 2, "CAMIONETA", "GVF-011", "GRIS");
        
        ArrayList<Vehiculo> lista = new ArrayList();
        lista.add((Vehiculo) n1);
        lista.add((Vehiculo) n2);
        lista.add((Vehiculo) n3);
        lista.add((Vehiculo) n4);
        
        System.out.println("-------- REGISTRO PARQUEADERO --------");
        System.out.println("");
        for(Vehiculo s: lista){
            agregarPersona(s);
            System.out.println("TARIFA    : " + nn.PagoTarifa());
            System.out.println("----------------------");
        }
    }

    private static void agregarPersona(Vehiculo agg) {
        
        System.out.println("NOMBRE    : " + agg.getNombre());
        System.out.println("APELLIDO  : " + agg.getApellido());
        System.out.println("CARGO     : " + agg.getTipoCargo());
        System.out.println("BLOQUE    : " + agg.getBloqueParqueadero());
        System.out.println("HORAS USO : " + agg.getHorasUso());
        System.out.println("VEHICULO  : " + agg.getTipoVehiculo());
        System.out.println("PLACA     : " + agg.getnPlaca());
        System.out.println("COLOR     : " + agg.getColor());
    }
    
}
