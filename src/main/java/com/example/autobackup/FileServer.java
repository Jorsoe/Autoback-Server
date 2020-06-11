package com.example.autobackup;

import com.example.autobackup.dao.NodeMapper;
import com.example.autobackup.dao.NodeStatus;
import com.example.autobackup.entity.Node;
import com.example.autobackup.entity.NodeExample;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

@Controller
public class FileServer extends ServerSocket {

    @Autowired
    NodeMapper mapper;

    public static final int SERVER_PORT = 8999; // 服务端端口
    private ServerSocket server;
    private DataInputStream dis;
    private FileOutputStream fos;

    public FileServer() throws Exception {
    }

    public void task() throws IOException {
        System.out.println("======== 等待连接 ========");
        Socket socket = server.accept();
        System.out.println(" Ip:" + socket.getInetAddress() + "已连接");
        try {
            dis = new DataInputStream(socket.getInputStream());
            // 文件名和长度
            String fileName = dis.readUTF();
            long fileLength = dis.readLong();
            String path = dis.readUTF();
            File directory = new File("D:/server");
            if (!directory.exists()) {
                directory.mkdir();
            }
            File file = new File(directory.getAbsolutePath() + File.separatorChar + fileName);

            fos = new FileOutputStream(file);
            System.out.println("file。。。。。。。。。。。。。。" + path);
            System.out.println("======== 开始接收文件 ========");
            byte[] bytes = new byte[1024];
            int length = 0;
            while ((length = dis.read(bytes, 0, bytes.length)) != -1) {
                fos.write(bytes, 0, length);
                fos.flush();
            }

            System.out.println("======== 文件接收成功 ========");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null)
                    fos.close();
                if (dis != null)
                    dis.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static int getServerPort() {
        return SERVER_PORT;
    }

    public ServerSocket getServer() {
        return server;
    }

    public void setServer(ServerSocket server) {
        this.server = server;
    }

    public DataInputStream getDis() {
        return dis;
    }

    public void setDis(DataInputStream dis) {
        this.dis = dis;
    }

    public FileOutputStream getFos() {
        return fos;
    }

    public void setFos(FileOutputStream fos) {
        this.fos = fos;
    }
}
