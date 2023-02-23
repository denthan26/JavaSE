import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Person p1 = new Person();
        p1.speak();
        p1.cal(5);
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        p1.cal(n);
    }
}

class Person {
    int age;
    public void speak() {
        System.out.println("hello world");
    }

    public void cal(int n) {
        int ret = 0;
        for(int i = 0; i < n; i++){
            ret += i;
        }
        System.out.println(ret);
    }
}



////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int[][] map = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    MyTool tool = new MyTool();
    tool.print(map);
    int[] arr = tool.get(1, 4);
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    arr = tool.get((int)1.1, (int)4.4);
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    }
}



class MyTool {
    public void print(int[][] map) {
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[] get(int n1, int n2) {
        int[] arr = new int[2];
        arr[0] = n1 + n2;
        arr[1] = n1 - n2;
        return arr;
    }
}

//////////////////////////////////////////////////////////////////////////////////////

// 同一个类中的方法直接调用
// 跨类的方法调用
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    A a = new A();
    a.Say(10);
    a.m1();

    }
}



class A {
    public void print(int n) {
        System.out.println(n);
    }

    public void Say(int n) {
        print(n);
    }

    public void m1() {
        System.out.println("m1 start");
        B b = new B();
        b.print();
        System.out.println("m1 end");
    }
}

class B {
    public void print() {
        System.out.println("print start");
        System.out.println("hello");
        System.out.println("print end");
    }
}

////////////////////////////////////////////////////////////////////////////////////////
// 同一个类中的方法直接调用
// 跨类的方法调用
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int row, col;
        char ch;
        System.out.println("请输入行数，列数，字符，中间用空格分开");
        row = myScan.nextInt();
        col = myScan.nextInt();
        ch = myScan.next().charAt(0);
        A a = new A();
        a.print(row, col, ch);


    }
}



class A {
    public void print(int row, int col, char ch) {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

}



///////////////////////////////////////////////////////////////////////////////////

// 克隆对象
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.age = 10;
        a.name = "milan";
        Tool tool = new Tool();
        A b = tool.copy(a);
        a.age = 50;
        System.out.println(a.age);
        System.out.println(b.age);


    }
}



class A {
    int age;
    String name;
}

class Tool {
    public A copy(A a) {
        A a_ = new A();
        a_.age = a.age;
        a_.name = a.name;
        return a_;
    }
}

