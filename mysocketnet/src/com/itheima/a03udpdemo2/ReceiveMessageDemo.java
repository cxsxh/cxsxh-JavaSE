package com.itheima.a03udpdemo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveMessageDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8888);
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);

        while (true) {
            socket.receive(packet);

            byte[] data = packet.getData();
            int len = packet.getLength();
            String ip = packet.getAddress().getHostAddress();
            String name = packet.getAddress().getHostName();

            System.out.println("ip为" + ip + "主机名为" + name + "的人，发送了数据" + new String(data, 0, len));
        }
    }
}