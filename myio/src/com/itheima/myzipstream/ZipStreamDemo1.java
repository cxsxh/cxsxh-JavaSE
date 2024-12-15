package com.itheima.myzipstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamDemo1 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("myio\\z.zip");
        File file2 = new File("myio\\");

        unzip(file1, file2);
    }

    private static void unzip(File file1, File file2) throws IOException {
        ZipInputStream zis = new ZipInputStream(new FileInputStream(file1));

        ZipEntry entry;
        while ((entry = zis.getNextEntry()) != null) {
            System.out.println(entry);
            if (entry.isDirectory()) {
                File f = new File(file2, entry.toString());
                f.mkdirs();
            } else {
                FileOutputStream fos = new FileOutputStream(new File(file2, entry.toString()));
                int b;
                while ((b = zis.read()) != -1) {
                    fos.write(b);
                }
                fos.close();
                zis.closeEntry();
            }
        }
        zis.close();
    }
}
