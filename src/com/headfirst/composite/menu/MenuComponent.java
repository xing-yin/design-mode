package com.headfirst.composite.menu;

/**
 * MenuComponent 对每个方法提供默认的实现
 */
public abstract class MenuComponent {

    /**
     * "组合"方法组织在一起，即新增、删除、取得菜单组件
     *
     * @param menuComponent
     */
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    /**
     * 以下是"操作方法"，被菜单或者菜单项使用
     *
     * @return
     */
    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
}
