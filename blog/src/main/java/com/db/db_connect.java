package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db_connect {
    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Kiểm tra xem trình điều khiển JDBC đã được tải hay chưa
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Thay đổi thông tin kết nối theo cấu hình của bạn
            String jdbcURL = "jdbc:mysql://localhost/blog";
            String username = "root";
            String password = "";

            // Tạo kết nối
            connection = DriverManager.getConnection(jdbcURL, username, password);

            if (connection != null) {
                System.out.println("Kết nối thành công vào cơ sở dữ liệu MySQL!");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection(Connection connection) {
        // Đóng kết nối
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Đã đóng kết nối thành công!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}