package com.itheima.a02udpdemo;

import java.io.IOException;
import java.net.*;

public class SendMessageDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();

        String s = "你好啊！！！";
        byte[] buf = s.getBytes();
        InetAddress byName = InetAddress.getByName("127.0.0.1");
        int port = 8080;

        DatagramPacket dp = new DatagramPacket(buf, buf.length, byName, port);

        socket.send(dp);
        socket.close();
    }
}
