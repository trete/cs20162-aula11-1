
package com.github.fernandohre.calcular;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expressao;
        expressao = input.nextLine();
        try {
            System.out.println(Calcular.exprPara(expressao));
            System.exit(0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Expressão não fornecida");
            System.exit(1);
        } catch (Exception e) {
            System.out.println("Expressão inserida inválida");
            System.exit(1);
        }
    }
}
