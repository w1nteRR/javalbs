
import java.io.IOException;


public class Main {

    public static void main(String[] args) {

        StringProcessor processor = new StringProcessor();
        String str = "";

        try {
            str = processor.readInputText();
        } catch(IOException e) {
        }

        processor.showResult(processor.processText(str));
    }
}