import java.util.regex.Pattern;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        String regex = "([^-])(https|http)://(\\w{2,}|www{3})(\\w.\\w+\\w.com|.com)";
        String s = "URL ссылки: http://www.example.com, http://example.com, Just Text, http://a.com";
        Pattern p2 = Pattern. compile (regex);
        Matcher m2 = p2.matcher(s);
        while (m2.find()) {
            System.out.println("Ссылки: " + m2.group());
        }
    }
}