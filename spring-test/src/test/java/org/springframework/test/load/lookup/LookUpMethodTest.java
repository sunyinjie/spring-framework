package org.springframework.test.load.lookup;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.mock.beans.lookup.GetBeanTest;
import org.springframework.test.load.BaseTest;

/**
 * Created by user on 2017/8/2.
 */
public class LookUpMethodTest extends BaseTest {
    @Test
    public void testLookUpMetho() {
        ApplicationContext bf = super.load();
        GetBeanTest gbt = (GetBeanTest) bf.getBean("getBeanTest");
        gbt.showMe();
    }
}
