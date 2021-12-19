package com.library;
import java.time.LocalDate;

public class BookLibrary {
	private String bTitle;
	private double price;
	private LocalDate publishDate;
	private String authorName;
	private int quantity;
	private Category bookCat;
	
	
	public BookLibrary(String title, double price, LocalDate publishDate, String authorName, int quantity,
			Category bookCat) {
		super();
		this.bTitle = title;
		this.price = price;
		this.publishDate = publishDate;
		this.authorName = authorName;
		this.quantity = quantity;
		this.bookCat = bookCat;
	}


	@Override
	public String toString() {
		return "BookLibrary [title=" + bTitle + ", price=" + price + ", publishDate=" + publishDate + ", authorName="
				+ authorName + ", quantity=" + quantity + ", bookCat=" + bookCat + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		System.out.println("In equals");
		if(o instanceof BookLibrary) {
			return this.bTitle==((BookLibrary)o).bTitle;
		}
		return false;
	}
	
	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int q) {
		int qua = this.quantity;
		this.quantity = (qua + q);
	}


	public String getbTitle() {
		return bTitle;
	}


	@Override
	public int hashCode() {
		System.out.println("In hashCode");
		final int prime = 31;
		return prime*bTitle.hashCode();
	}
}
