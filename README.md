# SpringAlibabaCloud
> Nacos 注册中心,GateWay 网关,sentinel 限流,seata 分布式事物
## USER-SERVICE
#### 访问程序
`http://127.0.0.1:8010/users/1`
`http://127.0.0.1:8020/orders/1/1`
`http://127.0.0.1:8010/api/users/1`
`http://127.0.0.1:8020/orders/1/1`
#### GateWay 网关
`http://127.0.0.1:8010/users/1`
`http://127.0.0.1:8020/orders/1/1`
`http://127.0.0.1:7010/users/1`
`http://127.0.0.1:7010/orders/1/1`
#### sentinel 限流
`http://192.168.27.25:8038/#/dashboard/flow/order-service`
`sentinel/sentinel`
#### 注册中心 Nacos
`http://192.168.27.25:8848/nacos`
`nacos/nacos`
