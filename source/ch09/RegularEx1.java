package source.ch09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx1 {
    public static void main(String[] args) {
        String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c.",
                "c0", "car", "combat", "count", "date", "disc", "ca."};
        Pattern p = Pattern.compile("c[a-z]*"); // c로 시작하는 소문자영단어
        for(String str : data) {
            Matcher m = p.matcher(str);
            if(m.matches()) {
                System.out.print(str + ",");
            }
        }
    }
}
