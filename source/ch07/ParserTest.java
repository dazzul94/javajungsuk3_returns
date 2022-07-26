package source.ch07;

import com.sun.org.apache.xerces.internal.parsers.XMLParser;

public class ParserTest {
    public static void main(String[] args) {
        Parseable parser = ParserManager.getParser("XML");
        parser.parse("document.xml");
        parser = ParserManager.getParser("HTML");
        parser.parse("document2.html");
    }
}
interface Parseable {
    // 구문 분석작업을 수행한다.
    public abstract void parse(String fileName);
}
class ParserManager {
    // 리턴타입이 Parseable인터페이스이다.
    public static Parseable getParser(String type) {
        if(type.equals("XML")) {
            return new XMLParser2();
        } else {
            return new HTMLParser();
        }
    }
}
class XMLParser2 implements Parseable {
    public void parse(String filename) {
        // 구문 분석작업을 수행하는 코드를 적는다.
        System.out.println(filename + "-XML parsing completed");
    }
}
class HTMLParser implements Parseable {
    public void parse(String filename) {
        // 구문 분석작업을 수행하는 코드를 적는다.
        System.out.println(filename + "-HTML parsing completed");
    }
}