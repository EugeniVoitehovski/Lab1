import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompileMethods {

    public static void compile() throws Exception {
        Process p = Runtime.getRuntime().exec("javac -sourcepath ./compiled/src -d compiled/out compiled/src/generated/Main.java");
        String line;
        BufferedReader errorStream = new BufferedReader(new InputStreamReader(p.getErrorStream()));
        while ((line = errorStream.readLine()) != null) {
            System.out.println(line);
        }
        BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }
    public static void toJar() throws IOException {
        Process p = Runtime.getRuntime().exec("jar cmvf ./compiled/META-INF/MANIFEST.mf ./compiled/testCompiled.jar -C ./compiled/out/ .");
        String line;
        BufferedReader errorStream = new BufferedReader(new InputStreamReader(p.getErrorStream()));
        while ((line = errorStream.readLine()) != null) {
            System.out.println(line);
        }
        BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }
    public static void execute() throws Exception {
        Process p = Runtime.getRuntime().exec("java -jar  ./compiled/testCompiled.jar");
        String line;
        BufferedReader errorStream = new BufferedReader(new InputStreamReader(p.getErrorStream()));
        while ((line = errorStream.readLine()) != null) {
            System.out.println(line);
        }
        BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }
}
