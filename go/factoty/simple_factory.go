package main

import "fmt"

/**
 * @Author: Alan Yin
 * @Date: 2022/5/19
 * @Desc: 简单工厂模式
 */

type Person1 struct {
	Name string
	Age  int
}

func (p Person1) Greet1() {
	fmt.Printf("Hi!My name is %s", p.Name)
}

// 简单工厂
func NewPerson1(name string, age int) *Person1 {
	return &Person1{
		Name: name,
		Age:  age,
	}
}
