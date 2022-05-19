package singleton

/**
 * @Author: Alan Yin
 * @Date: 2022/5/19
 * @Desc: 饿汉方式的单例模式
 */

type singleton1 struct {
}

var ins1 *singleton1 = &singleton1{}

func GetInsOr1() *singleton1 {
	return ins1
}
