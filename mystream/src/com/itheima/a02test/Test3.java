package com.itheima.a02test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<>();
        ArrayList<String> womenList = new ArrayList<>();

        Collections.addAll(manList, "蔡坤坤,24", "叶后弦,23", "刘不甜,22", "无铅,30", "小亮亮,27");
        Collections.addAll(womenList, "赵小影,35", "杨颖,36", "高圆圆,43", "杨小幂,31", "刘诗,35");

        Stream<String> stream1 = manList.stream().filter(n -> n.split(",")[0].length() == 3).limit(2);
        Stream<String> stream2 = womenList.stream().filter(n -> n.split(",")[0].startsWith("杨")).skip(1);

//        Stream.concat(stream1, stream2).map(new Function<String, Actor>() {
//            @Override
//            public Actor apply(String s) {
//                String s1 = s.split(",")[0];
//                int i = Integer.parseInt(s.split(",")[1]);
//                return new Actor(s1, i);
//            }
//        });

        List<Actor> list = Stream.concat(stream1, stream2)
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
