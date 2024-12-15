package com.itheima.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Demo extends JFrame implements ActionListener {
    JButton jtb = new JButton("点我");

    public Demo() {
        //设置界面的宽高
        this.setSize(603, 680);

        //设置界面的标题
        this.setTitle("拼图游戏单机版 v1.0");

        //设置界面置顶
        this.setAlwaysOnTop(true);

        //设置界面居中
        this.setLocationRelativeTo(null);

        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);

        //设置位置和宽高
        jtb.setBounds(0, 0, 50, 50);

        jtb.addActionListener(this);
        this.getContentPane().add(jtb);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Random r = new Random();
        jtb.setLocation(r.nextInt(500), r.nextInt(500));
    }
}
