package tk.mybatis.simpletest.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import tk.mybatis.simpletest.SqlSessionHelper;
import tk.mybatis.simpletest.mapper.BlogMapper;
import tk.mybatis.simpletest.model.BlogDto;

/**
 * 描述信息
 *
 * @author liuzh
 * @since 2015-07-12
 */
public class Test {

    @org.junit.Test
    public void test() {
        SqlSession session = SqlSessionHelper.getSqlSession();
        try {
            BlogMapper blogMapper = session.getMapper(BlogMapper.class);
            BlogDto blogDto = blogMapper.selectById("1");
            System.out.println("==================load user...=============");
            blogDto.getUser();
            System.out.println("==================================================");
            Assert.assertNotNull(blogDto);
            show(blogDto);
        } finally {
            session.close();
        }
    }

    public static void show(BlogDto blog) {
        print("当前正在访问博客 - " + blog.getTitle());
        print("博客ID：" + blog.getId());
        print("博客地址：" + blog.getUrl());
        if (blog.getUser() != null) {
            print("=======================================");
            print("博客作者信息：");
            print("用户名：" + blog.getUser().getUsername());
            print("用户信息：" + blog.getUser().getUserinfo());
        }
    }

    public static void print(String str) {
        System.out.println(str);
    }
}
