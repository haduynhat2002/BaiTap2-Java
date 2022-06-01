package com.example.baitap3.model;
import com.example.baitap3.constant.SqlConstant;
import com.example.baitap3.entity.Product;
import com.example.baitap3.unity.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class MySqlUserModel implements UserModel {


    @Override
    public boolean save(Product product) {
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement =
                    connection.prepareStatement(SqlConstant.ACCOUNT_INSERT);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getDescription());
            preparedStatement.setString(3, product.getDetail());
            preparedStatement.setString(4, product.getPrice());
            preparedStatement.setString(5, product.getThumbnail());
            preparedStatement.setString(6, product.getManufactureEmail());
            preparedStatement.setString(7, product.getManufacturePhone());
            preparedStatement.setString(8, product.getCreatedAt().toString());
            preparedStatement.setString(9, product.getUpdatedAt().toString());
            preparedStatement.setInt(10, product.getCreatedBy());
            preparedStatement.setInt(11, product.getUpdatedBy());
            preparedStatement.setInt(12, product.getStatus().getValue());
            preparedStatement.execute();
            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean update(int id, Product productUpdate) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product findById(int id) {
        return null;
    }
}
