# microservice-springcloud
微服务开发
# microservicecloud 
模块表示是父模块，将模块中的公共部分进行引用，其他模块直接以父模块的方式进行引用
# microservicecloud-api
这个模块是代码的公共模块，将各个模块中公共的部分抽取出来，别的模块以maven依赖的方式进行引用
这样公共的代码修改一遍其他的代码就会生效的
# microservicecloud-consumer-user-80
这个模块是微服务的消费者
# microservicecloud-eureka-7101
# microservicecloud-pprovider-user-8001
这个是为微服务的服务提供者
