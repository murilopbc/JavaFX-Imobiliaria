package br.com.imobiliaria.model;

public class Calculos {
    public double calcularAreaQuadrado(double lado) {
        return lado * lado ;
    }
    public double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }
    public double calcularAreaTriangulo(double base, double altura){
        return (base * altura) / 2;
    }
    public double calcularAreaCirculo(double raio){
        return 3.14 * Math.pow(raio, 2);
    }
    public double calcularAreaLosango(double dMenor, double dMaior){
        return (dMenor * dMaior) / 2;
    }
}
