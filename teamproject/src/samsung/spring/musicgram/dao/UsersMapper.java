package samsung.spring.musicgram.dao;

import org.apache.ibatis.annotations.Mapper;

import samsung.spring.musicgram.dto.Users;

@Mapper
public interface UsersMapper {
	public int join(Users user);
	public int login(String id, String password);
	public void logout();
}
