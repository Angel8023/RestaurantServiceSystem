package ccnu.rss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ccnu.rss.dao.RestaurantDao;
import ccnu.rss.entity.Restaurant;

@Service
public class RestaurantService {
	@Autowired 
	private RestaurantDao dao;
	
	
	public int insert(Restaurant restaurant) {
		return this.dao.insert(restaurant);
	}
	public List<Restaurant> getCommendResList(){
		return this.dao.getCommendResList();		
	}

}
