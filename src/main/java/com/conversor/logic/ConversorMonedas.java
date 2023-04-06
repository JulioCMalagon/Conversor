/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conversor.logic;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author JulioBC
 */
public class ConversorMonedas {

    String pattern = "###,###,###.##";
    DecimalFormat decimalFormat = new DecimalFormat(pattern);
    private float cantidad;
    private float conversionMoneda;
    private int de;
    private int a;

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getConversion() {
        return conversionMoneda;
    }

    public void setConversion(float conversion) {
        this.conversionMoneda = conversion;
    }

    public int getDe() {
        return de;
    }

    public void setDe(int de) {
        this.de = de;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String convertir() {
        if (cantidad < 0) {
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad válida");
        } else {
            switch (de) {
                case 0 -> { //Pesos MXN a
                    conversionMoneda = switch (a) {
                        case 1 ->
                            cantidad * 0.055f;
                        case 2 ->
                            cantidad * 0.050f;
                        case 3 ->
                            cantidad * 0.044f;
                        case 4 ->
                            cantidad * 7.16f;
                        case 5 ->
                            cantidad * 71.90f;
                        default ->
                            cantidad;
                    };
                }
                case 1 -> { // Dólares a
                    conversionMoneda = switch (a) {
                        case 0 ->
                            cantidad * 18.3f;
                        case 2 ->
                            cantidad * 0.92f;
                        case 3 ->
                            cantidad * 0.80f;
                        case 4 ->
                            cantidad * 131.32f;
                        case 5 ->
                            cantidad * 1317.25f;
                        default ->
                            cantidad;
                    };
                }
                case 2 -> { // Euros
                    conversionMoneda = switch (a) {
                        case 0 ->
                            cantidad * 19.95f;
                        case 1 ->
                            cantidad * 1.09f;
                        case 3 ->
                            cantidad * 0.88f;
                        case 4 ->
                            cantidad * 143.19f;
                        case 5 ->
                            cantidad * 1436.55f;
                        default ->
                            cantidad;
                    };
                }
                case 3 -> { // Libras esterlinas
                    conversionMoneda = switch (a) {
                        case 0 ->
                            cantidad * 22.80f;
                        case 1 ->
                            cantidad * 1.25f;
                        case 2 ->
                            cantidad * 1.14f;
                        case 4 ->
                            cantidad * 163.67f;
                        case 5 ->
                            cantidad * 1641.02f;
                        default ->
                            cantidad;
                    };
                }
                case 4 -> { // Yen japonés
                    conversionMoneda = switch (a) {
                        case 0 ->
                            cantidad * 0.14f;
                        case 1 ->
                            cantidad * 0.0076f;
                        case 2 ->
                            cantidad * 0.0070f;
                        case 3 ->
                            cantidad * 0.0061f;
                        case 5 ->
                            cantidad * 10.03f;
                        default ->
                            cantidad;
                    };
                }
                case 5 -> { // Won surcoreano
                    conversionMoneda = switch (a) {
                        case 0 ->
                            cantidad * 0.014f;
                        case 1 ->
                            cantidad * 0.00076f;
                        case 2 ->
                            cantidad * 0.00070f;
                        case 3 ->
                            cantidad * 0.00061f;
                        case 4 ->
                            cantidad * 0.10f;
                        default ->
                            cantidad;
                    };
                }

            }
        }
        return decimalFormat.format(conversionMoneda);

    }

}
