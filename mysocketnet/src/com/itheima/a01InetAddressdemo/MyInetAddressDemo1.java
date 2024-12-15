package com.itheima.a01InetAddressdemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyInetAddressDemo1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress byName = InetAddress.getByName("cxsxh");

        String hostName = byName.getHostName();
        System.out.println(hostName);

        String hostAddress = byName.getHostAddress();
        System.out.println(hostAddress);
    }
}
