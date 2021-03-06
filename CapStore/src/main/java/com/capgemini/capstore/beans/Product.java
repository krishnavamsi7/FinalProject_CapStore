package com.capgemini.capstore.beans;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product {

	@Id
	private int productId;
	private String productName;
	private String productDesc;
	@Embedded
	private Rating productRating;
	@OneToOne
	private Merchant productMerchant;
	private Date productAddDate;
	private Date productDelDate;
	@Embedded
	private Category productCategory;
	private double productPrice;
	private int productViews;
	@Embedded
	private Image productImage;
	@Embedded
	private Discount productDiscount;


	//Constructors
	public Product(int productId, String productName, String productDesc, Rating productRating,
			Merchant productMerchant, Date productAddDate, Date productDelDate, Category productCategory,
			double productPrice, int productViews, Image productImage, Discount productDiscount) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
		this.productRating = productRating;
		this.productMerchant = productMerchant;
		this.productAddDate = productAddDate;
		this.productDelDate = productDelDate;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
		this.productViews = productViews;
		this.productImage = productImage;
		this.productDiscount = productDiscount;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int productId) {
		super();
		this.productId = productId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public Rating getProductRating() {
		return productRating;
	}

	public void setProductRating(Rating productRating) {
		this.productRating = productRating;
	}

	public Merchant getProductMerchant() {
		return productMerchant;
	}

	public void setProductMerchant(Merchant productMerchant) {
		this.productMerchant = productMerchant;
	}

	public Date getProductAddDate() {
		return productAddDate;
	}

	public void setProductAddDate(Date productAddDate) {
		this.productAddDate = productAddDate;
	}

	public Date getProductDelDate() {
		return productDelDate;
	}

	public void setProductDelDate(Date productDelDate) {
		this.productDelDate = productDelDate;
	}

	public Category getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(Category productCategory) {
		this.productCategory = productCategory;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductViews() {
		return productViews;
	}

	public void setProductViews(int productViews) {
		this.productViews = productViews;
	}

	public Image getProductImage() {
		return productImage;
	}

	public void setProductImage(Image productImage) {
		this.productImage = productImage;
	}

	public Discount getProductDiscount() {
		return productDiscount;
	}

	public void setProductDiscount(Discount productDiscount) {
		this.productDiscount = productDiscount;
	}
	
	//Getters and Setters
	



}
