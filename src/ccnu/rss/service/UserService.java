package ccnu.rss.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ccnu.rss.dao.UserDao;
import ccnu.rss.entity.User;

@Service
public class UserService {
	@Autowired 
	private UserDao dao;
	
	@Transactional
	public int delete(String acount) {
		return this.dao.delete(acount);
	}
	@Transactional
	public int update(User user) {
		return this.dao.update(user);
	}	
	public int insert(User user) {
		return this.dao.insert(user);
	}
	public List<User> query(User user) {
		return this.dao.query(user);
	}
	public User queryone(String account) {
		return this.dao.queryOne(account);
	}	
}
