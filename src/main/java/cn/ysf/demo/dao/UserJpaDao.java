package cn.ysf.demo.dao;

import cn.ysf.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author YiShunFeng
 * @version 1.0
 * @description cn.ysf.demo.dao
 * @data 2020/4/25
 */
public interface UserJpaDao extends JpaRepository<User,Integer> {
    //使用jpa规则定义。具体规则自己可以百度，这里不做过多说明
    public List<User> findByNameLike(String title);
    //定义SQL语句 nativeQuery=false就默认按第三种JPQL来创建
   @Query(nativeQuery=true,value="select * from boot_user where name like :name")
    public List<User> findLikeSomeOne(@Param("name") String name);
   //JPQL 使用类型名和属性名，区分大小写from后边得写查询出来的类型而不是表名
    //jpql中如果查询所有字段select * 省略不写
    @Query("from User where name like :name")
    public List<User> findLikeSomeOneByJpql(@Param("name") String name);
}
