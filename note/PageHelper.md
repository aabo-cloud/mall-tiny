## 分页原理

PageHelper是MyBatis的一个插件，内部实现了一个PageInterceptor拦截器。

Mybatis会加载这个拦截器到拦截器链中。

在使用过程中先使用 `PageHelper.startPage()` 在当前线程上下文中设置一个 `ThreadLocal` 变量。

再利用 `PageInterceptor` 分页拦截器拦截，从 `ThreadLocal` 中拿到分页的信息。

如果有分页信息拼装分页SQL（limit语句等）进行分页查询，最后再把 `ThreadLocal` 中的东西清除掉。

分页插件PageHelper工作原理
https://blog.csdn.net/fedorafrog/article/details/104412140