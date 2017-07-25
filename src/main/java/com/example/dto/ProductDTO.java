package com.example.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.sql.Timestamp;

/**
 * Created by zhang on 2017/7/8.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDTO {
    private Integer pid; //产品id
    private String title; //标题
    private String image;//图片
    private Float price;//价格
    private Integer isBuy;//当前用户是否已经购买
    private Integer isSell;//是否已经卖出
    private String summary;//摘要
    private String detail;//全文
    private Float buyPrice;//购买时的价格
    private Integer buyNum;//购买数量
    private Timestamp buyTime;//购买时间13位时间戳
    private Integer sellNum;//销售数量

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Integer getIsBuy() {
        return isBuy;
    }

    public void setIsBuy(Integer isBuy) {
        this.isBuy = isBuy;
    }

    public Integer getIsSell() {
        return isSell;
    }

    public void setIsSell(Integer isSell) {
        this.isSell = isSell;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Float getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Float buyPrice) {
        this.buyPrice = buyPrice;
    }




    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public Integer getSellNum() {
        return sellNum;
    }

    public void setSellNum(Integer sellNum) {
        this.sellNum = sellNum;
    }

    public Timestamp getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Timestamp buyTime) {
        this.buyTime = buyTime;
    }

    @Override
    public String toString() {
        return "ProductDO{" +
                "pid=" + pid +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                ", isBuy=" + isBuy +
                ", isSell=" + isSell +
                ", summary='" + summary + '\'' +
                ", detail='" + detail + '\'' +
                ", buyPrice=" + buyPrice +
                ", buyNum=" + buyNum +
                ", sellNum=" + sellNum +
                '}';
    }
}
