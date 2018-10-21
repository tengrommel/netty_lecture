# netty
有的浏览器会请求http://localhost:8899/favicon.ico

    curl -X POST 'http://localhost:8899'
    curl -X PUT 'http://localhost:8899'
    curl -X DELETE 'http://localhost:8899'
    curl 并不同于浏览器 自动关闭
        
>netty本身并不遵循servlet规范

# netty与socket
>netty没有请求路由

- netty编程的步骤

服务器端 
  - 1、定义bossGroup和workerGroup
  - 2、定义initializer 添加handler
  - 3、编写handler 写事件回调方法

# 多客户端的情况

- 结点与结点的通信
- 实时一致性
- 最终一致性

# rmi

remote method invocation
>必须都是java
- client
- server
- 序列化与反序列化（编码和解码）

rpc和rmi

rpc很多RPC框架是跨语言的。

- 1、定义一个接口说明文件：描述了对象（结构体）、对象成员、接口方法等一系列信息。
- 2、通过RPC框架所提供的编译器，将接口说明文件编译成具体语言文件。
- 3、在客户端与服务器端分别引入RPC编译器所生成的文件，即可像调用本地方法一样调用远程方法。

# netty 和protobuf的整合

# Apache Thrift

- scalable cross-language service