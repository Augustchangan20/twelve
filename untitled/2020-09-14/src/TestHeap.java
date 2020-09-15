import java.util.Arrays;

public class TestHeap {
    public int[] elem;
    public int usedSize;//默认值为0
    public TestHeap(){
        this.elem = new int[10];
    }

    /**
     *
     * @param root 每颗子树的开始位置
     * @param len 结束位置
     */
    public  void adjustDown(int root,int len){
        //向下调整   大根堆
        int parent= root;
        int child = 2*parent +1;
        while (child < len){
            //0：判断是否有左右孩子，如果有，找出最大值  用C下标表示最大值
            if (child + 1 < len && this.elem[child] < this.elem[child + 1]){
                child++;

            }
            //代码走到这里，C表示最大值下标
            if (this.elem[child] > this.elem[parent]){
                //交换
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                parent = child;
                child = 2*parent +1;
            }else {
                break;
            }

        }

    }
    public void createHeap(int[] array){
        for (int i = 0; i < array.length ; i++) {
            this.elem[i] = array[i];
            this.usedSize++;
        }
        //i:每颗子树的根节点下标   公式为：i=（n -1）/2
        for (int i = (this.usedSize-1-1)/2; i >=0  ; i--) {
            adjustDown(i, usedSize);
            //对应17行，不减1，取小于号，减1，取小于等于号
            //adjustDown(i,usedSize - 1);
        }
    }

    /**
     * 插入数据
     * @param val
     */
    public void push(int val){
        //0：判断堆是否是满的，若满，则扩容
        if (isFull()){
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        //1；将数放到数组的最后一个位置
        this.elem[this.usedSize] = val;
        this.usedSize++;
        //2：进行向上调整
        adjustUp(this.usedSize -1);

    }
    public void adjustUp(int child){
        //向上调整
        int parent = (child -1)/2;
        while (child >0){
            if (this.elem[child] > this.elem[parent]){
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                child = parent;
                parent = (child -1)/2;
            }else {
                break;
            }
        }
    }

    /**
     * 堆的删除:
     * 堆的删除一定删除的是堆顶元素
     */
    public void pop(){
        //0:判断是否为空
        if (isEmpty()){
            return;
        }
        //1：最后一个元素与堆顶元素交换
        int tmp = this.elem[0];
        this.elem[0] = this.elem[this.usedSize -1];
        this.elem[this.usedSize -1] = tmp;
        this.usedSize--;
        //2：调整0号下标这棵树----向下调整
        adjustDown(0,this.usedSize);
    }
    public int peek(){
        //拿到堆顶元素
        if (isEmpty()){
            return -1;
        }
        return this.elem[0];
    }
    public boolean isEmpty(){
        return this.usedSize == 0;
    }
    public boolean isFull(){
        return this.usedSize == this.elem.length;
    }
    public void show(){
        for (int i = 0; i < usedSize ; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
    public void heapsort(){
        //堆排序--从小到大排序----建立大根堆
        int end = this.usedSize -1;
        while (end > 0){
            int tmp = this.elem[0];
            this.elem[0] = this.elem[end];
            this.elem[end] = tmp;
            adjustDown(0,end);
            end--;


        }
    }

}
