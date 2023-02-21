# mp-demo
https://github.com/aqcom/beforeProTwo.git

MyBatis-Plus

@TableId
value	映射属性名和字段名
type		主键生成策略
	AUTO	自增
	ASSIGN_ID(默认)	雪花算法:10进制,通过当前时间、mac地址等生成随机数(会增长)
	ASSIGN_UUID	uuid生成:16进制的随机数,需要指定主键id为字符串
@TableField
value	映射属性名和字段名
exist	忽略字段
￼
@TableLogic
被注解的属性名为逻辑删除字段
负载均衡算法
负载均衡器用来决定将请求分发到哪个计算资源上的方法。
常见的负载均衡算法包括以下几种：

1. 轮询算法：按照预定顺序依次将请求分发到后端的每个计算资源上，循环往复。
2. 随机算法：随机选择一个后端计算资源将请求分发过去。
3. 最小连接数算法：将请求分发到连接数最少的后端计算资源上。
4. 最少响应时间算法：将请求分发到响应时间最短的后端计算资源上。
5. IP哈希算法：根据客户端的IP地址计算哈希值，然后将请求分发到相应的后端计算资源上。
6. 动态加权轮询算法：根据后端计算资源的负载情况动态调整权重，将请求分发到负载较轻的后端计算资源上。
7. 动态加权最小连接数算法：根据后端计算资源的负载情况动态调整权重，将请求分发到连接数最少且负载较轻的后端计算资源上。
   不同的负载均衡算法适用于不同的场景，选择合适的负载均衡算法可以提高系统的性能和可靠性。

1.mybatisplus与mybatis有什么区别？
mp是mybatis持久层框架的增强,没有侵入性,不会修改原有的代码
mybatis把SQL语句封装在配置文件中
而mp内置通用 Mapper、通用 Service，不需要再写 xml ,而且内置 Sql 注入剥离器，有效防止Sql注入

2.mybatisplus开发使用流程？
·数据库环境准备
·创建SpringBoot工程，引入MyBatisPlus场景依赖
·在yml中编写DataSource相关配置
·编写mapper去继承BaseMapper
·测试

3.mybatisplus常规的crud方法有哪些？
insert(T): int
deleteByld (Serializable): int
deleteByMap (Map<String, Object>): int
delete (Wrapper<T>): int
deleteBatchlds (Collection<? extends Serializak
updateByld (T): int
update (T, Wrapper<T>): int
selectByld (Serializable): T
selectBatchlds (Collection<? extends Serializak
selectByMap (Map<String, Object>): List<T>
selectOne (Wrapper<T>): T
selectCount (Wrapper<T>): Integer m ~ selectList (Wrapper<T>): List<T>
selectMaps (Wrapper<T>): List<Map<String, Ol
selectObjs(Wrapper<T>): List<Object>
selectPage (E, Wrapper<T>): E
selectMapsPage (E, Wrapper<T>): E

4.mybatisplus如何构建复杂的查询条件？
使用QueryWrapper提供的API,但是查询数据事需要查询字段名而且容易写错,而且字段都是写死的
所以更建议使用LambdaQueryWrapper,直接就集成了常见的CRUD方法


5.使用lambda模式构建查询条件有什么优势？
不用考虑字段名是否一致
解耦合

6.基于mp如何定义通用的crud服务？
Service层接口继承IService
Service层实现类继承ServiceImpl
Mapper接口实现BaseMapper并定义范型,如果不需要改方法名就直接测试类调用

7.什么是逻辑删除，基于mp如何实现？
逻辑删除一般的查询语句查询不到,并没有在数据库中真正的删除
实现:
	在原本的表中添加逻辑删除的字段进行标记状态,
使用@TableLogic在pojo中注解逻辑删除的属性

8.什么是乐观锁，基于mp如何实现？乐观锁有哪些使用场景？
不重视是否有其他线程争抢资源,如果其他线程对自己操作的字段进行修改,则当前操作失败
在数据库中添加版本号字段,然后配置乐观锁拦截器
适合业务周期长的场景

9.MybatisPlus自动填充是如何实现的？
指定插入时自动填充的字段
@TableField(value = "create_time", fill = FieldFill. INSERT)
private Date createTime;
自定插入或者更新时自动填充的字段
@TableField(value = "update_time", fill = FieldFill. INSERT_UPDATE)
private Date updateTime;

