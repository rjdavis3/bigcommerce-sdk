package com.bigcommerce.catalog.models;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {

	private Integer id;
	private String name;
	private String type;
	private String sku;
	private String mpn;
	private String gtin;
	private String description;
	private List<Variant> variants = new LinkedList<>();
	private BigDecimal weight;
	private BigDecimal width;
	private BigDecimal height;
	private BigDecimal depth;

	@XmlElement(name = "is_visible")
	private Boolean isVisible;
	private List<Integer> categories;

	@XmlElement(name = "brand_id")
	private Integer brandId;

	@XmlElement(name = "is_condition_shown")
	private Boolean isConditionShown;

	@XmlElement(name = "meta_keywords")
	private List<String> metaKeywords = new LinkedList<>();

	@XmlElement(name = "search_keywords ")
	private String searchKeywords;

	@XmlElement(name = "inventory_tracking")
	private String inventoryTracking;
	private String condition;
	private BigDecimal price;

	@XmlElement(name = "page_title")
	private String pageTitle;

	@XmlElement(name = "meta_description")
	private String metaDescription;

	@XmlElement(name = "custom_fields")
	private List<CustomField> customFields = new LinkedList<>();

	@XmlElement(name = "sort_order")
	private Integer sortOrder;

	@XmlElement(name = "custom_url")
	private CustomUrl productUrl;

	@XmlElement(name = "cost_price")
	private BigDecimal costPrice;

	@XmlElement(name = "retail_price")
	private BigDecimal retailPrice;

	@XmlElement(name = "sale_price")
	private BigDecimal salePrice;

	public Integer getId() {
		return id;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(final String type) {
		this.type = type;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(final String sku) {
		this.sku = sku;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public List<Variant> getVariants() {
		return variants;
	}

	public void setVariants(final List<Variant> variants) {
		this.variants = variants;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(final BigDecimal weight) {
		this.weight = weight;
	}

	public Boolean getIsVisible() {
		return isVisible;
	}

	public void setIsVisible(final Boolean isVisible) {
		this.isVisible = isVisible;
	}

	public List<Integer> getCategories() {
		return categories;
	}

	public void setCategories(final List<Integer> categories) {
		this.categories = categories;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(final Integer brandId) {
		this.brandId = brandId;
	}

	public Boolean getIsConditionShown() {
		return isConditionShown;
	}

	public void setIsConditionShown(final Boolean isConditionShown) {
		this.isConditionShown = isConditionShown;
	}

	public List<String> getMetaKeywords() {
		return metaKeywords;
	}

	public void setMetaKeywords(final List<String> metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	public List<CustomField> getCustomFields() {
		return customFields;
	}

	public void setCustomFields(final List<CustomField> customFields) {
		this.customFields = customFields;
	}

	public String getInventoryTracking() {
		return inventoryTracking;
	}

	public void setInventoryTracking(final String inventoryTracking) {
		this.inventoryTracking = inventoryTracking;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(final String condition) {
		this.condition = condition;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(final BigDecimal price) {
		this.price = price;
	}

	public Integer getSortOrder() {
		return sortOrder;
	}

	public String getSearchKeywords() {
		return searchKeywords;
	}

	public void setSearchKeywords(final String searchKeywords) {
		this.searchKeywords = searchKeywords;
	}

	public void setSortOrder(final Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public CustomUrl getProductUrl() {
		return productUrl;
	}

	public void setProductUrl(final CustomUrl productUrl) {
		this.productUrl = productUrl;
	}

	public Boolean getVisible() {
		return isVisible;
	}

	public void setVisible(final Boolean visible) {
		isVisible = visible;
	}

	public Boolean getConditionShown() {
		return isConditionShown;
	}

	public void setConditionShown(final Boolean conditionShown) {
		isConditionShown = conditionShown;
	}

	public String getPageTitle() {
		return pageTitle;
	}

	public void setPageTitle(final String pageTitle) {
		this.pageTitle = pageTitle;
	}

	public String getMetaDescription() {
		return metaDescription;
	}

	public void setMetaDescription(final String metaDescription) {
		this.metaDescription = metaDescription;
	}

	public BigDecimal getWidth() {
		return width;
	}

	public void setWidth(final BigDecimal width) {
		this.width = width;
	}

	public BigDecimal getHeight() {
		return height;
	}

	public void setHeight(final BigDecimal height) {
		this.height = height;
	}

	public BigDecimal getDepth() {
		return depth;
	}

	public void setDepth(final BigDecimal depth) {
		this.depth = depth;
	}

	public String getMpn() {
		return mpn;
	}

	public void setMpn(final String mpn) {
		this.mpn = mpn;
	}

	public String getGtin() {
		return gtin;
	}

	public void setGtin(final String gtin) {
		this.gtin = gtin;
	}

	public BigDecimal getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(final BigDecimal costPrice) {
		this.costPrice = costPrice;
	}

	public BigDecimal getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(final BigDecimal retailPrice) {
		this.retailPrice = retailPrice;
	}

	public BigDecimal getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(final BigDecimal salePrice) {
		this.salePrice = salePrice;
	}
}
