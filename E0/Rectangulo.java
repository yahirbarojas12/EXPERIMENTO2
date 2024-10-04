package mx.unam.fi.poo.g1.e0; 
import mx.unam.fi.poo.g1.e0.*; 

public class Rectangulo extends Figura {
    private double base, altura; 

    public Rectangulo(double base, double altura){
        setBase(base);
        setAltura(altura);
    }
    public void setBase(double base){
        this.base = base;
    }
    public double getBase(){
        return this.base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return this.altura;
    }

    @Override
    public double area(){
        return this.base * this.altura;
    }

    @Override
    public String toString(){
        return "El area del rectangulo es: " + this.area();
    }
}