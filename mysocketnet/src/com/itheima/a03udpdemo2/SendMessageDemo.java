package com.itheima.a03udpdemo2;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class SendMessageDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您要说的话：");
            String s = sc.nextLine();
            if ("886".equals(s)) {
                break;
            }
            byte[] buf = s.getBytes();
            InetAddress byName = InetAddress.getByName("127.0.0.1");
            int port = 8888;

            DatagramPacket dp = new DatagramPacket(buf, buf.length, byName, port);

            socket.send(dp);
        }

        socket.close();
    }
}
