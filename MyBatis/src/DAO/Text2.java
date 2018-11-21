package DAO;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import pojo.Blog;

public class Text2 {
	public static void main(String[] args) throws IOException {
		Reader reader = Resources.getResourceAsReader("Configuration.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = factory.openSession();
		IBlogDAO blDAO = session.getMapper(IBlogDAO.class);
		List<Blog> list = blDAO.getAllBlog();
		
		
		
		session.commit();
		session.close();
	}
}
