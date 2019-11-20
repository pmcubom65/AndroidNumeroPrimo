package com.barajas.pedromanuelcubomedina;

import java.util.LinkedList;


/**
 * @author Pedro Manuel
 *
 */
public class Primo {

    private static LinkedList<Integer> milista = new LinkedList<>();

    public static int generalistaPrimos(int numerocalcula, int divido) {
        if (numerocalcula == 1) {
            return 1;
        } else if (divido == numerocalcula) {
            return numerocalcula;
        } else if (numerocalcula % divido == 0) {
            return 0;
        } else {

            return generalistaPrimos(numerocalcula, divido + 1);

        }

    }

    public static int damePrimo(int j) {
        if (j < 1) {
            return 0;
        } else if (j < milista.size()) {
            return milista.get(j - 1);
        } else {
            int contador = 1;
            int tamanho = 0;
            int valorfinal = 0;
            while (j > tamanho) {
                valorfinal = Primo.generalistaPrimos(contador, 2);
                if (valorfinal != 0) {
                    tamanho++;
                    if (tamanho > milista.size()) {
                        milista.add(valorfinal);
                    }
                }
                contador++;
            }
            return valorfinal;
        }
    }


}
