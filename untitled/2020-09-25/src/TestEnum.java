/**
 * 1>自己定义的枚举类，它的构造方法默认是私有的，所以当你给它public的时候，会报错
 * 2>自己写的枚举类也会默认继承于java.lang.Enum;
 */
public enum TestEnum {
    //枚举对象
    RED(1,"红色"),BLACK(2,"黑色"),GREEN(3,"绿色"),WHITE(4,"白色");
    public int ordinal;
    public String color;

    TestEnum(int ordinal, String color) {
        //枚举实例  枚举对象给参数后，需要给它提供构造方法
        this.ordinal = ordinal;
        this.color = color;
    }


    public static TestEnum getEnumKey (int  ordinal) {
        for (TestEnum t: TestEnum.values()) {
            if(t. ordinal ==  ordinal) {
                return t;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println(getEnumKey(2));
    }
    public static void main3(String[] args) {
        //拿到枚举实例BLACK
        TestEnum testEnum = TestEnum.BLACK;
        //拿到枚举实例RED
        TestEnum testEnum21 = TestEnum.RED;
        System.out.println(testEnum.compareTo(testEnum21));
        System.out.println(BLACK.compareTo(RED));
        System.out.println(RED.compareTo(BLACK));
    }

    public static void main2(String[] args) {
        TestEnum[] testEnums1 = TestEnum.values();
        for (int i = 0; i < testEnums1.length ; i++) {
            //返回它当前的序号
            System.out.println(testEnums1[i] + " "+testEnums1[i].ordinal());
        }
        System.out.println("=====我是一条分割线=====");
        System.out.println(TestEnum.valueOf("BLACK"));
    }
    public static void main1(String[] args) {
        TestEnum testEnum = TestEnum.BLACK;
        switch (testEnum) {
            case RED:
                System.out.println("red");
                break;
            case BLACK:
                System.out.println("black");
                break;
            case WHITE:
                System.out.println("WHITE");
                break;
            case GREEN:
                System.out.println("black");
                break;
            default:
                break;
        }
    }
}

