package com.itheima.a02udpdemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveMessageDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8080);

        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);

        byte[] data = packet.getData();
        int length = packet.getLength();
        InetAddress address = packet.getAddress();
        int port = packet.getPort();

        System.out.println("接收到数据" + new String(data, 0, length));
        System.out.println("从" + address + "这台电脑中的" + port + "这个端口发送的");

        socket.close();
    }
}
