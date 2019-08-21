package com.mongodb.mongo.Services;

import java.math.BigInteger;
import java.util.List;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 

import com.mongodb.mongo.one.users;
import com.mongodb.mongo.Repository.userRepo;;

 

@Service
public class userService {
    
    @Autowired
    private userRepo userrepo;
    
    public String createUser(String username, String password, String emailid,String age,String salary, BigInteger contactNo)
    {
        users user = new users(username,password,emailid,age,salary,contactNo);
        userrepo.save(user);
        //String a = user.getId();
        return ("New user created with id: " + user.getId());
    }
    public String removeUser()
    {
    	userrepo.deleteAll();
    	return "deleted";
    	
    }
     
    
    public List<users> listusers()
    {
        return userrepo.findAll();
        
    }

 

}