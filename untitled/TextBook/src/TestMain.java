import book.BookList;
import user.Admin;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class TestMain {
    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入您的身份：1--》管理员，2-》普通用户");
        int choice = scanner.nextInt();
        if (choice == 1) {
            return new Admin(name);
        } else if (choice == 2) {
            return new NormalUser(name);
        } else {
            System.out.println("输入错误，请重新输入：");
            System.exit(1);
        }
        return null;
    }

    public static void main(String[] args) {
        //准备书籍
        BookList bookList = new BookList();
        //登录
        User user = login();
        while (true) {
            int choice = user.menu();
            //选择菜单
            user.doOperation(bookList, choice);
        }

    }
}
