package tk.mybatis.simpletest.mapper;

import tk.mybatis.simpletest.model.BlogDto;

import java.util.List;

public interface BlogMapper {
    List<BlogDto> selectAll();
}