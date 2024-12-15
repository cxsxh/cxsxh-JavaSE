package com.itheima.a04trcpdemo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(10000);

        Socket accept = socket.accept();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));

        int b;
        while ((b = bufferedReader.read()) != -1) {
            System.out.print((char) b);
        }

        socket.close();
        accept.close();
    }
}
