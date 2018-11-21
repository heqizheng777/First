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
		//��ѯ���ж���
//		List<Userinfo> list = userDAO.getAllUser();
		//ͨ��id��ѯһ������
//		Userinfo u = userDAO.getUserByid("7");
		//����һ������
//		userDAO.addUser(new Userinfo(12,"����ɵ��","1","222","123",new Date(),new Date(),"1","1"));
		//����һ������
//		userDAO.updateUser(new Userinfo(12,"���׳մ�","1","222","123",new Date(),new Date(),"1","1"));
		//ͨ��idɾ��һ������
//		int num = userDAO.deleteUserByid(12);
//		System.out.println("==================================="+num);
		
//		IArticleDAO artDAO = session.getMapper(IArticleDAO.class);
//		List<Article> list = artDAO.selectArticles(1);
//		for (Article article : list) {
//			System.out.println(article.getTitle()+"--����"+article.getUserr().getName());
//		}
		
		IUserrDAO useDAO = session.getMapper(IUserrDAO.class);
//		Userr userr = useDAO.getUserrAndArticleById(1);
//		System.out.println(userr.getName()+"================");
//		List<Article> list = userr.getArticles();
//		for (Article article : list) {
//			System.out.println(article.getTitle()+"=="+article.getContent());
//		}
		
		
		//����ע������
//		Userr u = new Userr();
//		u.setId(5);
//		u.setName("���");
//		u.setMy_time(new Date());
//		useDAO.TextAdd(u);
		//����ע��ɾ��
//		useDAO.TextDelete(5);
		//����ע���ѯ
//		Userr u = useDAO.getUserrAndArticleById(1);
//		System.out.println(u.getName());
		//����ע���޸�
//		Userr u = new Userr();
//		u.setId(2);
//		u.setName("��Զ���tua");
//		useDAO.TextUpdate(u);
		//һ�Զ�ע�����
		Userr u= useDAO.TextManyToOne(2);
		System.out.println(u.getName()+"-=-----------");
		System.out.println(u.getArticles().get(0).getContent()+"-===-==--=-=-=-=-=-=-=-=");
		
		
		//�ύ
		session.commit();
		session.close();
	}
		
}
