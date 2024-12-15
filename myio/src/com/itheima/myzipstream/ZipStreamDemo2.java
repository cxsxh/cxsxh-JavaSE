package com.itheima.myzipstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo2 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("myio\\a.txt");
        File file2 = new File("myio\\");

        toZip(file1, file2);
    }

    private static void toZip(File file1, File file2) throws IOException {
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(file2, "a.zip")));

        ZipEntry ze = new ZipEntry("a.txt");
        zos.putNextEntry(ze);

        FileInputStream fis = new FileInputStream(file1);
        int len;
        while ((len = fis.read()) != -1) {
            zos.write(len);
        }

        zos.closeEntry();
        fis.close();
    }
}
