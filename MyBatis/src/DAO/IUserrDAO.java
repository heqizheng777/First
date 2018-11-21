package DAO;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.FetchType;

import pojo.Userr;

public interface IUserrDAO {
	
	@Select("select * from userr where id=#{id}")
	public Userr getUserrAndArticleById(int id);
	
	
	@Insert("insert into userr values(#{id},#{name},#{my_time})")
	public int TextAdd(Userr u);
	
	@Delete("delete from userr where id=#{id}")
	public int TextDelete(int id);
	
	@Update("update userr set name=#{name} where id=#{id}")
	public int TextUpdate(Userr u);
	
	@Select("select * from userr where id=#{id}")
	@Results({	//↓表示拿着Userr表中的主键id，↓去查articles表中的数据
		@Result(property="articles",column="id",many=@Many(select="DAO.IArticleDAO.getArticleByUserrid",fetchType=FetchType.LAZY))
		
	})
	public Userr TextManyToOne(int id);
}
