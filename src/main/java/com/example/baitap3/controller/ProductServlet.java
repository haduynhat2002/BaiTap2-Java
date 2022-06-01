package com.example.baitap3.controller;

import com.example.baitap3.entity.Product;
import com.example.baitap3.model.MySqlUserModel;
import com.example.baitap3.model.UserModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProductServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/product/create.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserModel userModel = new MySqlUserModel();
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        String description = req.getParameter("description");
        String detail = req.getParameter("detail");
        String price = req.getParameter("price");
        String thumbnail = req.getParameter("thumbnail");
        String manufactureEmail = (req.getParameter("manufactureEmail"));
        String manufacturePhone = (req.getParameter("manufacturePhone"));
        Product product = new Product();
        product.setName(name);
        product.setDescription(description);
        product.setDetail(detail);
        product.setPrice(price);
        product.setThumbnail(thumbnail);
        product.setManufactureEmail(manufactureEmail);
        product.setManufacturePhone(manufacturePhone);
        if(!product.isValid()) {
            req.setAttribute("product", product);
            req.setAttribute("errors", product.getErrors());
            return;
        }
        userModel.save(product);
        req.setAttribute("product", product);
        req.getRequestDispatcher("/product/create-success.jsp").forward(req, resp);

    }
}
