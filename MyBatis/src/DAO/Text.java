package DAO;
import java.io.IOException;
import java.io.Reader;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import pojo.Article;
import pojo.Userinfo;
import pojo.Userr;

public class Text {
	public static void main(String[] args) throws IOException {
		Reader reader = Resources.getResourceAsReader("Configuration.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = factory.openSession();
//		List<Userinfo> list = session.selectList("mapper.Userinfo.queryUser");
//		for (Userinfo u : list) {
//			System.out.println(u);
//		}
//		IUserinfoDAO userDAO = session.getMapper(IUserinfoDAO.class);
		//查询所有对象
//		List<Userinfo> list = userDAO.getAllUser();
		//通过id查询一个对象
//		Userinfo u = userDAO.getUserByid("7");
		//新增一个对象
//		userDAO.addUser(new Userinfo(12,"老易傻逼","1","222","123",new Date(),new Date(),"1","1"));
		//更新一个对象
//		userDAO.updateUser(new Userinfo(12,"老易痴呆","1","222","123",new Date(),new Date(),"1","1"));
		//通过id删除一个对象
//		int num = userDAO.deleteUserByid(12);
//		System.out.println("==================================="+num);
		
//		IArticleDAO artDAO = session.getMapper(IArticleDAO.class);
//		List<Article> list = artDAO.selectArticles(1);
//		for (Article article : list) {
//			System.out.println(article.getTitle()+"--作者"+article.getUserr().getName());
//		}
		
		IUserrDAO useDAO = session.getMapper(IUserrDAO.class);
//		Userr userr = useDAO.getUserrAndArticleById(1);
//		System.out.println(userr.getName()+"================");
//		List<Article> list = userr.getArticles();
//		for (Article article : list) {
//			System.out.println(article.getTitle()+"=="+article.getContent());
//		}
		
		
		//测试注解新增
//		Userr u = new Userr();
//		u.setId(5);
//		u.setName("天霸");
//		u.setMy_time(new Date());
//		useDAO.TextAdd(u);
		//测试注解删除
//		useDAO.TextDelete(5);
		//测试注解查询
//		Userr u = useDAO.getUserrAndArticleById(1);
//		System.out.println(u.getName());
		//测试注解修改
//		Userr u = new Userr();
//		u.setId(2);
//		u.setName("天霸动霸tua");
//		useDAO.TextUpdate(u);
		//一对多注解测试
		Userr u= useDAO.TextManyToOne(2);
		System.out.println(u.getName()+"-=-----------");
		System.out.println(u.getArticles().get(0).getContent()+"-===-==--=-=-=-=-=-=-=-=");
		
		
		//提交
		session.commit();
		session.close();
	}
		
}
