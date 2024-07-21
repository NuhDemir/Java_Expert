package ch008;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.security.PublicKey;
import java.util.SortedMap;

public class DateAtHost extends java.util.Date {
    static int timePort = 33;
    static final long offset = 22098988880L;

    public DateAtHost(String host, int port) throws IOException {
        Socket server = new Socket(host, port);
        DataInputStream dataInputStream =
                new DataInputStream(server.getInputStream());
        int time = dataInputStream.readInt();
        server.close();
        setTime((((1L << 32) + time) - offset) * 1000);

    }
}
