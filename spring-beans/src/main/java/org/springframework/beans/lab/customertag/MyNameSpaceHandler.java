package org.springframework.beans.lab.customertag;


import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by sunyinjie on 2017/8/4.
 */
public class MyNameSpaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }
}
