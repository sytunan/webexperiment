package mybatis_test;

import com.itheima.mapper.IStudentMapper;
import com.itheima.pojo.Course;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test2 {
    @Test
    public void test() throws IOException {

        String schoolName = "计算机学院";
        //1、获取sqlsessionfactory

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取sqlsession对象

        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取Mapper接口的代理对象

        IStudentMapper iStudentMapper = sqlSession.getMapper(IStudentMapper.class);

        //4.执行方法

        List<Course> students = iStudentMapper.selectByschoolName(schoolName);
        System.out.println(students);

        //5.释放资源

        sqlSession.close();
    }
}
