package com.github.fernandohre.calcular;
import com.github.kyriosdata.parser.*;
import java.util.List;

public class Calcular {
    public static float exprPara(String expressao) {
        List<Token> tokens = new Lexer(expressao).tokenize();
        Parser parser = new Parser(tokens);
        return parser.expressao().valor();
    }
}
