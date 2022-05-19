package main

import "testing"

/**
 * @Author: Alan Yin
 * @Date: 2022/5/19
 * @Desc:
 */

func TestQueryUser(t *testing.T) {
	doer := NewMockHttpClient()
	if err := QueryUser(doer); err != nil {
		t.Errorf("QueryUser failed,err:%v", err)
	}
}
