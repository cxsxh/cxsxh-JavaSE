package com.itheima.myiotest1;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) throws IOException {
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?from=aladdin&pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d";
        String biyNameNet = "";
        String familyNameNetStr = webCrawler(familyNameNet);
        ArrayList<String> familyNameTempList = getData(familyNameNetStr, "([^\\w]{4})(，|。)", 1);

        System.out.println(familyNameTempList);

        ArrayList<String> familyNameList = new ArrayList<>();
        for (String s : familyNameTempList) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                familyNameList.add(c + "");
            }
        }

        System.out.println(familyNameList);
    }

    private static ArrayList<String> getData(String familyNameNetStr, String regex, int index) {
        ArrayList<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(familyNameNetStr);
        while (matcher.find()) {
            list.add(matcher.group(index));
        }
        return list;
    }

    private static String webCrawler(String net) throws IOException {
        StringBuilder sb = new StringBuilder();

        URL url = new URL(net);
        URLConnection conn = url.openConnection();

        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        int ch;
        while ((ch = isr.read()) != -1) {
            sb.append((char) ch);
        }
        isr.close();
        return sb.toString();
    }
}
