package com.csnote.Composite.src;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合对象拥有一个或者多个组件对象，因此组合对象的操作可以委托给组件对象去处理，
 * 而组件对象可以是另一个组合对象或者叶子对象。
 */
public class Composite extends Component {

    private List<Component> child;

    public Composite(String name) {
        super(name);
        child = new ArrayList<>();
    }


    @Override
    void print(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println("Composite:" + name);
        for (Component component : child) {
            component.print(level + 1);
        }
    }


    @Override
    public void add(Component component) {
        child.add(component);
    }


    @Override
    public void remove(Component component) {
        child.remove(component);
    }
}
