/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;
import java.util.Scanner;
/**
 * @author  i77m94
 * @since   02-09-2017
 */
public class Opciones {
    
    public Opciones() {
    }
    
    Calculos cal = new Calculos();
    
    public void menu(){
        System.out.println("[1] Calcular Area de figuras");
        System.out.println("[2] Calcular Perimetro de figuras");
    }
    
    public float opciones(){
        Scanner leer = new Scanner(System.in);
        int n = 0;
        float opcion = 0;// = Float.parseFloat(texto);
        while(n == 0){
            System.out.print("Ingresar opcion: ");
            String texto = leer.nextLine();
            //if (Comunes.isNumeric(cadenaUno))
            if (texto.matches("[0-9]")){
                opcion = Float.parseFloat(texto);
                n = 1;
                return opcion;
            }else{
                System.out.println("Error ingresar dato correcto");
            }
        }
        return 0;
    }
    
    //Lectura de numeros ingresados para realizar calculos
    public float numeros(String nombre){
        Scanner leer = new Scanner(System.in);
        int n = 0;
        float valor = 0;// = Float.parseFloat(texto);
        while(n == 0){
            System.out.print("Ingresar "+nombre+": ");
            String texto = leer.nextLine();
            //if (Comunes.isNumeric(cadenaUno))
            if (texto.matches("^(\\d|-)?(\\d|,)*\\.?\\d*$")){
                valor = Float.parseFloat(texto);
                n = 1;
                return valor;
            }else{
                System.out.println("Error ingresar dato numerico");
            }
        }
        return 0;
    }
    
    public void figuras(){
        System.out.println("Areas");
        System.out.println("[1]  Cuadrado");
        System.out.println("[2]  Rectangulo");
        System.out.println("[3]  Triangulo");
        System.out.println("[4]  Rombo");
        System.out.println("[5]  Romboide");
        System.out.println("[6]  Trapecio");
        System.out.println("[7]  Circulo");
        System.out.println("[8]  Poligono +5");
    }
    
    public void figuras_dato(String nombre){
        System.out.println("Seleccionar una figura para calcular su: "+nombre);
    }
    
    public void seleccion(float opcion){
        float aux;
        if(opcion == 1){
            Areas();
        }
        if(opcion == 2){
            Perimetros();
        }
        if(opcion != 1 & opcion != 2){
            aux = opciones();
            seleccion(aux);
        }
    }
    
    public void ciclo(){
        int n = 0;
        float opcion;
            menu();
            opcion = opciones();
            n = 0;
            seleccion(opcion);
    }
    
    public void Areas(){
        System.out.println("Areas");
        String nombre = "Area";
        figuras_dato(nombre);
        figuras();
        float opcion = opciones();
        Area_seleccion(opcion);
    }
    
    public void Perimetros(){
        System.out.println("Perimetros");
        String nombre = "Perimetro";
        figuras_dato(nombre);
        figuras();
        float opcion = opciones();
        Perimetro_seleccion(opcion);
    }
    
    public void Area_seleccion(float opcion){
        Ingreso_datos ing = new Ingreso_datos();
        if(opcion == 1){
            ing.area_cuadrado();
        }
        if(opcion == 2){
            ing.area_rectangulo();
        }
        if(opcion == 3){
            ing.area_triangulo();
        }
        if(opcion == 4){
            ing.area_rombo();
        }
        if(opcion == 5){
            ing.area_romboide();
        }
        if(opcion == 6){
            ing.area_trapecio();
        }
        if(opcion == 7){
            ing.area_circulo();
        }
        if(opcion == 8){
            ing.area_poligono();
        }
    }
    
    public void Perimetro_seleccion(float opcion){
        Ingreso_datos ing = new Ingreso_datos();
        if(opcion == 1){
            ing.perimetro_cuadrado();
        }
        if(opcion == 2){
            ing.perimetro_rectangulo();
        }
        if(opcion == 3){
            ing.perimetro_triangulo();
        }
        if(opcion == 4){
            ing.perimetro_rombo();
        }
        if(opcion == 5){
            ing.perimetro_romboide();
        }
        if(opcion == 6){
            ing.perimetro_trapecio();
        }
        if(opcion == 7){
            ing.perimetro_circulo();
        }
        if(opcion == 8){
            ing.perimetro_poligono();
        }
    }

    private boolean isNumeric(String texto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
