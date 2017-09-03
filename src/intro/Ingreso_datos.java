/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

/**
 * @author  i77m94
 * @since   02-09-2017
 */
public class Ingreso_datos {

    public Ingreso_datos() {
    }
    
    Opciones opc = new Opciones();
    Calculos cal = new Calculos();
    
    public void area_cuadrado(){
        float lado;
        String nombre = "valor lado";
        lado = opc.numeros(nombre);
        cal.Cuadrado_area(lado);
    }
    
    public void perimetro_cuadrado(){
        float lado;
        String nombre = "valor lado";
        lado = opc.numeros(nombre);
        cal.Cuadrado_perimetro(lado);
    }
    
    public void area_rectangulo(){
        float base;
        String nombre = "valor base";
        base = opc.numeros(nombre);
        float altura;
        String nombreb = "valor altura";
        altura = opc.numeros(nombreb);
        cal.Rectangulo_area(base, altura);
    }
    
    public void perimetro_rectangulo(){
        float base;
        String nombre = "valor base";
        base = opc.numeros(nombre);
        float altura;
        String nombreb = "valor altura";
        altura = opc.numeros(nombreb);
        cal.Rectangulo_perimetro(base, altura);
    }
    
    public void area_triangulo(){
        float base;
        String nombre = "valor base";
        base = opc.numeros(nombre);
        float altura;
        String nombreb = "valor altura";
        altura = opc.numeros(nombreb);
        cal.Triangulo_area(base, altura);
    }
    
    public void perimetro_triangulo(){
        float lado;
        String nombre = "valor ladoa";
        lado = opc.numeros(nombre);
        float ladob;
        String nombreb = "valor ladob";
        ladob = opc.numeros(nombreb);
        float ladoc;
        String nombrec = "valor ladoc";
        ladoc = opc.numeros(nombrec);
        cal.Triangulo_perimetro(lado, ladob, ladoc);
    }
    
    public void area_rombo(){
        float Diagonal;
        String nombre = "valor Diagonal Mayor";
        Diagonal = opc.numeros(nombre);
        float diagonal;
        String nombreb = "valor Diagonal Menor";
        diagonal = opc.numeros(nombreb);
        cal.Rombo_area(Diagonal, diagonal);
    }
    
    public void perimetro_rombo(){
        float lado;
        String nombre = "valor lado";
        lado = opc.numeros(nombre);
        float ladob;
        String nombreb = "valor ladob";
        ladob = opc.numeros(nombreb);
        float ladoc;
        String nombrec = "valor ladoc";
        ladoc = opc.numeros(nombrec);
        float ladod;
        String nombred = "valor ladod";
        ladod = opc.numeros(nombred);
        cal.Rombo_perimetro(lado, ladob, ladoc, ladod);
    }
    
    public void area_romboide(){
        float base;
        String nombre = "valor base";
        base = opc.numeros(nombre);
        float altura;
        String nombreb = "valor altura";
        altura = opc.numeros(nombreb);
        cal.Romboide_area(base, altura);
    }
    
    public void perimetro_romboide(){
        float base;
        String nombre = "valor base";
        base = opc.numeros(nombre);
        float altura;
        String nombreb = "valor altura";
        altura = opc.numeros(nombreb);
        cal.Romboide_perimetro(base, altura);
    }
    
    public void area_trapecio(){
        float Base;
        String nombre = "valor base mayor";
        Base = opc.numeros(nombre);
        float base;
        String nombreb = "valor base menor";
        base = opc.numeros(nombreb);
        float altura;
        String nombrec = "valor altura";
        altura = opc.numeros(nombrec);
        cal.Trapecio_area(altura, Base, base);
    }
    
    public void perimetro_trapecio(){
        float Base;
        String nombre = "valor base mayor";
        Base = opc.numeros(nombre);
        float base;
        String nombreb = "valor base menor";
        base = opc.numeros(nombreb);
        float lado;
        String nombrec = "valor lado";
        lado = opc.numeros(nombrec);
        cal.Trapecio_perimetro(Base, base, lado);
    }
    
    public void area_circulo(){
        float radio;
        String nombre = "valor radio";
        radio = opc.numeros(nombre);
        cal.Circulo_area(radio);
    }
    
    public void perimetro_circulo(){
        float diametro;
        String nombre = "valor diametro";
        diametro = opc.numeros(nombre);
        cal.Circulo_perimetro(diametro);
    }
    
    public void area_poligono(){
        float perimetro;
        String nombre = "valor perimetro";
        perimetro = opc.numeros(nombre);
        float apotema;
        String nombreb = "valor apotema";
        apotema = opc.numeros(nombreb);
        cal.Poligono_area(perimetro, apotema);
    }
    
    public void perimetro_poligono(){
        float lado;
        String nombre = "valor valor lado";
        lado = opc.numeros(nombre);
        float cantidad_l;
        String nombreb = "valor apotema";
        cantidad_l = opc.numeros(nombreb);
        cal.Poligono_perimetro(lado, cantidad_l);
    }
}