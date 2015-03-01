package Parsing;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class XMLparser {
    final String filePath = "C:\\666\\fias.xml";
    public void readXML() throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        MyHandler handler = new MyHandler();
        saxParser.parse(new File(filePath),handler);
        Map<Integer, String> data = handler.getData();
        List<String> streets = handler.getStreets();
        for (Map.Entry<Integer,String> dMap : data.entrySet()){
            System.out.println(dMap.getKey()+" - "+dMap.getValue());
        }
        for (int i = 0; i < streets.size(); i++) {
            System.out.println(streets.get(i));
        }
    }

}
