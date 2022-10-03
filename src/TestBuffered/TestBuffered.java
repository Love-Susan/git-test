package TestBuffered;

import java.io.*;

public class TestBuffered {
    public static void main(String[] args) throws Exception{
        String str = "zhangsan";
        System.out.println("Hello git");
        System.out.println("Hello gitHub");
        System.out.println("Hello gitHub1111");

        System.out.println("str=" + str);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        //如果字节流输入回车的话，str的值就会编程空字符串

        System.out.println("------------");
        System.out.println(str + "123");
        System.out.println(str.equals(""));  //true
        System.out.println(str==null);  //false
    }
}
