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

public class Test3 {
    @Test
    public void test() throws IOException {

        Course course = new Course();
        int id = 4;
        Integer hours = 32+8;
        String name= "⾼级Web技术" ;
        int schoolId=1;

        course.setId(id);
        course.setName(name);
        course.setHours(hours);
        course.setSchoolId(schoolId);
        //1、获取sqlsessionfactory

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取sqlsession对象

        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取Mapper接口的代理对象

        IStudentMapper iStudentMapper = sqlSession.getMapper(IStudentMapper.class);

        //4.执行方法
        int result = iStudentMapper.updateById(course);
        sqlSession.commit();
        System.out.println(result);

        //5.释放资源

        sqlSession.close();
    }
}
