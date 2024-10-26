package chatApp;
import java.util.*;
import java.io.*;
import java.net.*;
public class mServer {

    public static void main(String[] args) throws Exception {
        Socket sa = null;
        ServerSocket  serverSocket2 = null;
        System.out.println("Host srtarts accepting response->");

        try {
            serverSocket2 = new ServerSocket(9999);
        }catch (IOException e){
            System.out.println("Server Error!!!");
        }


    }
}

