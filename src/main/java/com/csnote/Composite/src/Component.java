package com.csnote.Composite.src;

/**
 * 组件（Component）类是组合类（Composite）和叶子类（Leaf）的父类，可以把组合类看成是树的中间节点。
 */
public abstract class Component {

    protected String name;


    public Component(String name) {
        this.name = name;
    }


    public void print() {
        print(0);
    }


    abstract void print(int level);


    abstract public void add(Component component);


    abstract public void remove(Component component);
}
