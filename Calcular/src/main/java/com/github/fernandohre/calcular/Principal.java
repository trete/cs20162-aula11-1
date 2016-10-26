
package com.github.fernandohre.calcular;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String calculo = input.nextLine();
        System.out.println(Calcular.exprPara(calculo));
    }
}
