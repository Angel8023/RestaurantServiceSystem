package ccnu.rss.dao;

import java.util.List;

import ccnu.rss.entity.Restaurant;

public interface RestaurantDao {
	int insert(Restaurant restaurant);
	Restaurant queryOne(String resId);
	List<Restaurant> getCommendResList();
}
