package com.phdua.manager.guava;

import com.google.common.base.Splitter;
import com.google.common.collect.*;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import com.google.common.math.IntMath;
import com.google.common.primitives.Chars;

import java.math.RoundingMode;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MultiSetDemo {
    public static void main(String[] args) {

        List<Character> charList=Chars.asList('1','b');



        List<Integer> integerList=Lists.newArrayList(1,2,3,1,2,3,2,5,7);

        Set<Integer> integerSet=Sets.newHashSet(integerList);

        Set<Integer> integerSet1=Sets.newHashSet(3,4,5,6,7,8,9,9);
        System.out.println(integerSet);
        System.out.println(integerSet1);
        System.out.println(Sets.difference(integerSet,integerSet1));
        System.out.println(Sets.intersection(integerSet,integerSet1));
        System.out.println(Sets.union(integerSet,integerSet1));

        /*
        Multiset<String> set= LinkedHashMultiset.create();
        set.add("a");
        set.setCount("a",5); //添加或删除指定元素使其在集合中的数量是count
        set.add("a");
        set.add("a");
        System.out.println(set.count("a")); //给定元素在Multiset中的计数
        System.out.println(set);
        System.out.println(set.size()); //所有元素计数的总和,包括重复元素
        System.out.println(set.elementSet().size()); //所有元素计数的总和,不包括重复元素
        set.clear(); //清空集合
        System.out.println(set);

        int tu=IntMath.divide(89000000,80000000, RoundingMode.UP);
        System.out.println("tu = " + tu);


        Map<Integer, String> INTEGER_STRING_MAP =
                new ImmutableMap.Builder<Integer, String>().

                        put(30, "IP地址或地址段").
                        put(31, "端口号或范围").
                        put(32, "IP地址或地址段").
                        put(33, "端口号或范围").
                        put(34, "代码值").
                        put(38, "探针名称").
                        put(39, "网络协议号(protocol)").
                        put(40, "ipv6源IP(ipv6_src_addr)").
                        put(41, "ipv6目标IP(ipv6_dst_addr)").
                        put(42, "网络协议名称(protocol_map)").
                        put(43, "输入接口snmp(input_snmp)")

                        .build();

        //System.out.println("tu = " + INTEGER_STRING_MAP.get(30));


        Multiset<String> multiset1 = HashMultiset.create();
        multiset1.add("a", 2);
        multiset1.add("b",8);
        Multiset<String> multiset2 = HashMultiset.create();
        multiset2.add("a", 5);
        multiset2.add("c", 5);

        System.out.println("multiset2 = " + multiset2);

        System.out.println("multiset1 = " + multiset1);

        System.out.println(multiset1.containsAll(multiset2));

        Multisets.containsOccurrences(multiset1, multiset2); // returns false

        multiset2.removeAll(multiset1);//multiset2移除所有"a"，虽然multiset1只有2个"a"
        multiset2.isEmpty();*/
    }


}
