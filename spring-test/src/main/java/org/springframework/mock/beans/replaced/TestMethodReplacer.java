package org.springframework.mock.beans.replaced;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Created by sunyinjie on 2017/8/3.
 */
public class TestMethodReplacer implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("i am new one");
        return null;
    }
}
