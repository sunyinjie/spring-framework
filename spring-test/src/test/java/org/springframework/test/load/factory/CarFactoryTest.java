package org.springframework.test.load.factory;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.mock.beans.factory.Car;
import org.springframework.test.load.BaseTest;

/**
 * Created by sunyinjie on 2017/8/4.
 */
public class CarFactoryTest extends BaseTest {
    @Test
    public void testLoadBean() {
        ApplicationContext bf = super.load();
        Object carFBean = bf.getBean("carFBean");
        Object bean = bf.getBean("&carFBean");
        System.out.println(carFBean);
        System.out.println(bean);
        Assert.assertNotEquals(carFBean, bean);
    }
}
