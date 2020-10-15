package org.fasttrackit.utils;

import java.util.Scanner;

public class ScannerUtils<privat> {
    // Variabilelor de tip final(CONSTANTE) nu li se mai poate atribui ulerior o alta
    // valoare. Din acest motiv este obligatoriu sa fie initializate .
    // Deasemenea se scriu cu litere mari.
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int nextIntAndMoveToNextLine() {
        int integer = SCANNER.nextInt();
        SCANNER.nextLine();
        return integer;
    }

    public static String nextLine() {
        return SCANNER.nextLine();
    }

}
