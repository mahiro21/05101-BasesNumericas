/* 
 * Copyright 2019 Mario Merlos Abella - mario.merlos.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

/**
 *
 * @author Mario Merlos Abella - mario.merlos.alum@iescamp.es
 */
public final class App {

    //Constantes
    public static final int N1 = 0b110;
    public static final int N2 = 0b1100;
    public static final int N3 = 0b11001;
    public static final int N4 = 0b110011;
    public static final int N5 = 01;
    public static final int N6 = 013;
    public static final int N7 = 0135;
    public static final int N8 = 01357;
    public static final int N9 = 5;
    public static final int N10 = 10;
    public static final int N11 = 20;
    public static final int N12 = 100;
    public static final int N13 = 1000;
    public static final int N14 = 0x2;
    public static final int N15 = 0xC;
    public static final int N16 = 0xCA;
    public static final int N17 = 0xB0B0;
    public static final int N18 = 0xDAD0;
    public static final int N19 = 0xFE0;
    public static final int N21 = 0xFF;
    public static final int N22 = 2048;
    public static final int N23 = 512;
    public static final int N24 = 64;
    public static final int N25 = 8;
    public static final int N26 = 0246;
    public static final int N27 = 052;
    public static final int N28 = 07;
    public static final int N29 = 0b10101010101;
    public static final int N30 = 0b111000;

    public void launchApp() {
        System.out.println("  # Binario             "
                + "Octal   Decimal  hexadecimal");
        System.out.println("=== =================== "
                + "======= ======== ===========");
        calcular(1, N1);
        calcular(2, N2);
        calcular(3, N3);
        calcular(4, N4);
        calcular(5, N5);
        calcular(6, N6);
        calcular(7, N7);
        calcular(8, N8);
        calcular(9, N9);
        calcular(10, N10);
        calcular(11, N11);
        calcular(12, N12);
        calcular(13, N13);
        calcular(14, N14);
        calcular(15, N15);
        calcular(16, N16);
        calcular(17, N17);
        calcular(18, N18);
        calcular(19, N19);
        calcular(21, N21);
        calcular(22, N22);
        calcular(23, N23);
        calcular(24, N24);
        calcular(25, N25);
        calcular(26, N26);
        calcular(27, N27);
        calcular(28, N28);
        calcular(29, N29);
        calcular(30, N30);

    }

    public static void calcular(int linea, int n) {
        //Conversiones
        System.out.printf(" %2d ", linea);
        System.out.printf("0b%-17s ", Integer.toBinaryString(n));
        System.out.printf("0%-8s", Integer.toOctalString(n));
        System.out.printf("%-9d", n);
        System.out.printf("0x%S   ", Integer.toHexString(n));
        System.out.println();
    }

}