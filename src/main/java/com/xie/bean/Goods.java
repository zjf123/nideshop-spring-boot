package com.xie.bean;

import java.io.Serializable;

public class Goods implements Serializable {
    private Integer id;

    private Integer categoryId;

    private String goodsSn;

    private String name;

    private Integer brandId;

    private Integer goodsNumber;

    private String keywords;

    private String goodsBrief;

    private Integer isOnSale;

    private Integer addTime;

    private Short sortOrder;

    private Integer isDelete;

    private Integer attributeCategory;

    /**
     * 专柜价格
     */
    private Double counterPrice;

    /**
     * 附加价格
     */
    private Double extraPrice;

    private Integer isNew;

    /**
     * 商品单位
     */
    private String goodsUnit;

    /**
     * 商品主图
     */
    private String primaryPicUrl;

    /**
     * 商品列表图
     */
    private String listPicUrl;

    /**
     * 零售价格
     */
    private Double retailPrice;

    /**
     * 销售量
     */
    private Integer sellVolume;

    /**
     * 主sku　product_id
     */
    private Integer primaryProductId;

    /**
     * 单位价格，单价
     */
    private Double unitPrice;

    private String promotionDesc;

    private String promotionTag;

    /**
     * APP专享价
     */
    private Double appExclusivePrice;

    /**
     * 是否是APP专属
     */
    private Integer isAppExclusive;

    private Integer isLimited;

    private Integer isHot;

    private String goodsDesc;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getGoodsBrief() {
        return goodsBrief;
    }

    public void setGoodsBrief(String goodsBrief) {
        this.goodsBrief = goodsBrief;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public Short getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Short sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Integer getIsOnSale() {
        return isOnSale;
    }

    public void setIsOnSale(Integer isOnSale) {
        this.isOnSale = isOnSale;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getIsNew() {
        return isNew;
    }

    public void setIsNew(Integer isNew) {
        this.isNew = isNew;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Integer getIsAppExclusive() {
        return isAppExclusive;
    }

    public void setIsAppExclusive(Integer isAppExclusive) {
        this.isAppExclusive = isAppExclusive;
    }

    public Integer getIsLimited() {
        return isLimited;
    }

    public void setIsLimited(Integer isLimited) {
        this.isLimited = isLimited;
    }

    public Integer getIsHot() {
        return isHot;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    public Integer getAttributeCategory() {
        return attributeCategory;
    }

    public void setAttributeCategory(Integer attributeCategory) {
        this.attributeCategory = attributeCategory;
    }

    public double getCounterPrice() {
        return counterPrice;
    }

    public void setCounterPrice(double counterPrice) {
        this.counterPrice = counterPrice;
    }

    public double getExtraPrice() {
        return extraPrice;
    }

    public void setExtraPrice(double extraPrice) {
        this.extraPrice = extraPrice;
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
    }

    public String getPrimaryPicUrl() {
        return primaryPicUrl;
    }

    public void setPrimaryPicUrl(String primaryPicUrl) {
        this.primaryPicUrl = primaryPicUrl;
    }

    public String getListPicUrl() {
        return listPicUrl;
    }

    public void setListPicUrl(String listPicUrl) {
        this.listPicUrl = listPicUrl;
    }


    public Integer getSellVolume() {
        return sellVolume;
    }

    public void setSellVolume(Integer sellVolume) {
        this.sellVolume = sellVolume;
    }

    public Integer getPrimaryProductId() {
        return primaryProductId;
    }

    public void setPrimaryProductId(Integer primaryProductId) {
        this.primaryProductId = primaryProductId;
    }


    public String getPromotionDesc() {
        return promotionDesc;
    }

    public void setPromotionDesc(String promotionDesc) {
        this.promotionDesc = promotionDesc;
    }

    public String getPromotionTag() {
        return promotionTag;
    }

    public void setPromotionTag(String promotionTag) {
        this.promotionTag = promotionTag;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getAppExclusivePrice() {
        return appExclusivePrice;
    }

    public void setAppExclusivePrice(double appExclusivePrice) {
        this.appExclusivePrice = appExclusivePrice;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", goodsSn=").append(goodsSn);
        sb.append(", name=").append(name);
        sb.append(", brandId=").append(brandId);
        sb.append(", goodsNumber=").append(goodsNumber);
        sb.append(", keywords=").append(keywords);
        sb.append(", goodsBrief=").append(goodsBrief);
        sb.append(", isOnSale=").append(isOnSale);
        sb.append(", addTime=").append(addTime);
        sb.append(", sortOrder=").append(sortOrder);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", attributeCategory=").append(attributeCategory);
        sb.append(", counterPrice=").append(counterPrice);
        sb.append(", extraPrice=").append(extraPrice);
        sb.append(", isNew=").append(isNew);
        sb.append(", goodsUnit=").append(goodsUnit);
        sb.append(", primaryPicUrl=").append(primaryPicUrl);
        sb.append(", listPicUrl=").append(listPicUrl);
        sb.append(", retailPrice=").append(retailPrice);
        sb.append(", sellVolume=").append(sellVolume);
        sb.append(", primaryProductId=").append(primaryProductId);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", promotionDesc=").append(promotionDesc);
        sb.append(", promotionTag=").append(promotionTag);
        sb.append(", appExclusivePrice=").append(appExclusivePrice);
        sb.append(", isAppExclusive=").append(isAppExclusive);
        sb.append(", isLimited=").append(isLimited);
        sb.append(", isHot=").append(isHot);
        sb.append(", goodsDesc=").append(goodsDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}