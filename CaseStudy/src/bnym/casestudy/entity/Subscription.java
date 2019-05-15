package bnym.casestudy.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.TableGenerator;

@Entity
public class Subscription {
	
	public enum BoxType{
		BOARDBOOKS(25.0,"Board Books - $25.0"),
		PICTUREBOOKS(30.0,"Picture Books - $30.0"),
		CHAPTERBOOKS(35.0,"Chapter Books - $35.0");
		
		private Double price;
		private String desc;
		
		BoxType(Double price, String desc){
			this.setPrice(price);
			this.setDesc(desc);
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Enumerated(EnumType.STRING)
	private BoxType boxtype;
	private String status;
	@OneToMany
	private List<Books> books;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BoxType getBoxtype() {
		return boxtype;
	}

	public void setBoxtype(BoxType boxtype) {
		this.boxtype = boxtype;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Books> getBooks() {
		return books;
	}

	public void setBooks(List<Books> books) {
		this.books = books;
	}
	
	

}
