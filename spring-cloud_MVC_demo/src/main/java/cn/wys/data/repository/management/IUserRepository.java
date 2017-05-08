package cn.wys.data.repository.management;

import cn.wys.data.domain.management.User;

public interface IUserRepository {
	public User getUserByUserId(Long userId);

	public User getUsersByUserName(String userName);

	public int addUser(User user);
	
	public int updateUser(User user);

	public int removeUserByUserId(Long userId);
}
