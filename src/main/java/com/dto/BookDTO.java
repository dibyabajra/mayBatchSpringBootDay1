package com.dto;

public class BookDTO {
	int bookId;
	String bookName;
	int price;
	public BookDTO() {
		super();
	}
	public BookDTO(int bookId, String bookName, int price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
		
	}
	public int getbookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getbookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int price() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "BookDTO [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price+"]";
	}
	
	
	
	
	
	
	
}
