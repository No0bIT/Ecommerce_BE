package com.example.Ecommerce_BE.model.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;


@Entity
@Data
@Table(name = "feedback")
public class FeedBack {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String comment;
	private int star;
	private LocalDateTime created;
	
	@ElementCollection
	@CollectionTable(name = "link_mages_feedback")
	private List<String> linkImage;
	
	@ManyToOne
	@JsonManagedReference
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "product_id")
	private Product product;
	
	@OneToOne
	@JsonBackReference
	@JoinColumn(name = "cart_id")
	private Cart cart ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public List<String> getLinkImage() {
		return linkImage;
	}

	public void setLinkImage(List<String> linkImage) {
		this.linkImage = linkImage;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}
	

	
}
