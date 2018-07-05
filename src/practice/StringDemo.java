package practice;

import java.util.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Administrator
 * \* Date: 2018/3/23
 * \* Time: 11:16
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class StringDemo {
    public static void main(String[] args) {
//        int[] arr = new int[256];
        ArrayList L = new ArrayList();


        String s = "sdasdaw4564874564asdaew1212sada7wq4878543213857weqq12213";
//        char[] chars=s.toCharArray();
//        for (int i=0;i<s.length();i++){
//            if (chars[i]>57||chars[i]<48){
//                chars[i]='a';
//            }
//        }
//        String s2 = String.valueOf(chars);
//        String[] s2s = s2.split("a");
//        Map<Integer,String> map = new HashMap<>();
//        for (int i=0;i<s2s.length;i++){
//            arr[i]=(s2s[i].length());
//            map.put(arr[i],s2s[i]);
//        }
//        Arrays.sort(arr);
//
//        System.out.println(arr[arr.length-1]+":"+map.get(arr[arr.length-1]));
//        Map<Integer,String> map = new HashMap<>();
//        char[] chars =s.toCharArray();
//        int small=0;
//        int big=0;
//        int count=0;
//        StringBuffer sb = new StringBuffer();
//        while(small<s.length()&&big<s.length()){
//            if (chars[small]>=48&&chars[small]<=57&&chars[big]>=48&&chars[big]<=57){
//                count++;
//                sb.append(chars[big]);
//                big++;
//
//            }else {
//                if (count!=0){
//                    map.put(count,sb.toString());
//                }
//
//                big++;
//                small=big;
//                count=0;
//                sb=null;
//
//            }
//            for (int i:map.keySet()){
//                System.out.println(i+map.get(i));
//            }
//        }、
        char[] chars=s.toCharArray();
        Map<Integer,String> map  =new HashMap<>();
        StringBuffer sb = new StringBuffer();
        char temp =chars[0];
        int count=0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=1;i<chars.length;i++){
            if (chars[i]<48||chars[i]>59){
                count=0;
                sb.delete(0,sb.length());
            }else {
                sb.append(chars[i]);
                count++;
                map.put(count,sb.toString());
            }
            if (count!=0){
                list.add(count);
            }
        }
       list.sort(new Comparator<Integer>() {
           @Override
           public int compare(Integer o1, Integer o2) {
               return o2-o1;
           }
       });
        System.out.println(list.get(0)+":"+map.get(list.get(0)));

    }

}