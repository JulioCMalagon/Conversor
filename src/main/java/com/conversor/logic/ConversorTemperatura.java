/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conversor.logic;

/**
 *
 * @author JulioBC
 */
public class ConversorTemperatura extends ConversorMonedas {

    private float conversionTemperatura;

    @Override
    public String convertir() {
        switch (super.getDe()) {
            case 0 -> { // Celcius
                conversionTemperatura = switch (super.getA()) {
                    case 1 ->
                        (super.getCantidad() * 9 / 5) + 32;
                    case 2 ->
                        super.getCantidad() + 273.15f;
                    default ->
                        super.getCantidad();
                };
            }
            case 1 -> { // Farenheit
                conversionTemperatura = switch (super.getA()) {
                    case 0 ->
                        (super.getCantidad() - 32) * 5 / 9;
                    case 2 ->
                        ((super.getCantidad() - 32) * 5 / 9) + 273.15f;
                    default ->
                        super.getCantidad();
                };
            }
            case 2 -> { // Kelvin
                conversionTemperatura = switch (super.getA()) {
                    case 0 ->
                        super.getCantidad() - 273.15f;
                    case 1 ->
                        ((super.getCantidad() - 273.15f) * 9 / 5) + 32;
                    default ->
                        super.getCantidad();
                };
            }
        }
        return decimalFormat.format(conversionTemperatura);
    }

}
