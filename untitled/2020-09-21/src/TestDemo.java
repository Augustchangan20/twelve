class Card {
    public int rank; // 数值
    public String suit; // 花色
    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }
    //

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || !(obj instanceof Card)){
            //obj不是card的一个子类
            return false;
        }
        return false;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Card card1 = new Card(5,"♥");
        Card card2 = new Card(5,"♥");
        System.out.println(card1 == card2);
        System.out.println(card1.equals(card2));
        //==比较的是值，card1和card2的地址不同
        //equals 比较的是字符串的内容  需要重写String类下的equals 方法，负责还是比较的参数值
    }
}
