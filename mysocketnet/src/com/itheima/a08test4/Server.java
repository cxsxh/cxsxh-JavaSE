package com.itheima.a08test4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1000);

        while (true) {
            ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
                    3,
                    16,
                    60,
                    TimeUnit.SECONDS,
                    new ArrayBlockingQueue<>(2),
                    Executors.defaultThreadFactory(),
                    new ThreadPoolExecutor.AbortPolicy()
            );

            Socket accept = serverSocket.accept();

//            new Thread(new MyThread(accept)).start();
            poolExecutor.submit(new MyThread(accept));
        }

    }
}
