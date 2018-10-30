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

- java.io
>java.io中最核心的一个概念是流(Stream)，面向流的编程。Java中一个流要么是输入流，要么是输出流，不可能同时即是输入流又是输出流。

- java.nio
> java.nio中拥有三个核心概念：Selector,Channel与Buffer。在java.nio中，我们是面向块(block)或是缓冲区(buffer)编程的。
我们是面向块(block)或是缓冲区(buffer)编程的。Buffer本身就是一块内存，底层实现上，它实际上是个数组。数据的读、写都是通过Buffer来实现的。

除了数组之外，Buffer还提供了对于数据的结构化访问方式，并且追踪到系统的读写过程。
>Java中的7种原生数据类型都有各自对应的Buffer类型，如IntBuffer,LongBuffer,ByteBuffer及CharBuffer等等 （并没有BooleanBuffer）

- Channel指的是可以向其写入数据或是从中读取数据的对象，它类似于java.io中的Stream。

- 所有数据的读写都是通过Buffer来进行的，永远不会出现直接向Channel写入数据的情况，或是直接从Channel读取数据的情况。

- 与Stream不同的是，Channel是双向的，一个流只可能是InputStream或是OutputStream，Channel打开后则可以进行读取、写入或是读写。

- 由于是Channel是双向的，因此它能更好地反应出底层操作系统的真是情况；在Linux系统中，底层操作系统的通道就是双向的。

关于NIO Buffer中的3个重要状态属性的含义

ServerSocket serverSocket = ......
serverSocket.bind(8899);

while(true) {
    Socket socket = serverSocket.accept(); // 阻塞方法
    new Thread(socket);
    run(){
        socket.getInputStream().
        ......
        ......    
    }
}

# netty的源码分析

bossGroup 
workerGroup

# 数组和ArrayList
数组长度是有限制的，而ArrayList是可以存放任意数量的对象，长度不受限制