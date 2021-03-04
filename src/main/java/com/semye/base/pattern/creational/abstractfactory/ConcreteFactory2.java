package com.semye.base.pattern.creational.abstractfactory;

/**
 * Created by yesheng on 2018/10/19.
 */
public class ConcreteFactory2 implements AbstractFactory {

    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
