
package herencia_museo;



public class Obra{
   
public String nombre;
public String autor;
public float precio;
public String estado;

    public Obra(String nombre, String autor, float precio, String estado) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
        this.estado = estado;
    }

    void imprimir(){
        System.out.println('\n' + this.nombre + " de " + autor + '\n' + "Precio: " + precio + " €" + '\n' + "Estado: " +  estado );
    }

               
}


