package strategy

import (
	"fmt"
	"testing"
)

/**
 * @Author: Alan Yin
 * @Date: 2022/5/19
 * @Desc:
 */

func TestStrategy(t *testing.T) {
	operator := Operator{}

	operator.setStrategy(&add{})
	result := operator.caculate(1, 2)
	fmt.Println("add:", result)

	operator.setStrategy(&reduce{})
	result2 := operator.caculate(2, 1)
	fmt.Println("reduce:", result2)
}
