package org.springframework.test.load;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mock.beans.MyTestBean;

import static org.junit.Assert.*;

/**
 * Created by sunyinjie on 2017/8/2.
 */
public class BeanFactoryTest {
    @Test
    public void testSimpleLoad() {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("org/springframework/test/load/beanFactoryTest.xml"));
        MyTestBean bean = (MyTestBean) beanFactory.getBean("myTestBean");
        assertEquals("testStr", bean.getTestStr());
    }
}
