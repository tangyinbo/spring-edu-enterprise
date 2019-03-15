package com.cowboy;

import static org.junit.Assert.assertTrue;

import com.cowboy.domain.Human;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Iterator;
import java.util.Map;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {
    @Autowired
    private Environment environment;
    @Autowired
    private Map<String, Human> humans;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        System.out.println("-------------------------");
        System.out.println(environment.getProperty("name"));
        System.out.println(environment.getProperty("age"));
        System.out.println("------------------------");
        Iterator<Map.Entry<String, Human>> iterator = humans.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Human> next = iterator.next();
            System.out.println(next.getKey() + ">>" + next.getValue());
        }

    }
}
