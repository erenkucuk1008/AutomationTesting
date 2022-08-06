package day52_Collection;

import java.util.*;

public class SetPractice { //we just store unique datas

    static String str3;

    public static void main(String[] args) {

        Set<String> names1 = new HashSet<>();//randomly print out
        names1.addAll(Arrays.asList("Eren","Arzum","Eren","Eren","Hakan","Suleyman","Eren","Sevgi"));
        System.out.println(names1);

        Set<String> names2 = new LinkedHashSet<>();//ne yazdiysak o
        names2.addAll(Arrays.asList("Eren","Arzum","Eren","Eren","Hakan","Suleyman","Eren","Sevgi"));
        System.out.println(names2);

        Set<String> names3 = new TreeSet<>();//sorted print out
        names3.addAll(Arrays.asList("Eren","Arzum","Eren","Eren","Hakan","Eren","Suleyman","Sevgi"));
        System.out.println(names3);

        System.out.println("===================================");

        //remove duplicates
        String str = "gggggaaaabbbbccddddddddddddddddeefff";

        String result= "";//1.YOL icin
        String result1="";//3.YOL icin

        //1.YOL
        for (String s : new LinkedHashSet<>(Arrays.asList(str.split("")))){
            result+= s;
        }
        System.out.println(result);//String olarak yazdirdik

        System.out.println("===================");

        //2.YOL
        Set<String> lhs = new LinkedHashSet<>(Arrays.asList(str.split("")));
        System.out.println(lhs);//List olarak yazdirdik
        for (String s : lhs) {
            System.out.print(s);//String olarak
        }
        System.out.println();
        System.out.println("===================");


        //3.YOL -----1.YOL un aynisi, daha acik yazilmis hali
        String[] arr1 = str.split("");

        LinkedHashSet<String> hs = new LinkedHashSet<>();
        hs.addAll(Arrays.asList(arr1));

        for (String each : hs) {
            result1+=each;
        }
        System.out.println(result1);//String olarak yazdirdik. For each loop kullanarak

        //BU YOLU YAP!! EN ANLASILIR
        String str11 = "aaabbcdddeeef";
        LinkedHashSet<String> nonDup = new LinkedHashSet<>(Arrays.asList(str11.split("")));
        for (String each : nonDup) {
            System.out.print(each);
        }
        System.out.println();

        System.out.println("======================================");

        String str1 = "silent";
        String str2 = "listen";

        String s1 = new TreeSet<>(Arrays.asList(str1.split(""))).toString();
        String s2 = new TreeSet<>(Arrays.asList(str2.split(""))).toString();

        System.out.println(s1);
        System.out.println(s1.equals(s2));

        System.out.println("=========================================");

        //Null key

        System.out.println(str3);
        //System.out.println(str3.toUpperCase());

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(null,null,null,null,null));
        System.out.println(hashSet);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(null,null,null,null,null));
        System.out.println(linkedHashSet);

        System.out.println("===================================");

        Set<Integer> numbers = new HashSet<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,8,9,10));

        int maxNum = Collections.max(numbers);
        System.out.println("maxNum = " + maxNum);

        int minNum = Collections.min(numbers);
        System.out.println("minNum = " + minNum);

        System.out.println("=========================");

        //HATIRLATMA---SWAP 1 VE 3. INDEXIN YERI DEGISTIR
        List<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(1,2,3,4,5));

        Collections.swap(scores,1,3);
        System.out.println(scores);

        System.out.println("========================");

        String eren = "dddaaaaccbb";//d3a4c2b2

        LinkedHashSet<String> e1 = new LinkedHashSet<>(Arrays.asList(eren.split("")));
        for (String each : e1) {
            System.out.print(each + Collections.frequency(Arrays.asList(eren.split("")),each));
        }
    }
}
