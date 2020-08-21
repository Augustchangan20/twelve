import java.util.*;

public class TestDemo2{
    public static void main(String[] args) {
        int i = 10;
        // 装箱操作，新建一个 Integer 类型对象，将 i 的值放入对象的某个属性中
        Integer ii = Integer.valueOf(i);
        Integer ij = new Integer(i);
        // 拆箱操作，将 Integer 对象中的值取出，放到一个基本数据类型中
        int j = ii.intValue();

    }
    public static void main2(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("终南屌丝","刘科技");
        map.put("周至萌娃","My Son");
        System.out.println(map);
        String s = map.get("终南屌丝");
        System.out.println(s);
        String b = map.getOrDefault("终南屌丝2","shuaishuai");
        //getOrDefault  默认值
        System.out.println(b);
        System.out.println(map.containsKey("终南屌丝"));
        System.out.println(map.containsValue("shuaishuai"));
        System.out.println("===========");

        Set< Map.Entry<String,String> >set = map.entrySet();
        for (Map.Entry<String,String> entry: set) {
            System.out.println(entry.getKey()+"=>"+entry.getValue());
            System.out.println(map.isEmpty());
            System.out.println(map.size());

        }

    }

    public static void main1(String[] args) {
        //Collection是接口，new的时候需要给他具体一个类
//        Collection collection = new ArrayList();
        Collection<String> collection = new ArrayList<>();
        //<>泛型  尖括号里面放引用类型，collection引用一个顺序表，顺序表只能放String(字符串)类型的
        collection.add("bit");
        collection.add("java");
        collection.add("where");
        collection.add("xigong");
        System.out.println(collection);
       /* collection.clear();
        System.out.println(collection);*/
        System.out.println(collection.isEmpty());
        collection.remove("where");
        System.out.println(collection);
        System.out.println(collection.size());
        Object[] objects = collection.toArray();
        System.out.println(collection);
        System.out.println("==========");
        for (String s: collection) {
            System.out.println(s);

        }
    }
}
