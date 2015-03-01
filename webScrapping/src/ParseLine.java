import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Константин on 21.08.2014.
 */
public class ParseLine {
    protected String preparedUrl;
    protected Stream stream = new Stream();
    public ArrayList<String> parseUrl(String commandLine) throws IOException {
        if (commandLine.contains("http")){
            preparedUrl = commandLine.trim().substring(commandLine.indexOf("h"), commandLine.length()-1);
        }
        return stream.parseUrl(preparedUrl);
    }
}
