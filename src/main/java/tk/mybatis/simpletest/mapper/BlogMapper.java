package tk.mybatis.simpletest.mapper;

import tk.mybatis.simpletest.model.BlogDto;

public interface BlogMapper {
    BlogDto selectById(String id);
}