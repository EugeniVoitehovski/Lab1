import implemented.Parser;
import implemented.Visitor;
import gen.setCompilerLexer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


import java.io.*;

import static implemented.Config.compiledFileName;

public class Main {

    public static void main(String[] args) throws Exception {
        try {
            String sourceFileName = getSourceFileName(args);
            setCompilerLexer lexer = null;
            lexer = new setCompilerLexer(new ANTLRFileStream(sourceFileName));
            Parser parser = new Parser(new CommonTokenStream(lexer));
            ParseTree tree = parser.global_program();
            Visitor setVisitor = new Visitor(parser, "Main");
            String output = setVisitor.visit(tree);
            PrintWriter printer = null;
            printer = new PrintWriter(compiledFileName);
            printer.print(output);
            printer.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
        }
        CompileMethods.compile();
        CompileMethods.toJar();
        System.out.println("\nProgram output:");
        CompileMethods.execute();
        System.out.println("\n\n");
    }

    private static String getSourceFileName(String [] args) {
        String fileName = "";
        if (args.length == 1){
            fileName = args[0];
        } else {
            System.out.print("Not valid arg");
            System.exit(-1);
        }
        return fileName;
    }
}
