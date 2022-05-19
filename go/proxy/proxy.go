package proxy

import (
	"fmt"
)

/**
 * @Author: Alan Yin
 * @Date: 2022/5/19
 * @Desc: 代理模式
 */
type Seller interface {
	sell(name string)
}

// Station 火车站
type Station struct {
	stock int // 库存
}

func (station Station) sell(name string) {
	if station.stock > 0 {
		station.stock--
		fmt.Printf("火车站点中：%s买了一张票,剩余：%d \n", name, station.stock)
	} else {
		fmt.Println("票已售罄")
	}
}

type StationProxy struct {
	station *Station // 持有一个火车站
}

func (proxy StationProxy) sell(name string) {
	if proxy.station.stock > 0 {
		proxy.station.stock--
		fmt.Printf("代理点中：%s买了一张票,剩余：%d \n", name, proxy.station.stock)
	} else {
		fmt.Println("票已售罄")
	}
}
