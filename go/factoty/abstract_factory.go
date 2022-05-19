package main

import "fmt"

/**
 * @Author: Alan Yin
 * @Date: 2022/5/19
 * @Desc: 抽象工厂模式
 */
type Person2 interface {
	Greet()
}

// 定义了一个不可导出的结构体person
type person2 struct {
	name string
	age  int
}

func (p person2) Greet() {
	fmt.Printf("Hi! My name is %s", p.name)
}

// 在通过 NewPerson2 创建实例的时候返回的是接口，而不是结构体
func NewPerson2(name string, age int) Person2 {
	return person2{
		name: name,
		age:  age,
	}
}
