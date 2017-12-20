import java.io.IOException;
import java.io.InputStreamReader;

public class Driver {
    private static boolean isOK = true;
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        ChainContext chain = new ChainContext();
        while(true){
            System.out.println("Press Enter");
            input.read();
            chain.pullLink();
        }
    }
}
