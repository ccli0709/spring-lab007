package tw.ccli0709.lab007.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tw.ccli0709.lab007.entity.ExpenseRecord;

public interface ExpenseRecordMapper {
    int deleteByPrimaryKey(@Param("id") Long id, @Param("memberId") Long memberId);

    int insert(ExpenseRecord record);

    ExpenseRecord selectByPrimaryKey(@Param("id") Long id, @Param("memberId") Long memberId);

    List<ExpenseRecord> selectAll();

    int updateByPrimaryKey(ExpenseRecord record);
}