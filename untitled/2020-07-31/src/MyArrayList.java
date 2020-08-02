import javax.management.openmbean.ArrayType;
import java.util.Arrays;

public class MyArrayList {
    public int[] elem;//数组   注意：这里顺序表是整形的，其他类型可以根据要求来写
    public int usedSize;//有效的数据个数
    public static final int intCapacity = 10;// capacity 容量；intCapacity 初始容量

    public MyArrayList() {//构造方法进行初始化
        this.elem = new int[intCapacity];//elem中分配内存
        this.usedSize = 0;
    }
    private void checkPos(int pos){//检查pos合法性
        if (pos < 0 || pos > this.usedSize){
            throw new RuntimeException("pos位置不合法");//(手动抛出异常)
        }
    }


    // 打印顺序表
    public void display() {
//            System.out.println(Arrays.toString(this.elem));
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();

    }


    // 在 pos 位置新增元素
    private boolean isFull() {//判断顺序表是否满了
            if (this.usedSize == this.elem.length) { //当顺序表长度等于数组长度，说明当前顺序表满了
                return true;
            }
            return false;
//        return this.usedSize == this.elem.length;
    }

    public void add(int pos, int data) {
        checkPos(pos);
        if (isFull()) {
            this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);//用CopyOf将当前数组扩容
        }
       /* if (pos < 0 || pos > usedSize) {//检查pos的合法性；pos<=usedSize时才成立
            return;
        }*/
        for (int i = this.usedSize - 1; i >= pos; i--) {
            this.elem[i + 1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }


        // 判定是否包含某个元素  
        public boolean contains(int toFind) {
            for (int i = 0; i <this.usedSize ; i++) {
                if (this.elem[i] == toFind){
                    return true;
                }
            }
        return false;
        }
        // 查找某个元素对应的位置    
        public int search(int toFind) {
            for (int i = 0; i < this.usedSize ; i++) {
                if (this.elem[i] == toFind){
                    return i;
                }
            }
        return -1;
        }
        // 获取 pos 位置的元素  
    private boolean isEmpty(){
        return this.usedSize == 0;
    }
        public int getPos(int pos) {
        //1> 判断顺序表是否为空  -1
        if (isEmpty()) {
            //return -1;（直接return -1 不合理，因为如果顺序表里就只有-1呢）
            throw new RuntimeException("顺序表为空");//手动抛出异常
        }
            //2> 判断顺序表合法性  (这里注意是大于等于，最后一位元素下标是减1 的)
            if (pos < 0 || pos >= this.usedSize) {
                return -1;
            }

        //3> 若合理，返回pos位置的元素
        return this.elem[pos];
    }
    // 给 pos 位置的元素设为 value    
    public void setPos(int pos, int value) {
        checkPos(pos);
        this.elem[pos] = value;
    }
    //删除第一次出现的关键字key    
    //1>找key的位置，并且知道它的下标index
    //2>index应该满足 index < usedSize -1
    //3>[i] = [i+1];usedSize--;
    public void remove(int toRemove) {
        int index = search(toRemove);
        if (index == -1){
            System.out.println("没有需要删除的数字");
            return;
        }
        for (int i = index; i < usedSize - 1; i++) {
            this.elem[i] = this.elem[i + 1];
        }
        this.usedSize--;

    }


        // 获取顺序表长度    
        public int size() {
        return this.usedSize;
        }
        // 清空顺序表  
        public void clear() {
        this.usedSize = 0;
        }
    }



