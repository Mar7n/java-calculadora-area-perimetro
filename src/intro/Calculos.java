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
public class Calculos {

    public Calculos() {
    }
    //Cuadrado
    public void Cuadrado_area(float lado){
        float area = lado * 2;
        System.out.println("El Area del cuadrado es: "+area);
    }
    public void Cuadrado_perimetro(float lado){
        float perimetro = lado * 4;
        System.out.println("El Perimetro del cuadrado es: "+perimetro);
    }
    //Poligono
    public void Poligono_area(float perimetro, float apotema){
        float area = perimetro * apotema;
        System.out.println("El Area del poligono es: "+area);
    }
    public void Poligono_perimetro(float lados, float cantidad_l){
        float perimetro = lados * cantidad_l;
        System.out.println("El Perimetro del poligono es: "+perimetro);
    }
    //Trapecio
    public void Trapecio_area(float altura, float Base, float base){
        float area = (altura * (Base * base))/2;
        System.out.println("El Area del trapecio es: "+area);
    }
    public void Trapecio_perimetro(float Base, float base, float lado){
        float perimetro = Base + base + lado * 2;
        System.out.println("El Perimetro del trapecio es: "+perimetro);
    }
    //Rombo
    public void Rombo_area(float Diagonal, float diagonal){
        float area = Diagonal * diagonal;
        System.out.println("El Area del rombo es: "+area);
    }
    public void Rombo_perimetro(float lado, float ladob, float ladoc, float ladod){
        float perimetro = lado + ladob + ladoc +ladod;
        System.out.println("El Perimetro del rombo es :"+perimetro);
    }
    //Romboide
    public void Romboide_area(float base, float altura){
        float area = base * altura;
        System.out.println("El Area del rombiode es: "+area);
    }
    public void Romboide_perimetro(float base, float altura){
        float perimetro = (base * 2) + (altura * 2);
        System.out.println("El Perimetro del rombiode es :"+perimetro);
    }
    //Triangulo
    public void Triangulo_area(float base, float altura){
        float area = (base * altura)/2;
        System.out.println("El Area del triangulo es: "+area);
    }
    public void Triangulo_perimetro(float lado, float ladob, float ladoc){
        float perimetro = lado + ladob + ladoc;
        System.out.println("El Perimetro del triangulo es: "+perimetro);
    }
    //Rectangulo
    public void Rectangulo_area(float base, float altura){
        float area = base * altura;
        System.out.println("El Area del rectangulo es: "+area);
    }
    public void Rectangulo_perimetro(float base, float altura){
        float perimetro = (base * 2) + (altura * 2);
        System.out.println("El perimetro del rectangulo es: "+perimetro);
    }
    //Circulo
    public void Circulo_area(float radio){
        float pi = 3.14159265f;
        float area = pi * (radio * radio);
        System.out.println("El Area del circulo es: "+area);
    }
    public void Circulo_perimetro(float diametro){
        float pi = 3.14159265f;
        float perimetro = pi * diametro;
        System.out.println("El Perimetro del circulo es: "+perimetro);
    }
}
