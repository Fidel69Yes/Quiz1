/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pkg1;

/**
 *
 * @author andre
 */
public class Rectangulo {
    private int ancho;
    private int altura;
    
    public int getAncho(){
        return ancho;
    }
    
     public void setAncho(int ancho) {
        if (ancho > 0) {
            this.ancho = ancho;
        } else {
            System.out.println("El ancho debe ser mayor que 0");
        }
    }
     public int getAltura() {
        return altura;
    }
    
    public void setAltura(int altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("La altura debe ser mayor que 0");
        }
    }
    
}
