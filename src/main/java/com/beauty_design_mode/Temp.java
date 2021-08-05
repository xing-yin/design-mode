package com.beauty_design_mode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections.unmodifiableList() 方法
 *
 * @author yinxing
 * @date 2019/11/24
 */

public class Temp {

    public List<Integer> getUnmodifyList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        return Collections.unmodifiableList(list);
    }

    public List<Integer> getMoifyList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        return list;
    }

    public class Item{
        private String name;

        private String value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public List<Item> getUnmodifyItemList() {
        List<Item> list = new ArrayList<>();
        Item item1 = new Item();
        item1.setName("name1");
        item1.setValue("value1");
        Item item2 = new Item();
        item2.setName("name2");
        item2.setValue("value2");
        list.add(item1);
        list.add(item2);
        return Collections.unmodifiableList(list);
    }

    public static void main(String[] args) {
        /**
         * test1
         */
//        Temp temp = new Temp();
//        System.out.println("before=======");
//        System.out.println(temp.getMoifyList());
//        System.out.println("modify1=======");
//        temp.getMoifyList().clear();
//        System.out.println(temp.getMoifyList());
//        System.out.println("modify2=======");
////        temp.getUnmodifyList().clear();
//        List<Integer> list2 = temp.getUnmodifyList();
//        Integer i = list2.get(0);
//        i= 2;
//        System.out.println(temp.getUnmodifyList());

        /**
         * test2
         */
        Temp temp = new Temp();
        List<Item> list3 = temp.getUnmodifyItemList();
        for (Item item1: list3){
            System.out.println(item1.getName());
        }
        System.out.println("after modify=======");
        Item item = list3.get(0);
        item.setName("name3333");
        for (Item item1: list3){
            System.out.println(item1.getName());
        }

    }
}
