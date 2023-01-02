package stepik;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class StringFromInputStream {
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        StringBuilder sb = new StringBuilder();
        try(InputStreamReader reader = new InputStreamReader(new BufferedInputStream(inputStream), charset)) {
            while (true) {
                int currentByte = reader.read();
                if (currentByte == -1)
                    break;
                sb.append((char) currentByte);
            }
        }
        return sb.toString();
    }
}
