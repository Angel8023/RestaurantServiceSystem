package ccnu.rss.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import ccnu.rss.entity.Restaurant;
import ccnu.rss.entity.User;
import ccnu.rss.service.RestaurantService;
import ccnu.rss.service.UserService;
import net.sf.json.JSONObject;
import util.ImageUtils;

@Controller 
@RequestMapping("/restaurant")
@Scope("prototype")
public class RestaurantController {
	    //自动装配Service
		@Autowired
		private RestaurantService restaurantService;
		@Autowired
		private UserService userService;
		
		@RequestMapping(value="/test",produces="text/html;charset=UTF-8")       //这是一个测试方法
		@ResponseBody
		public String Test(){
			System.out.println("hello world");
			JSONObject json = new JSONObject();
			User user = new User();
			user.setUserName("小明");
			user.setGender("男");	    
		    json.put("user", user);			    		
			return JSON.toJSONString(json);
		}
		
		@RequestMapping(value="/getCommendRes",produces="text/html;charset=UTF-8")     //开店
		@ResponseBody
		public String getCommendRes(){
			JSONObject json = new JSONObject();	
			List<Restaurant> restaurantList = new ArrayList<>();
			restaurantList = this.restaurantService.getCommendResList();			
			json.put("code", "1");
			json.put("msg", "success");  
			json.put("restaurantList", restaurantList);		
			return JSON.toJSONString(json);			
		}
							
		@RequestMapping(value="/addRes",produces="text/html;charset=UTF-8")     //开店
		@ResponseBody		
		public String insert(@Param("myRestaurant")Restaurant restaurant){
			JSONObject json = new JSONObject();			
			System.out.println("hello");		
			//将对象中的图片取出来，并传入正确的路径，存入数据库中			
			/*String fileName = restaurant.getUserAccount()+restaurant.getResDate();			
			System.out.println("success");
			restaurant.setResPicPath(fileName);*/
			this.restaurantService.insert(restaurant);	
			User user = this.userService.queryone(restaurant.getUserAccount());
			user.setIdentify("shopkeeper");  //开店成功后，将身份置为店主
			this.userService.update(user);
			json.put("code", "1");
			json.put("msg", "success");  //注册成功
			json.put("myRestaurant", restaurant);
			/*if(ImageUtils.GenerateImage(restaurant.getResPicPath(), fileName)){
				System.out.println("success");
				restaurant.setResPicPath(fileName);
				this.restaurantService.insert(restaurant);	
				User user = this.userService.queryone(restaurant.getUserAccount());
				user.setIdentify("shopkeeper");  //开店成功后，将身份置为店主
				this.userService.update(user);
				json.put("code", "1");
				json.put("msg", "success");  //注册成功
				json.put("myRestaurant", restaurant);
			}else{
				System.out.println("fail");
				json.put("code", "0");
				json.put("msg", "fail");
			}*/
			return JSON.toJSONString(json);	
		}
}
