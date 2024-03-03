package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SslServerApplication {
   public SslServerApplication() {
   }

   public static void main(String[] args) {
      SpringApplication.run(SslServerApplicationTests.class, args);
   }
}
