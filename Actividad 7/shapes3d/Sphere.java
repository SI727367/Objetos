package shapes3d;

import javax.swing.*;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Sphere {

    private double radio = 0;

    public Sphere(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio){
        if (radio < 0) {
            System.out.println("Radiio Invalido");
            return;
        }
        this.radio = radio;
    }

    public double getradio(){
        return radio;
    }

    public double getvolume(){
        return ((double) 4/3*PI*pow(radio,3));
    }

    public double getarea(){
        return (PI*pow(radio,2));
    }

    public void printAVCircles(){
        JOptionPane.showMessageDialog(null,
                "Area = " + this.getarea() + "\n" +
                        "Volumen = " + this.getvolume() + "\n" +
                        "Radio = " + this.getradio(),
                "Datos",JOptionPane.INFORMATION_MESSAGE);
    }
}

