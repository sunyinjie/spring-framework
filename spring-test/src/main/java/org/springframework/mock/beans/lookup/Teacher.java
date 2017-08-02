package org.springframework.mock.beans.lookup;

/**
 * Created by user on 2017/8/2.
 */
public class Teacher extends User{
    @Override
    public void showMe() {
        System.out.println("im teacher");
        System.out.println("shut the fuck up");
    }
}
