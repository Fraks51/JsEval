import java.io.*;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JsParser {


    private BufferedReader JsSourse;

    public JsParser(String name) {
            try {
                JsSourse = new BufferedReader(new InputStreamReader(new FileInputStream(name +".js")));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            start();
    }

    private StringTokenizer st;

    private String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            if (!JsSourse.ready())
                return null;
            st = new StringTokenizer(JsSourse.readLine());
        }
        return st.nextToken();
    }

    private void start() {
        JsTokens startFunc = JsTokens.JsFunction;
        startFunc.name = "";
        parseForFunc(startFunc); // "" means not in function (...) {...}
    }

    private void parseForFunc(JsTokens funcName) {

    }

}
