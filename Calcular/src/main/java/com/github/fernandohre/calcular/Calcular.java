package com.github.fernandohre.calcular;
import com.github.kyriosdata.parser.*;
import java.util.List;
/**
 *  Classe que contém método que realizam as operações aritméticas sugeridas
 *  pelo usuário.
 * 
 */
public class Calcular {
    /**
     *  Método que recebe argumentos sugeridos pelo usuário para o cáculo
     *  aritmético, fazendo o usuo da classe Lexer para tratar a expressão
     *  e o parsers.
     * 
     * @param expressao expressão matemática sugerida pelo usuário, ex: 5 + 2,
     * 2 * (5 + 10), 5 * (5*8) e etc;
     * @return o resultado da expressão aritmética.
     */
    public static float exprPara(String expressao) {
        List<Token> tokens = new Lexer(expressao).tokenize();
        Parser parser = new Parser(tokens);
        return parser.expressao().valor();
    }
}
