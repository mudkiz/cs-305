package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.MessageDigest;


@SpringBootApplication
public class SslServerApplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplicationTests.class, args);
	}

}

@RestController
class ServerController{
//FIXME:  Add hash function to return the checksum value for the data string that should contain your name.    
    @RequestMapping("/hash")
    public String myHash(){
    	String data = null;//set string to null to start
    	try {//try catch block
    	byte[] message = "Hello, Austin Niwa!".getBytes(); 
        MessageDigest digest = MessageDigest.getInstance("SHA-256"); //Message digest set up for the SHA-256 algorithm
        byte[] hash = digest.digest(message);  //Hash Calculation 
        
        
        //String builder and hex calculator to convert byte into SHA-256 string
        //For function appends the SHA-256 characters into a string
        StringBuilder out = new StringBuilder();
        for (byte b : hash) {
            out.append(String.format("%02X", b));
        }
        data = out.toString();
        
    	}catch (Exception e) {
    		System.out.println("Error");
    	}
    	return "<body style='background-color:yellow;margin:auto;width:50%;border:3px solid green;padding:10px;><div style='background-color:white;width:250px;height:100px;'><h1 style='color:HotPink'>Austin Niwa</h1>"+"<h1>SHA-256</h1>"+""+"<p >data: "+data+"</p></div></body>";
    }//funny html
    }





