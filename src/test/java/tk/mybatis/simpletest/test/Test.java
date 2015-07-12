package tk.mybatis.simpletest.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import tk.mybatis.simpletest.SqlSessionHelper;
import tk.mybatis.simpletest.mapper.BlogMapper;
import tk.mybatis.simpletest.model.Blog;
import tk.mybatis.simpletest.model.BlogComments;
import tk.mybatis.simpletest.model.BlogDto;

import java.util.List;

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
            Assert.assertNotNull(blogDto);
            show(blogDto);
        } finally {
            session.close();
        }
    }

    public static void show(BlogDto blog){
        print("当前正在访问博客 - "+blog.getTitle());
        print("博客ID："+blog.getId());
        print("博客地址："+blog.getUrl());
        if(blog.getUser()!=null){
            print("=======================================");
            print("博客作者信息：");
            print("用户名："+blog.getUser().getUsername());
            print("用户信息："+blog.getUser().getUserinfo());
        }
        if(blog.getPosts()!=null&&blog.getPosts().size()>0){
            print("=======================================");
            print("博客文章数："+blog.getPosts().size());
            for(int i=0;i<blog.getPosts().size();i++){
                print("第"+(i+1)+"篇:"+blog.getPosts().get(i).getPostid());
                print("内容：\n"+blog.getPosts().get(i).getPostinfo());
                List<BlogComments> comments = blog.getPosts().get(i).getComments();
                if(comments!=null&&comments.size()>0){
                    print("====================");
                    print("用户回复:");
                    for(int j=0;j<comments.size();j++){
                        print(comments.get(j).getUsername()+" ： “"+comments.get(j).getMsg()+"”");
                    }
                }
                print("\n");
            }
        }

    }

    public static void print(String str){
        System.out.println(str);
    }
}
