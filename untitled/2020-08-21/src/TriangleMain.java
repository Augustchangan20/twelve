import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TriangleMain {
    //给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        if (numRows == 0) {//首先判断为0的时候
            return ret;
        }
        List<Integer> oneRow = new ArrayList<>();
        ret.add(oneRow);
        ret.get(0).add(1);
        System.out.println(oneRow);
        //第一行直接添加元素1
        //从第二行开始计算
        for (int i = 1; i < numRows; i++) {
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);//当前行的第一个元素都为1
            List<Integer> prevRow = ret.get(i - 1);//前一行
            for (int j = 1; j < i; j++) {
                //[i行，j列] = [i-1,j] + [i-1,j-1]
                int x = prevRow.get(j);
                int y = prevRow.get(j - 1);
                curRow.add(x + y);
            }
            //最后一个元素
            curRow.add(1);
            ret.add(curRow);
            System.out.println(curRow);

        }
        return ret;
    }

    public static void main(String[] args) {
        TriangleMain triangleMain = new TriangleMain();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        triangleMain.generate(n);
    }

}
