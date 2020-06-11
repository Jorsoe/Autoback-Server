package com.example.autobackup;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.net.ServerSocket;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan("com.example.autobackup.dao")
public class AutoBackupApplication {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    FileServer fileServer = new FileServer();
                    fileServer.setServer(new ServerSocket(FileServer.SERVER_PORT));
                    while (true){
                        fileServer.task();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

        SpringApplication.run(AutoBackupApplication.class, args);
    }

}
