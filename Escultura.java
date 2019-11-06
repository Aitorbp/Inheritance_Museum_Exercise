
package herencia_museo;

public class Escultura extends Obra{
    public String material;
    public float altura;

    public Escultura(String nombre, String autor, float precio, String estado,String material, float altura) {
        super(nombre, autor, precio, estado);
        this.material = material;
        this.altura = altura;
    }
     @Override
   void imprimir(){
       super.imprimir();
        System.out.println("Altura: " + altura + " metros" +'\n' + "Material: " + material +'\n');
   }
}
