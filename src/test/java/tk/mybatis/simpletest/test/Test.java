package tk.mybatis.simpletest.test;

import org.apache.ibatis.session.SqlSession;
import tk.mybatis.simpletest.SqlSessionHelper;
import tk.mybatis.simpletest.mapper.BlogMapper;
import tk.mybatis.simpletest.model.BlogDto;

import java.util.List;

/**
 * 描述信息
 *
 * @author liuzh
 * @since 2015-07-12
 */
public class Test {

    public static void print(String str) {
        System.out.println(str);
    }

    @org.junit.Test
    public void test() {
        SqlSession session = SqlSessionHelper.getSqlSession();
        try {
            BlogMapper blogMapper = session.getMapper(BlogMapper.class);
            List<BlogDto> blogDtoList = blogMapper.selectAll();
            for (BlogDto blogDto : blogDtoList) {
                print("================触发查询======================");
                blogDto.getUser();
                print("=============================================");
            }
        } finally {
            session.close();
        }
    }
}
