package Beans;


import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class Numeros implements Serializable{
    /**
     * Se declaran los componentes
     * 
     */
    private int num1;
    private int num2;
    private int resu;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    /**
     * Se ejecuta la operación de suma
     * 
     */
    public int getResu() {
        return (this.num1+this.num2);
    }

    public void setResu(int resu) {
        this.resu = resu;
    }
    
}
