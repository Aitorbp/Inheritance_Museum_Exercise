package herencia_museo;


public class Pintura extends Obra{
   public float altura;
   public float ancho; 

    public Pintura(String nombre, String autor, float precio, String estado, float altura, float ancho) {
        super(nombre,autor, precio, estado);
        this.altura = altura;
        this.ancho = ancho;
    }
   
   @Override
   void imprimir(){
       super.imprimir();
        System.out.println("Altura: " + this.altura + " metros"+'\n' + "Anchura: " + this.ancho + " metros" +'\n');
    }
   
}


