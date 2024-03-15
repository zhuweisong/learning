package com.example.seven.demo.jbase.jexception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = JExceptionTest.class)
public class JExceptionTest {

    @Test
    public void test() {

        Throwable t = new Throwable();
        StringWriter out = new StringWriter();

        t.printStackTrace(new PrintWriter(out));
        String descrption = out.toString();
        System.out.println(descrption);

        // Java 9
        //
        StackWalker walker = StackWalker.getInstance();
        walker.forEach(System.out::println);


        //
        ArrayList<String>  list = new ArrayList<String>();

        // 不能创建泛型数组
      // var t = new ArrayList<String>[];
    }

}
