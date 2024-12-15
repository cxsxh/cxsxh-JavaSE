package com.itheima.a06test2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10000);

        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

        int a;
        while ((a = inputStreamReader.read()) != -1) {
            System.out.print((char) a);
        }

        accept.getOutputStream().write("返回".getBytes());

        accept.close();
        serverSocket.close();
    }
}
