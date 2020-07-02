import java.util.*;
public class practice30 {
    //DNA序列
    public static double GiveRatio(String str) {
        double ratio=0;
        double count=0;
        for(char ch : str.toCharArray()){
            if(ch=='G' || ch=='C')
                count++;
        }
        ratio = count/(double)str.length();
        return ratio;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String dna=scan.nextLine();
        int usedSize=scan.nextInt();
        String maxStr="";
        double maxRatio=0;
        for(int i=0;i<dna.length()-usedSize+1;i++) {
            String str=dna.substring(i, i+usedSize);
            if(GiveRatio(str)>maxRatio) {
                maxStr=str;
                maxRatio=GiveRatio(str);
            }
        }
        System.out.println(maxStr);
    }
}