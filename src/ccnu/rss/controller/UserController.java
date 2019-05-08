package ccnu.rss.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import ccnu.rss.entity.User;
import ccnu.rss.service.UserService;
import net.sf.json.JSONObject;

@Controller 
@RequestMapping("/user")
@Scope("prototype")
public class UserController {
	//�Զ�װ��Service
	@Autowired
	private UserService service;		
	
	@RequestMapping(value="/test",produces="text/html;charset=UTF-8")       //����һ�����Է���
	@ResponseBody
	public String Test(){
		System.out.println("hello world");
		JSONObject json = new JSONObject();
		User user = new User();
		user.setUserName("С��");
		user.setGender("��");	    
	    json.put("user", user);			    		
		return JSON.toJSONString(json);
	}
	
	@RequestMapping(value="/query",produces="text/html;charset=UTF-8")     //��name��ѯ��������û�
	@ResponseBody
	public String query(@Param("user")User user) {
		JSONObject json = new JSONObject();
		List<User> userList = this.service.query(user);		
		json.put("users", userList);
		return JSON.toJSONString(json);
	}
	
	@RequestMapping(value="/login",produces="text/html;charset=UTF-8")       //��½
	@ResponseBody	
	public String login(@Param("userAccount")String userAccount,@Param("userPasswd")String userPasswd) {
		JSONObject json = new JSONObject();			
		//System.out.println(userAccount+","+userPasswd);			
		User myuser = this.service.queryone(userAccount);
		if(myuser==null){
			json.put("code", "0");
		    json.put("msg", "none");  //�û�������
		    System.out.println("�û�������");
		}else{
			if(userPasswd.equals(myuser.getUserPasswd())){
				json.put("code", "1");
			    json.put("msg", "1");
				json.put("user", myuser);
				System.out.println("success");
			}else{ 
				json.put("code", "0");
			    json.put("msg", "error");  //�������
			    System.out.println("�������");
			}			
		}
		//System.out.println(user.toString());				
		return JSON.toJSONString(json);
	}
	
	@RequestMapping(value="/register",produces="text/html;charset=UTF-8")     //ע��
	@ResponseBody
	public String insert(@Param("user")User user){
		JSONObject json = new JSONObject();	
		System.out.println(user.toString());
		
		if (this.service.queryone(user.getUserAccount())!= null) {		
			json.put("code", "0");
			json.put("msg", "exist");	//�û��Ѵ���		
		}else{			
			user.setIdentify("normal");
			System.out.println(user.toString());
			this.service.insert(user);	
			json.put("code", "1");
			json.put("msg", "success");  //ע��ɹ�
			json.put("user", user);											
		}
		return JSON.toJSONString(json);
	}	
	
	@RequestMapping("/delete")     //ɾ���û� 
	@ResponseBody
	public String delete(String account) {
		JSONObject json = new JSONObject();	
		//System.out.println(account);
		this.service.delete(account);
		json.put("result", "success");	//ɾ���ɹ�			
		return JSON.toJSONString(json);
	}	
	
	@RequestMapping("/resetpasswd")    //��������
	@ResponseBody
	public String resetpasswd(@Param("user")User user){
		User myuser = (User) this.service.queryone(user.getUserAccount());
		JSONObject json = new JSONObject();	
		if(user.getMibao().equals(myuser.getMibao())){
			myuser.setUserPasswd(user.getUserPasswd());			
			this.service.update(myuser);	
			json.put("result", "success");  //���³ɹ�
			json.put("code", "1");
			json.put("user", myuser);							
		}else{
			json.put("code", "0");
			json.put("result", "fail");  //���³ɹ�
		}
		return JSON.toJSONString(json);			
	}	
	                                        
	@RequestMapping("/saveMyInfo")    //�����û���Ϣ
	@ResponseBody
	public String update(@Param("user")User user) {
		JSONObject json = new JSONObject();	
		this.service.update(user);	
		json.put("code", "1");
		json.put("result", "success");  //���³ɹ�
		json.put("user", user);				
		return JSON.toJSONString(json);
	}	
}
