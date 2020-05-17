## 简介
“菜来啦”是一个互联网+买菜平台，通过网络平台下订单，让用户更加方便的买菜。
此项目为该平台的后端，使用spring boot + mybatis 的架构， 
[参考](https://github.com/lihengming/spring-boot-api-project-seed/stargazers)
.
## API文档
https://documenter.getpostman.com/view/11279327/Szmk2G5W?version=latest
## 工具
Json工具：https://www.sojson.com/editor.html  
API测试和文档工具：POSTMman
## 主要功能
-------用户相关------

1. user 用户
   1. 添加用户
   2. 修改用户信息
      1. 昵称
      2. 密码
      3. 等
1. 地址信息
   1. 获取已保存地址
   2. 修改已保存地址
   3. 删除已保存的地址
   4. 添加地址信息

------商品相关-------

1. product 商品
   1. 查看商品信息
   2. 筛选
      1. 名称
      2. 价格
2. 分类
   1. 获取所有分类的所有商品
   2. 获取所有分类

------以下三个都是product和user之间的关系，差不多------

1. product order 订单
   1. 添加订单
   2. 获取订单信息
   3. 删除订单
2. cart 用户购物车商品
   1. 添加
   2. 查看
   3. 删除
3. 浏览记录
   1. 添加
   2. 查看所有（根据uid）