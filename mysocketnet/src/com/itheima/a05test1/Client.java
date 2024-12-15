package com.itheima.a05test1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10000);

        Scanner scanner = new Scanner(System.in);
        OutputStream outputStream = socket.getOutputStream();

        while (true) {
            System.out.println("请输入您要发送的信息");
            String s = scanner.nextLine();

            if ("886".equals(s)) {
                break;
            }

            outputStream.write(s.getBytes());
        }

        socket.close();
    }
}
