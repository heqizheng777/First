package DAO;

import java.util.List;

import pojo.Userinfo;

public interface IUserinfoDAO {
	
	public List<Userinfo> getAllUser();
	
	public Userinfo getUserByid(String id);
	
	public void addUser(Userinfo u);
	
	public int updateUser(Userinfo u);
	
	public int deleteUserByid(int id);
	
}
