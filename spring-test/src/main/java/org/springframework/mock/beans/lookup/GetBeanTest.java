package org.springframework.mock.beans.lookup;

/**
 * Created by user on 2017/8/2.
 */
public abstract class GetBeanTest {
    public abstract User getBean();

    public void showMe() {
        this.getBean().showMe();
    }
}
