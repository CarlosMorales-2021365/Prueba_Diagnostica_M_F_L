package org.fredygarcia.models;

/**
 *
 * @author alexa
 */
public class Forma {
    int Color;

    public Forma() {
    }

    public Forma(int Color) {
        this.Color = Color;
    }

    public int getColor() {
        return Color;
    }

    public void setColor(int Color) {
        this.Color = Color;
    }

    @Override
    public String toString() {
        return "Forma{" + "Color=" + Color + '}';
    }
}
