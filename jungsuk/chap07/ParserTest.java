package jungsuk.chap07;

interface Parseable {
    // 구문 분석 작업 수행
    public abstract void parse(String fileName);
}

class ParserManager {
    // 리턴타입이 Parseable 인터페이스
    public static Parseable getParser(String type) {
        if (type.equals("xml")) {
            return new XMLParser();
        } else {
            Parseable p = new HTMLParser();
            return p;
        }
    }
}

class XMLParser implements Parseable {
    public void parse(String fileName) {
        /* 구문 분석 수행 코드 */
        System.out.println(fileName + "- XML Parsing completed.");
    }
}

class HTMLParser implements Parseable {
    public void parse(String fileName) {
        System.out.println(fileName + "- HTML Parsing completed,");
    }
}

class ParserTest {
    public static void main(String[] args) {
        Parseable parser = ParserManager.getParser("XML");
        parser.parse("document.xml");
        parser = ParserManager.getParser("HTML");
        parser.parse("document2.html");
    }

}
