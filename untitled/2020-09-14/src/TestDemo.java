public class TestDemo {
    public static void main(String[] args) {
        TestHeap testHeap = new TestHeap();
        int[] array = {27,15,19,18,28,34,65,49,25,37};
        testHeap.createHeap(array);
        testHeap.show();
        testHeap.push(80);
        testHeap.show();
        testHeap.pop();
        testHeap.show();
        int ret = testHeap.peek();
        System.out.println(ret);
        System.out.println("堆排序");
        testHeap.heapsort();
        testHeap.show();
    }
}
