package com.itheima.a06test2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10000);

        socket.getOutputStream().write("hello".getBytes());
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        int z;
        while ((z = inputStreamReader.read()) != -1) {
            System.out.print((char) z);
        }

        socket.close();
    }
}
