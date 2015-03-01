import DbTransfer.CreateAndFillDb;
import Parsing.XMLparser;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;


/**
 * Created by Константин on 16.07.2014.
 */
public class Main {
    public static void main(String[] args)
            throws IOException, SAXException, ParserConfigurationException, ClassNotFoundException {
        XMLparser xmLparser = new XMLparser();
        xmLparser.readXML();
        CreateAndFillDb createAndFillDb = new CreateAndFillDb();
        createAndFillDb.myDB();
    }
}
