package org.springframework.test.load.customertag;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.lab.customertag.User;
import org.springframework.context.ApplicationContext;
import org.springframework.test.load.BaseTest;

/**
 * Created by sunyinjie on 2017/8/4.
 */
public class CustomerTagTest extends BaseTest {
    @Test
    public void testBean() {
        ApplicationContext bf = super.load();
        User user = (User) bf.getBean("testBean");
        System.out.println(user);
        Assert.assertEquals("james", user.getUserName());
        Assert.assertEquals("james@gmail.com", user.getEmail());
    }
}
