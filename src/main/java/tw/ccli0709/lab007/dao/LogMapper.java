package tw.ccli0709.lab007.dao;

import java.util.List;
import tw.ccli0709.lab007.entity.Log;

public interface LogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Log record);

    Log selectByPrimaryKey(Long id);

    List<Log> selectAll();

    int updateByPrimaryKey(Log record);
}