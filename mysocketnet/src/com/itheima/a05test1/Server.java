package com.itheima.a05test1;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10000);

        Socket accept = serverSocket.accept();

        InputStreamReader isr = new InputStreamReader(accept.getInputStream());

        int a;
        while ((a = isr.read()) != -1) {
            System.out.println((char) a);
        }

        accept.close();
        serverSocket.close();
    }
}
