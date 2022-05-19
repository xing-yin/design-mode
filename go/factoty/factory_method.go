package main

import "fmt"

/**
 * @Author: Alan Yin
 * @Date: 2022/5/19
 * @Desc: 工厂方法模式
 */

type Person3 struct {
	name string
	age  int
}

func NewPersonFactory(age int) func(name string) Person3 {
	return func(name string) Person3 {
		return Person3{
			name: name,
			age:  age,
		}
	}
}

// 可以使用此功能来创建具有默认年龄的工厂
func appDemo() {
	newBaby := NewPersonFactory(1)
	baby := newBaby("Cindy")
	fmt.Println(baby.name)

	newTeenager := NewPersonFactory(16)
	teen := newTeenager("Bob")
	fmt.Println(teen)
}
