/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.esatdisticasventas;

/**
 *
 * @author Jehudi Alvarado
 */
import java.util.ArrayList;
public class EsatdisticasVentas {




    public static double promedio(ArrayList<Double> ventas) {
        if (ventas.isEmpty()) return 0;
        double suma = 0;
        for (double v : ventas) {
            suma += v;
        }
        return suma / ventas.size();
    }

    public static double maximo(ArrayList<Double> ventas) {
        double max = ventas.get(0);
        for (double v : ventas) {
            if (v > max) max = v;
        }
        return max;
    }

    public static double minimo(ArrayList<Double> ventas) {
        double min = ventas.get(0);
        for (double v : ventas) {
            if (v < min) min = v;
        }
        return min;
    }

    public static int diasSobrePromedio(ArrayList<Double> ventas) {
        double prom = promedio(ventas);
        int contador = 0;
        for (double v : ventas) {
            if (v > prom) contador++;
        }
        return contador;
    }

    public static void main(String[] args) {
        ArrayList<Double> ventas = new ArrayList<>();
        ventas.add(100.0);
        ventas.add(200.0);
        ventas.add(150.0);
        ventas.add(300.0);
        ventas.add(50.0);

        System.out.println("Promedio: Q" + promedio(ventas));
        System.out.println("Máximo: Q" + maximo(ventas));
        System.out.println("Mínimo: Q" + minimo(ventas));
        System.out.println("Días sobre el promedio: " + diasSobrePromedio(ventas));
    }
}