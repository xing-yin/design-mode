package singleton

/**
 * @Author: Alan Yin
 * @Date: 2022/5/19
 * @Desc: 非并发安全的懒汉方式
 */

type singleton2 struct {
}

var ins2 *singleton2

func GetInsOr2() *singleton2 {
	if ins2 == nil {
		ins2 = &singleton2{}
	}
	return ins2
}
