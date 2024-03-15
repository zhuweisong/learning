package com.example.seven.jbase.jinterface;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = JInterfaceTest.class)
public class JInterfaceTest {

    @Test
    public void test() {
        Student student = new Student();
        assert(student.getName().equals("Student"));
    }

}
