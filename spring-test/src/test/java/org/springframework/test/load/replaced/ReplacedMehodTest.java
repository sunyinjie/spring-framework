package org.springframework.test.load.replaced;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.mock.beans.replaced.TestChangeMethod;
import org.springframework.test.load.BaseTest;

/**
 * Created by sunyinjie on 2017/8/3.
 */
public class ReplacedMehodTest extends BaseTest{
    @Test
    public void testReplacedMethod() {
        ApplicationContext bf = super.load();
        TestChangeMethod testChangeMethod = (TestChangeMethod) bf.getBean("testChangeMethod");
        testChangeMethod.changeMe();
    }
}
