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
