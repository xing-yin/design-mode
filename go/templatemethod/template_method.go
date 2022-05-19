package templatemethod

import "fmt"

/**
 * @Author: Alan Yin
 * @Date: 2022/5/19
 * @Desc: 模版模式
 */

// Cooker 定义接口
type Cooker interface {
	fire()
	cookie()
	outfire()
}

// CookMenu 类似于一个抽象类
type CookMenu struct {
}

func (CookMenu) fire() {
	fmt.Println("开火")
}

// 做菜，交给具体的子类实现
func (m CookMenu) cookie() {
}

func (m CookMenu) outfire() {
	fmt.Println("关火")
}

// 封装具体的步骤
func doCook(cooker Cooker) {
	cooker.fire()
	cooker.cookie()
	cooker.outfire()
}

type Noodle struct {
	CookMenu
}

func (*Noodle) cookie() {
	fmt.Println("炒面条")
}

type Egg struct {
	CookMenu
}

func (Egg) cookie() {
	fmt.Println("炒鸡蛋")
}
