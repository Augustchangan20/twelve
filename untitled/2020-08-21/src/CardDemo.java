import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Card{
    public int rank;//牌面值
    public String suit;//花色

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format("[%s %d]",suit,rank);
    }
}
public class CardDemo {
    public static final String[] SUITS = {"♥","♠","♦","♣"};
    //1> 买牌  52张
    public static List<Card> buyDeck(){
        List<Card> deck = new ArrayList<>();
        for (int i = 0; i < 4; i++) {//每个花色
            for (int j = 1; j <= 13 ; j++) {//4种
                Card card = new Card(j,SUITS[i]);
                deck.add(card);
            }
        }
        return deck;
    }
    private static void swap(List<Card> deck,int index,int i){
        //数组交换是 tmp = [index]
        //[index] = [i]
        //[i] = tmp
        Card tmp = deck.get(index);
        deck.set(index,deck.get(i));
        deck.set(i,tmp);

    }
    //2>洗牌
    public static void shuffle(List<Card> deck){
        for (int i = deck.size()-1;i >0;i--){
            Random random = new Random();
            int index = random.nextInt(i);
            swap(deck,index,i);

        }
    }

    public static void main(String[] args) {
      List<Card> deck =  buyDeck();
        System.out.println(deck);
        System.out.println("洗牌：");
        shuffle((deck));
        System.out.println(deck);

        //假设有三个人，每个人轮流揭牌5张
        List<List<Card>> person = new ArrayList<>();//类似于二维数组
        List<Card> person1 = new ArrayList<>();
        List<Card> person2 = new ArrayList<>();
        List<Card> person3 = new ArrayList<>();
        person.add(person1);
        person.add(person2);
        person.add(person3);
        for (int i = 0; i < 5 ; i++) {//牌数
            for (int j = 0; j < 3 ; j++) {
                Card card = deck.remove(0);//每次删除下标为0的牌
                person.get(j).add(card);
               /* List<Card> list = person.get(j);*/
               /* list.add(card);*/

            }

        }
        System.out.println("一号选手：");
        System.out.println(person1);
        System.out.println("二号选手");
        System.out.println(person2);
        System.out.println("三号选手");
        System.out.println(person3);
        System.out.println("剩下的牌");
        System.out.println(deck);
    }
}
