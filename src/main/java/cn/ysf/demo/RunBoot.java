package cn.ysf.demo;

import cn.ysf.demo.dao.UserJpaDao;
import cn.ysf.demo.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;


import java.util.List;

/**
 * @author YiShunFeng
 * @version 1.0
 * @description cn.ysf.demo
 * @data 2020/4/25
 */
@SpringBootApplication
public class RunBoot {
    public static void main(String[] args) {
        ApplicationContext app = SpringApplication.run(RunBoot.class,args);
        UserJpaDao dao = app.getBean(UserJpaDao.class);
        //查询所有用户
       // List<User> list =dao.findAll();
        //排序查询 下边语句等价于 order by id desc
        //List<User> users =dao.findAll(Sort.by(Direction.DESC,"id"));
        //for (User u:users
        //     ) {
        //    System.out.println(u);
       // }
        //分页查询 下边语句表示每页3条数据 显示第一条
//        Pageable pageable = PageRequest.of(0,3);
//        List<User> users = dao.findAll(pageable).getContent();
//        for (User u:users
//             ) {
//            System.out.println(u);
//        }
        //排序分页 根据id Desc 每页取3条取第一条
        /*Pageable pageable = PageRequest.of(0,3,Sort.by(Direction.DESC,"id"));
        List<User> users = dao.findAll(pageable).getContent();
       for (User u:users
            ) {
           System.out.println(u);
       }*/
       //扩展操作 使用
        List<User> users1 = dao.findByNameLike("%王%");
        for (User u1:users1
        ) {
            System.out.println(u1);
        }
    }
}
