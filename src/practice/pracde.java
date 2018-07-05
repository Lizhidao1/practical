package practice;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Administrator
 * \* Date: 2018/6/1
 * \* Time: 20:18
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class pracde {
    public static String find (String s){
        int max = 0;
        int start =0;
        int len = 0;
        for(int i=1;i<s.length();i++){
            for(int j = 0;j<s.length()-i;j++){
                if(s.charAt(j)==s.charAt(j+i)){
                    len++;
                }else {
                    len=0;
                }
                if(len>max && len<=i ){
                    start=j-len+1;
                    max=len;
                }
            }
        }
        String res = null;
        if(max>0){
            res = s.substring(start,start+max);
        }
        return  res;


    }

    public static void main(String[] args) {
        String s = "abcdefefvivovivoghijghijk";
        System.out.println(find(s));
    }
}