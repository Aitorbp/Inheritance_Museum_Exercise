
package herencia_museo;

public class Representacion extends Obra{
    public final int horaInicio;
    public final int horaFin;

    public Representacion(String nombre, String autor, float precio, String estado,int horaInicio, int horaFin) {
        super(nombre, autor, precio, estado);
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }
     @Override
   void imprimir(){
       super.imprimir();
        System.out.println("Hora de inicio: " + horaInicio + " horas" +'\n' + "Hora de fin: " + horaFin + " horas" +'\n');
}
}