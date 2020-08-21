public class TestDemo {
    public static String reverse(String str,int begin, int end){
        char[] value = str.toCharArray();
        while (begin < end){
            char tmp = value[begin];
            value[begin] = value[end];
            value[end] = tmp;
            begin++;
            end--;
        }
        return new String(value);//将数组转为字符串
//        return String.copyValueOf(value);


    }
    public static void main(String[] args) {
        String str = "abcdefg";
        String ret = reverse(str,0,str.length()-1);
        System.out.println(ret);
    }



    public static boolean func(String str){
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }
    public static void main3(String[] args) {
        String str = "123456";
        boolean flg = func(str);
        System.out.println(flg);
    }
    public static void main2(String[] args) {
        String str1 = "hello";
        String str2 = "hel" + "lo";
        System.out.println(str1 == str2);//true
        String str3 = new String("hel")+"lo";
        System.out.println(str1 == str3);//false
    }
    public static void main1(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1 == str2);//false
        String str3 = "hello";
        System.out.println(str1 == str3);//true
    }
}
