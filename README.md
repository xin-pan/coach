# 毕业生教学计划

## 技术栈 BE: SBT + Play + Ebean
## 技术栈 FE: Vue

## 课程：
1. SBT+Play
    * [Simplest SBT](sbt-unit-test): 完成最简单的Junit测试.
    * SBT [scaffold](https://github.com/xin-pan/coach/commit/44825a5d3dda7bf61a1f9b2f8407d405d690f59a): 
      `sbt new playframework/play-java-seed.g8.`
    * SBT [Flyway plugin](https://github.com/xin-pan/coach/commit/c0ea94b588d0f7dc4372caba081790818f93e1ca)
    * Play引入[Ebean](https://github.com/xin-pan/coach/commit/2e73708d650325d031752de5587c09212fb2dbc9)(或JPA)
1. Ebean
    * REST接口完成一个Ebean实体的CRUD.

        | Method        | URI           |
        | ------------- |:------------- |
        | POST          | /users        |
        | GET           | /users        |
        | GET           | /users/{UUID} |
        | PUT           | /users/{UUID} |
        | PATCH         | /users/{UUID} |
        
    * 用Ebean实现OneToOne, ManyToOne, OneToMany, ManyToMany实体的查询操作，在控制台中打印sql日志
    * (More to be added)
1. Vue(To be designed...)
1. 沙盒项目(To be designed...)
