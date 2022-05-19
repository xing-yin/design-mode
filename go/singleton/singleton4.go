package singleton

import "sync"

/**
 * @Author: Alan Yin
 * @Date: 2022/5/19
 * @Desc: 更优雅的方式【推荐】
 */

type singleton4 struct {
}

var ins4 *singleton4

// 使用 once.Do 可以确保 ins 实例全局只被创建一次，once.Do 函数还可以确保当同时有多个创建动作时，只有一个创建动作在被执行。
var once sync.Once

func GetInsOr() *singleton4 {
	once.Do(func() {
		ins4 = &singleton4{}
	})
	return ins4
}
