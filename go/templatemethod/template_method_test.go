package templatemethod

import (
	"fmt"
	"testing"
)

/**
 * @Author: Alan Yin
 * @Date: 2022/5/19
 * @Desc:
 */

func TestTemplateMethod(t *testing.T) {
	noodle := &Noodle{}
	doCook(noodle)

	fmt.Println("-----------------")
	egg := &Egg{}
	doCook(egg)
}
