/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upi.cr.ejerciciojframe.modelo;

/**
 *
 * @author User
 */
public class Calculo {
    
    private int num_1;
    private int num_2; 

    
    public Calculo() {
        this.num_1 = 0; 
        this.num_2 = 0; 
        
    }
    public Calculo(int num_1, int num_2) {
        this.num_1 = num_1;
        this.num_2 = num_2;
    }

    public int getNum_1() {
        return num_1;
    }

    public void setNum_1(int num_1) {
        this.num_1 = num_1;
    }

    public int getNum_2() {
        return num_2;
    }

    public void setNum_2(int num_2) {
        this.num_2 = num_2;
    }
    
    
    
}
