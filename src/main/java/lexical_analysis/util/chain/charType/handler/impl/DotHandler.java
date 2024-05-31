package lexical_analysis.util.chain.charType.handler.impl;

import lexical_analysis.util.chain.charType.handler.CharType;
import lexical_analysis.util.chain.charType.handler.CharTypeHandler;

public class DotHandler extends CharTypeHandler {
    public DotHandler() {
        init(CharType.DOT,new CommaHandler());
    }

    @Override
    public boolean isSelfCharType(char ch) {
        return ch=='.';
    }
}
