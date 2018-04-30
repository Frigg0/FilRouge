package fr.dta.formafond.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "product_gen", sequenceName = "product_gen", initialValue = 100, allocationSize = 1)
public class Product extends PrimeModel {

	@Id
	@GeneratedValue(generator = "product_gen")
	private Long id;

	private String name;
	private String type;
	private Integer price;

	@Enumerated(EnumType.STRING)
	private Category category;

	private Integer qty;
	private String src;
	private String descript;

	public Product(Long id, String name, String type, Integer price, Category category, Integer qty, String src,
			String descript) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
		this.category = category;
		this.qty = qty;
		this.src = src;
		this.descript = descript;
	}

	public Product() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + ", tag=" + category
				+ ", qty=" + qty + ", src=" + src + "]";
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

}