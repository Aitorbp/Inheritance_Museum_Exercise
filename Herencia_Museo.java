
package herencia_museo;

import java.util.ArrayList;
import java.util.Scanner;


public class Herencia_Museo {

    public static void main(String[] args) {

       /**
        * Array con todas las obras
        */
        ArrayList <Obra> obras = new ArrayList();
        obrasIncorporadas(obras);        
        inicioAplicacion(obras);
    }
    
    /**
     * 
     * Método general para pedir que quieres hacer y ejecuta todo el código 
     */    
    static void inicioAplicacion (ArrayList<Obra> obras){
        
        int respuesta;
        do{
            System.out.println("Qué acciones quieres realizar en el Museo: "+ '\n' +
                    " 1 - Ver una obra en particular" + '\n' +
                    " 2 - Ver todas las obras" + '\n' +
                    " 3 - Filtrar por categoría (pinturas, esculturas o representaciones): " + '\n' +
                    " 4 - Observar las obras que están en venta" + '\n' +
                    " Pulse 5 para salir de la aplicación");
            Scanner entrada = new Scanner(System.in);
            respuesta = entrada.nextInt();
            
            switch(respuesta){
                case 1: mostrarObra(obras);
                break;
                case 2: imprimirInventario(obras);
                break;
                case 3: mostrarCategoria(obras);
                break;
                case 4: imprimirObrasVendidas(obras);
                break;
                case 5:
                break;
                default: System.out.println('\n' +"Esa acción es incorrecta. Por favor escriba correctamente la busqueda." + '\n' );    
            }
            
        } while(5!=respuesta);
            
        }
       
        /**
         * 
         * Método para mostrar todos los libros y sus características 
         */
        static void mostrarInventario(ArrayList<Obra> obras){
          
            for (int i = 0; i < obras.size(); i++) {
               obras.get(i).imprimir();
           }   
        }

        /**
         * 
         * Método para imprimir las obras
         */
    
        static void imprimirInventario(ArrayList<Obra> obras){
        System.out.println("Seguro que quiere ver todas las obras del Museo (SI o NO): \n");
            Scanner entrada = new Scanner(System.in);
            String respuestaTodasObras = entrada.nextLine();
            if(respuestaTodasObras.equalsIgnoreCase("si")){
                mostrarInventario(obras);
            }  
        }
        
        /*
         Método para mostrar una obra en particular 
        */  
        static void mostrarObra(ArrayList<Obra> obras){
            String respuestaObrasParticular;
            do{
                System.out.println("Que obra quiere ver: \n" + " (Escribe 'atras' para volver al principio)");
            Scanner entrada = new Scanner(System.in);
            respuestaObrasParticular = entrada.nextLine();

            buscarObra(obras, respuestaObrasParticular);
            } while(!"atras".equalsIgnoreCase(respuestaObrasParticular)); 
        }
        
        
        /*
        //Método para mostrar las obras por categoría 
        */

        static void mostrarCategoria(ArrayList<Obra> obras){
            String respuestaCategoria;
            do{
                System.out.println("Qué categoría quiere ver (pinturas, esculturas o representaciones): \n" +" (Escribe 'atras' para volver al principio)");
            Scanner entrada = new Scanner(System.in);
            respuestaCategoria = entrada.nextLine();
            
            buscarCategoria(obras, respuestaCategoria);
                
            } while(!"atras".equalsIgnoreCase(respuestaCategoria));
        }
                
        /**
         * 
         * 
           Método estructura de Obras en particular
        */
        
        static void buscarObra(ArrayList<Obra> obras, String respuestaObrasParticular){
            for (int i = 0; i < obras.size(); i++) {
                if(obras.get(i).nombre.equalsIgnoreCase(respuestaObrasParticular)){
                  
                    if(obras.get(i) instanceof Pintura) {
                        obras.get(i).imprimir();   
                    }

                    if(obras.get(i) instanceof Escultura) {
                        obras.get(i).imprimir();
                    }
                    
                    if(obras.get(i) instanceof Representacion) {
                        obras.get(i).imprimir();
                    }
                }
            }
        }
        
        
        /**
         * 
         * Método estructura de Categorias 
         */
        
        static void buscarCategoria(ArrayList<Obra> obras, String respuestaCategoria){
                    if (respuestaCategoria.equalsIgnoreCase("pinturas") ){
                         for (int i = 0; i < obras.size(); i++) {
                             if(obras.get(i) instanceof Pintura) {
                           obras.get(i).imprimir();}
                         }  
                    }

                    if (respuestaCategoria.equalsIgnoreCase("esculturas")){
                         for (int i = 0; i < obras.size(); i++){   
                            if(obras.get(i) instanceof Escultura) { // instanceof comprueba si la obra que has sacado es una escultura y así acceder a sus propiedades.
                              obras.get(i).imprimir();}
                         }     
                    }
  
                    if (respuestaCategoria.equalsIgnoreCase("representaciones")){
                         for (int i = 0; i < obras.size(); i++){   
                            if(obras.get(i) instanceof Representacion) {
                           obras.get(i).imprimir();}
                         }  
                    }
        }

        /**
         * 
         * Método para incorporar las obras en el array declarado al principio del código.
         */
        static void obrasIncorporadas(ArrayList <Obra> obras){
            
            // Pinturas
            
            Pintura LosGirasoles = new Pintura("Los Girasoles", "Van Gogh", 100000000,"No está en venta", 5,3);        
            Pintura LaGioconda = new Pintura("La Gioconda","Leonardo Da Vinci", 700000000, "No está en venta", 7,7);
            Pintura LaUltimaCena = new Pintura("La Ultima Cena","Leonardo Da Vinci", 10000000, "En venta", 10,10);
            Pintura LasMeninas = new Pintura("Las Meninas","Diego Velázquez",9000000,"En venta",5,5);

                 // Esculturas

            Escultura ElDavid = new Escultura("El David","Miguel Ángel",23000000,"No está en venta","Marmol blanco", 8);
            Escultura ElMoises = new Escultura("El Moises","Miguel Ángel", 40000000, "En venta","Marmol Blanco", 2.5f );
            Escultura ElDiscobolo = new Escultura("El Discobolo", "Mirón de Eléuteras", 3000000, "No está en venta", "Bronce", 3.8f);
                 // Representaciones
            Representacion RomeoyJulieta = new Representacion("Romeo y Julieta","William Shakespeare", 5600000,"No está en venta", 17, 18);
            Representacion LaCelestina = new Representacion("La celestina","Fernando de Rojas", 1890000,"No está en venta",13,18);

            obras.add(LosGirasoles);
            obras.add(LaGioconda);
            obras.add(LaUltimaCena);
            obras.add(LasMeninas);
            obras.add(ElDavid);
            obras.add(ElMoises);
            obras.add(ElDiscobolo);
            obras.add(RomeoyJulieta);
            obras.add(LaCelestina);
        }
        /**
         * 
         * Método para imprimir las obras
         */
    
        static void imprimirObrasVendidas(ArrayList<Obra> obras){
        System.out.println('\n' +"Aquí puede ver todas las obras en venta: ");
        
                    for (int i = 0; i < obras.size(); i++) {
               if(obras.get(i).estado.equalsIgnoreCase("En venta")){
                   obras.get(i).imprimir();
               }
           }       
        }
     
}   
           
       

