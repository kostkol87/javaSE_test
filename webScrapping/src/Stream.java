import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by Константин on 21.08.2014.
 */
public class Stream {

    protected ArrayList<String> line;

        public ArrayList<String> parseUrl(String address) throws IOException {
            line=new ArrayList<String>();
            String tmp = null;

            URL url = new URL(address);
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(url.openConnection().getInputStream(), "UTF-8"));

            while ((tmp = br.readLine()) != null) {
                line.add(tmp.trim());
            }

            return line;
        }

}
