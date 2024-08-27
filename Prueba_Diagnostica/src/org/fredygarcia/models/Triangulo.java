package org.fredygarcia.models;

/**
 *
 * @author alexa
 */
public class Triangulo extends Forma{
    double base;
    double altura;

    public Triangulo() {
        super();
    }

    public Triangulo(double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(double base, double altura, int color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
}
