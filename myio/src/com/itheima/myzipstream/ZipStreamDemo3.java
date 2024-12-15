package com.itheima.myzipstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo3 {
    public static void main(String[] args) throws IOException {
        File src = new File("myio\\y");
        File destParent = src.getParentFile();
        File dest = new File(destParent, src.getName() + ".zip");

        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));

        toZip(src, zos, src.getName());

        zos.close();
    }

    private static void toZip(File src, ZipOutputStream zos, String name) throws IOException {
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                ZipEntry ze = new ZipEntry(name + "\\" + file.getName());
                zos.putNextEntry(ze);
                FileInputStream fis = new FileInputStream(file);
                int len;
                while ((len = fis.read()) > 0) {
                    zos.write(len);
                }
                fis.close();
                zos.closeEntry();
            } else {
                toZip(file, zos, name + "\\" + file.getName());
            }
        }
    }
}
