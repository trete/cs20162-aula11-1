
package com.github.fernandohre.calcular;
import java.util.Scanner;

public class Calcular {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            String expressao = input.nextLine();
            System.out.println(ImplementacaoCalcular.exprPara(expressao));
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Expressão inserida inválida");
            System.exit(1);
        }
    }
}
