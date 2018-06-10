import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {

    public String readInputText() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String: ");
        return br.readLine();
    }

    public String processText(String inputText) {
        Pattern p = Pattern.compile("[<span>,<strong>,<table>]+[\\w]+[</span>,</strong>,</table>]");
        Matcher m = p.matcher(inputText);
        StringBuilder finalStr = new StringBuilder("");

        while (m.find()) {
            String subStr = inputText.substring(m.start(), m.end());
            
            int dotIndex = subStr.indexOf(">");
            String temp = subStr.substring(dotIndex);

            finalStr.append(temp).append("");

        }
        return deletion(finalStr.toString());
    }
    
    public String deletion(String x){
        String x1 = x.replace('>',' ');
        String x2 = x1.replace('<',' ');
        String x3 = x2.substring(x2.indexOf(" "));
        return x3;
    }
    
    public Comparator<String> ALPHABETICAL_ORDER = (String str1, String str2) -> {
        int res = String.CASE_INSENSITIVE_ORDER.compare(str1, str2);
        if (res == 0) {
            res = str1.compareTo(str2);
        }
        return res;
    };
    
    public void showResult(String resultText){
        List<String> list = new ArrayList();
        list.add(resultText);
        Collections.sort(list, ALPHABETICAL_ORDER);
        list.forEach(System.out::println);
    }
}