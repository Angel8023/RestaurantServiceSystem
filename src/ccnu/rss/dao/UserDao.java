package ccnu.rss.dao;

import java.util.List;


import org.springframework.stereotype.Repository;
import ccnu.rss.entity.User;

@Repository
public interface UserDao {
	List<User> query(User user);
	int insert(User user);
	int delete(String account);
	int update(User user);
	User queryOne(String account);
}
