package com.example.baitap3.entity;
import com.example.baitap3.base.BaseEntity;
import com.example.baitap3.myenum.ProductStatus;
import java.time.LocalDateTime;
import java.util.HashMap;


public class Product extends BaseEntity {
    private int id;
    private String name  = "";
    private String description = "";
    private String detail = "";
    private String price = "";
    private String thumbnail = "";
    private String manufactureEmail = "";
    private String manufacturePhone = "";
    private ProductStatus status;
    private HashMap<String, String> errors = new HashMap<>();

    public boolean isValid() {
        checkValidate();
        return errors.size() == 0;
    }

    private void checkValidate() {
        if (name == null || name.length() == 0) {
            errors.put("name", "Please enter name");
        }
        if (price == null || price.length() == 0) {
            errors.put("price", "Please enter price");
        }
        if (description == null || description.length() == 0) {
            errors.put("description", "Please enter description");
        }
        if (detail == null || detail.length() == 0) {
            errors.put("detail", "Please enter detail");
        }
        if (manufactureEmail == null || manufactureEmail.length() == 0) {
            errors.put("manufactureEmail", "Please enter manufacture email");
        }
        if (manufacturePhone == null || manufacturePhone.length() == 0) {
            errors.put("manufacturePhone", "Please enter manufacture phone");
        }

    }

    public Product(int id, String name, String description, String detail, String price, String thumbnail, String manufactureEmail, String manufacturePhone, int status) {
    }

    public Product(int id, String name, String description, String detail, Double price, String thumbnail, String manufactureEmail, String manufacturePhone, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt, int createdBy, int updatedBy, int deletedBy, ProductStatus status) {
    }
    public Product() {
        this.status = ProductStatus.ACTIVE;
    }

    public Product(int id, String name, String description, String detail, String price, String thumbnail, String manufactureEmail, String manufacturePhone, ProductStatus status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.detail = detail;
        this.price = price;
        this.thumbnail = thumbnail;
        this.manufactureEmail = manufactureEmail;
        this.manufacturePhone = manufacturePhone;
        this.status = status;
    }

    public Product(LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt, int createdBy, int updatedBy, int deletedBy, int id, String name, String description, String detail, String price, String thumbnail, String manufactureEmail, String manufacturePhone, ProductStatus status, HashMap<String, String> errors) {
        super(createdAt, updatedAt, deletedAt, createdBy, updatedBy, deletedBy);
        this.id = id;
        this.name = name;
        this.description = description;
        this.detail = detail;
        this.price = price;
        this.thumbnail = thumbnail;
        this.manufactureEmail = manufactureEmail;
        this.manufacturePhone = manufacturePhone;
        this.status = status;
        this.errors = errors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getManufactureEmail() {
        return manufactureEmail;
    }

    public void setManufactureEmail(String manufactureEmail) {
        this.manufactureEmail = manufactureEmail;
    }

    public String getManufacturePhone() {
        return manufacturePhone;
    }

    public void setManufacturePhone(String manufacturePhone) {
        this.manufacturePhone = manufacturePhone;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }

    public HashMap<String, String> getErrors() {
        return errors;
    }

    public void setErrors(HashMap<String, String> errors) {
        this.errors = errors;
    }




}
