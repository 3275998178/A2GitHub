import dao.DeptDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import po.Dept;

import java.io.IOException;
import java.io.InputStream;
import java.security.PublicKey;
import java.util.List;

public class TestMyBatis {
    private InputStream is;
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    private DeptDao dd;
    @org.junit.Test
    public void test()throws IOException{
        //1.加载配置文件
        InputStream is= Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession=sqlSessionFactory.openSession(true);
        DeptDao dd=sqlSession.getMapper(DeptDao.class);
        List<Dept> depts = dd.selectAll();
        for (Dept dept : depts) {
            System.out.println("dept = " + dept);
        }
      @org.junit.Test
              public void testSeleceAll()throws IOException{
            Dept dept=dd.selectOne(13);
            System.out.println("dept="+dept);

        }
    }
    }

