package main

import (
	"net/http"
	"net/http/httptest"
)

/**
 * @Author: Alan Yin
 * @Date: 2022/5/19
 * @Desc: 可以实现多个工厂函数，返回不同的接口实现
 */

// We define a Doer interface, that has the method signature
// of the `http.Client` structs `Do` method
type Doer interface {
	Do(req *http.Request) (*http.Response, error)
}

// This gives us a regular HTTP client from the `net/http` package
func NewHTTPClient() Doer {
	return &http.Client{}
}

// mockHttpClient 是 Mock 出来的对象
type mockHttpClient struct {
}

func (*mockHttpClient) Do(req *http.Request) (*http.Response, error) {
	// The `NewRecorder` method of the httptest package gives us
	// a new mock request generator
	res := httptest.NewRecorder()

	// calling the `Result` method gives us
	// the default empty *http.Response object
	return res.Result(), nil
}

// NewHTTPClient 和 NewMockHTTPClient 都返回了同一个接口类型 Doer，这使得二者可以互换使用。
func NewMockHttpClient() Doer {
	return &mockHttpClient{}
}

// 原始的函数（即带测试函数）
func QueryUser(doer Doer) error {
	req, err1 := http.NewRequest("GET", "http://iam.api.marmotedu.com:8080/v1/secrets", nil)
	if err1 != nil {
		return err1
	}

	_, err2 := doer.Do(req)
	if err2 != nil {
		return err2
	}
	return nil
}
