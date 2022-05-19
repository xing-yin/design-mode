package singleton

import "sync"

/**
 * @Author: Alan Yin
 * @Date: 2022/5/19
 * @Desc: 并发安全的懒汉方式
 */

type singleton3 struct {
}

var ins3 *singleton3

var mu sync.Mutex

func GetInsOr3() *singleton3 {
	if ins3 == nil {
		mu.Lock()
		if ins3 == nil {
			ins3 = &singleton3{}
		}
		mu.Unlock()
	}
	return ins3
}
