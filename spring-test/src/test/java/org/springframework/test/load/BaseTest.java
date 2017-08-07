package org.springframework.test.load;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by user on 2017/8/2.
 */
public class BaseTest {
    private static final String XML_PATH = "org/springframework/test/load/beanFactoryTest.xml";

    protected ApplicationContext load() {
        ApplicationContext bf = new ClassPathXmlApplicationContext(XML_PATH);
        return bf;
    }

/*    @Test
    public void testInstantiateClass() {

    }*/
}
