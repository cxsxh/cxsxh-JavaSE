package com.itheima.a03runtimedemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MyJFrame extends JFrame implements ActionListener {
    JButton yesBut = new JButton("帅爆了");
    JButton midBut = new JButton("一般般");
    JButton noBut = new JButton("不帅");
    JButton dadBut = new JButton("饶了我吧");

    boolean flag = false;

    public MyJFrame() {
        initJFrame();

        initView();

        this.setVisible(true);
    }

    private void initView() {
        this.getContentPane().removeAll();

        if (flag) {
            dadBut.setBounds(200, 100, 100, 30);
            dadBut.addActionListener(this);
            this.getContentPane().add(dadBut);
        }

        JLabel text = new JLabel("你觉得自己很帅吗?");
        text.setFont(new Font("微软雅黑", 0, 30));
        text.setBounds(120, 150, 300, 50);

        yesBut.setBounds(200, 250, 100, 30);
        midBut.setBounds(200, 325, 100, 30);
        noBut.setBounds(160, 400, 180, 30);

        yesBut.addActionListener(this);
        midBut.addActionListener(this);
        noBut.addActionListener(this);

        this.getContentPane().add(text);
        this.getContentPane().add(yesBut);
        this.getContentPane().add(midBut);
        this.getContentPane().add(noBut);
    }

    private void initJFrame() {
        this.setSize(500, 600);
        this.setTitle("eg");
        this.setDefaultCloseOperation(3);
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object object = e.getSource();
        if (object == yesBut) {

            showJDialog("你太自信了，接受惩罚");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 10");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            flag = true;
            initView();
        }else if (object == midBut) {
            showJDialog("你还是太自信了，接收惩罚");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 60");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            flag = true;
            initView();
        }else if (object == noBut) {
            showJDialog("看来你还有点自知之明，还得惩罚");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 120");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            flag = true;
            initView();
        }else if (object == dadBut) {
            showJDialog("那就饶了你吧");
            try {
                Runtime.getRuntime().exec("shutdown -a");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    public void showJDialog(String content) {
        JDialog jDialog = new JDialog();
        jDialog.setSize(200, 150);
        jDialog.setAlwaysOnTop(true);
        jDialog.setLocationRelativeTo(null);
        jDialog.setModal(true);

        JLabel warning = new JLabel(content);
        warning.setBounds(0, 0, 200, 150);
        jDialog.getContentPane().add(warning);

        jDialog.setVisible(true);
    }
}
