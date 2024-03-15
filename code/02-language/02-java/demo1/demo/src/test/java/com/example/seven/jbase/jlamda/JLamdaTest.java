package com.example.seven.jbase.jlamda;

import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import org.junit.jupiter.api.Test;

@SpringBootTest(classes = JLamdaTest.class)
public class JLamdaTest {

        @Test
        public void test() {

        String[] planets = new String[] { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length:");
        Arrays.sort(planets, (String first, String second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        // construct a timer that calls the lambda expression
        Timer t = new Timer(1000, event -> System.out.println("The time is " + new Date().toString()));
        t.start();

        // keep program running until user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
        }

}
