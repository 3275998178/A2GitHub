package dao;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;
import po.Dept;

import java.util.List;

public interface DeptDao {
    @Select("select * from dept")
    List<Dept>selectAll();

    /**
     * 根据id查询
     */
    @Select("select * from dept where dept_id=#{dept_id}")
    Dept selectOne(int dept_id);
    @Select("select * from dept")
    @Result(id=true)
}
