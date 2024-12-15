package com.itheima.a04trcpdemo1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10000);

        OutputStream stream = socket.getOutputStream();
        stream.write("hello".getBytes());

        stream.close();
        socket.close();

    }
}
