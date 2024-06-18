package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // table
@Table(name = "boo_tbl") //
public class BookEntity {
	@Id
	@GeneratedValue

	private int bookId; // pk +auto generated @Column(name="empId")
	private String bookName;
	private int price;

	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookEntity(int bookId, String bookName, int price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;

	}

	@Id // primary key
	//@GeneratedValue(strategy = GenerationType.AUTO)

	public int getbookId() {
		return bookId;
	}

	public void setbookId(int bookId) {
		this.bookId = bookId;
	}

	public String getbookName() {
		return bookName;
	}

	public void setbookName(String bookName) {
		this.bookName = bookName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "bookEntity [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + "]";
	}

}
