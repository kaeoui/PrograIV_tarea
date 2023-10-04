/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upi.cr.ejerciciojframe.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import upi.cr.ejerciciojframe.modelo.Calculo;
import upi.cr.ejerciciojframe.vista.FrmCalculo;
import upi.cr.ejerciciojframe.vista.PnlCalculo;

/**
 *
 * @author User
 */
public class Controlador implements ActionListener {

    private PnlCalculo pnlCalculo;
    private FrmCalculo frmCalculo;

    private Calculo calculo;

    public Controlador() {
        this.frmCalculo = new FrmCalculo();
        this.frmCalculo.setVisible(true);

        this.pnlCalculo = this.frmCalculo.getPanelDatos();

        this.pnlCalculo.escuchar((ActionListener) this);

    }

    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {

            case "suma":

                int num1 = Integer.parseInt(this.pnlCalculo.getNum_1());
                int num2 = Integer.parseInt(this.pnlCalculo.getNum_2());
                int suma = num1 + num2;

                FrmCalculo.mensaje("La suma de los números es: " + suma);

                break;

            case "resta":

                int num3 = Integer.parseInt(this.pnlCalculo.getNum_1());
                int num4 = Integer.parseInt(this.pnlCalculo.getNum_2());
                int resta = num3 - num4;

                FrmCalculo.mensaje("La resta de los números es: " + resta);

                break;

            case "multiplicacion":

                int num5 = Integer.parseInt(this.pnlCalculo.getNum_1());
                int num6 = Integer.parseInt(this.pnlCalculo.getNum_2());
                int multiplicacion = num5 * num6;

                FrmCalculo.mensaje("La multiplicación de los números es: " + multiplicacion);

                break;

            case "division":

                int num7 = Integer.parseInt(this.pnlCalculo.getNum_1());
                int num8 = Integer.parseInt(this.pnlCalculo.getNum_2());
                int division = num7 / num8;

                FrmCalculo.mensaje("La división de los números es: " + division);

                break;

            case "numprimo":

                int num9 = Integer.parseInt(this.pnlCalculo.getNum_1());
                int num10 = Integer.parseInt(this.pnlCalculo.getNum_2());

                boolean esPrimo = true;

                if (num9 <= 1) {
                    FrmCalculo.mensaje("El número " + num9 + " no es primo.");
                } else if (num9 <= 3) {
                    FrmCalculo.mensaje("El número " + num9 + " es primo.");
                } else if (num9 % 2 == 0 || num9 % 3 == 0) {
                    FrmCalculo.mensaje("El número " + num9 + " no es primo.");
                } else {
                    for (int i = 5; i * i <= num9; i += 6) {
                        if (num9 % i == 0 || num9 % (i + 2) == 0) {
                            esPrimo = false;
                            break;
                        }
                    }

                    if (esPrimo) {
                        FrmCalculo.mensaje("El número " + num9 + " es primo.");
                    } else {
                        FrmCalculo.mensaje("El número " + num9 + " no es primo.");
                    }

                }
                

                boolean esPrimo2 = true;

                if (num10 <= 1) {
                    FrmCalculo.mensaje("El número " + num10 + " no es primo.");
                } else if (num10 <= 3) {
                    FrmCalculo.mensaje("El número " + num10 + " es primo.");
                } else if (num10 % 2 == 0 || num10 % 3 == 0) {
                    FrmCalculo.mensaje("El número " + num9 + " no es primo.");
                } else {
                    for (int i = 5; i * i <= num10; i += 6) {
                        if (num10 % i == 0 || num10 % (i + 2) == 0) {
                            esPrimo2 = false;
                            break;
                        }
                    }

                    if (esPrimo2) {
                        FrmCalculo.mensaje("El número " + num10 + " es primo.");
                    } else {
                        FrmCalculo.mensaje("El número " + num10 + " no es primo.");
                    }

                }

        }
    }
}
