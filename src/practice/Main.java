package practice;
import java.util.*;
public class Main{
    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()){
//            String jiami = sc.nextLine();
//           // String jiemi = sc.nextLine();
//            StringBuffer j1 =new StringBuffer();
//           // StringBuffer j2 = new StringBuffer();
//            for(int i=0;i<jiami.length();i++){
//                char c = jiami.charAt(i);
//                if(c>='0'&& c<='9'){
//                    if(c!='9'){
//                        j1.append((char)(c+1));
//                    }else{
//                        j1.append('0');
//                    }
//                }
//                else if(c>='a'&&c<='z'){
//                    if(c!='z'){
//                        char tem = (char)(c-31);
//                        j1.append(tem);
//                    }else{
//                        j1.append('A');
//                    }
//                }else if(c>='A' && c<='Z'){
//                    if(c!='Z'){
//                        char tem = (char)(c+33);
//                        j1.append(tem);
//                    }else{
//                        j1.append('a');
//                    }
//                }else{
//                    j1.append(c);
//                }
//            }
//            System.out.println(j1.toString());
//        }
//        char a = 'E';
//        int s = Integer.parseInt(String.valueOf(a),16);
//        String b=Integer.toBinaryString(s);
//
//
//        for(int i=b.length();i<4;i++){
//            b=0+b;
//        }
//
//       b =new StringBuffer(b).reverse().toString();
//       b=Integer.toHexString(Integer.parseInt(b,2));
//       b=b.toUpperCase();
//        System.out.println(b);
//       String yuan = "3165757026";
//        String er = Long.toBinaryString(Long.valueOf(yuan));
//        String[] res = new String[4];
//        int i =3;
//        for(int j =er.length();j<32;j++){
//            er=0+er;
//        }
//
//        while (er.length()>0){
//                String s  = er.substring(er.length()-8);
//                int num = Integer.parseInt(s,2);
//                res[i--]=""+num;
//                er=er.substring(0,er.length()-8);
//
//
//        }
//        for(int j=0;j<3;j++){
//            System.out.print(res[j]+".");
//        }
//        System.out.println(res[3]);
//        Main a = new Main();
//        System.out.println(a.getClass().getName());
//        String s ="sad";
//        s+= " a";
//        String s ="babcbabcbaccba";
//        String longres = s.substring(0,1);
//        for(int i=1;i<s.length()-1;i++){
//            String tem = helper(s,i,i);
//            if(tem.length()>longres.length()){
//                longres = tem;
//            }
//             tem = helper(s,i,i+1);
//            if(tem.length()>longres.length()){
//                longres = tem;
//            }
//        }
//        System.out.println(longres);
//
//
//
//
//
//}
//
//    private static String helper(String s, int i, int i1) {
//        while (i>=0 && i1<s.length() && s.charAt(i)==s.charAt(i1)){
//            i--;
//            i1++;
//        }
//        return s.substring(i+1,i1);
        int[] arr = {1,2,3,4,5};
        //youxunhuan(arr,1);
        zuoxunhuan(arr,1);

            System.out.println(Arrays.toString(arr));

    }
    public static void reverse(int[] arr,int start,int end){
        while (start<end){
            int tem = arr[start];
            arr[start]=arr[end];
            arr[end]=tem;
            start++;
            end--;
        }

    }
    public static void youxunhuan(int[] arr,int k){
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);

    }
    public static void zuoxunhuan(int[] arr,int k){
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
}