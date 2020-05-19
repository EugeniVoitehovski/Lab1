package implemented;

import gen.setCompilerParser;
import org.antlr.v4.runtime.ParserRuleContext;

import javax.annotation.Nullable;

public enum SetOperations {

    PLUS(setCompilerParser.MUL, "Set.union(%s,%s)"),
    MINUS(setCompilerParser.SUB, "Set.diff(%s,%s)"),
    DIVIDE(setCompilerParser.DIV, "Set.simDiff(%s,%s)"),
    MULTIPLY(setCompilerParser.MUL, "Set.intersection(%s,%s)"),;

    private final int type;
    private final String overrideSet;

    SetOperations(int type, String overrideSet) {
        this.type = type;
        this.overrideSet = overrideSet;
    }

    @Nullable
    public static SetOperations findOperation(ParserRuleContext ctx) {
        for (SetOperations numberOperations : SetOperations.values()) {
            if (ctx.getToken(numberOperations.type, 0) != null) {
                return numberOperations;
            }
        }
        return null;
    }

    public String getOverrideSet() {
        return overrideSet;
    }

}
