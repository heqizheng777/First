package pojo;

import java.util.Date;
import java.util.List;

public class Userr {
	private int id;
	private String name;
	private Date my_time;
	private List<Article> articles;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getMy_time() {
		return my_time;
	}
	public void setMy_time(Date my_time) {
		this.my_time = my_time;
	}
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	
	
	
	
	
	
	
}
