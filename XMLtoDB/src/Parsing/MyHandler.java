package Parsing;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyHandler extends DefaultHandler {

    private int cityId;
    private String element;

    private Map<Integer,String> data = new HashMap<Integer,String>();
    private List<String> streetList = new ArrayList<String>();
    @Override
    public void startDocument() throws SAXException {
        System.out.println("Parsing starts!");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("Parsing was end");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        element=qName;
        if (element.equals("City")){
            cityId = Integer.parseInt(attributes.getValue(0));
        }

    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        element="";
        cityId = -1;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {   //entries of tags getting here
        if (element.equals("name")){
            String nameStr = new String(ch, start, length);
            data.put(cityId,nameStr);
        }
        if (element.equals("street")){
            String streetStr = new String(ch, start, length);
            streetList.add(streetStr);
        }

    }
    public Map<Integer,String> getData(){
        return data;
    }
    public List<String> getStreets(){
        return streetList;
    }
}
