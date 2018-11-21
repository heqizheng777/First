package DAO;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import pojo.Article;
import pojo.Userr;

public interface IArticleDAO {
	
	public List<Article> selectArticles(int id);	
	
	@Select("select * from article where userrid=#{id}")
	public List<Article> getArticleByUserrid(int userrid);
	
	public Userr selectUserById(int id);
	
		
	
}
