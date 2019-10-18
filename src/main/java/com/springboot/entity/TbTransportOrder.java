package com.springboot.entity;

import java.util.Date;

public class TbTransportOrder {
    private Long ttoId;

    private Long ttoTaskId;

    private String ttoNumber;

    private Long ttoDriverId;

    private Double ttoTransportFromWeight;

    private Double ttoTransportWeight;

    private Double ttoTransportPrice;

    private Integer ttoReceiptType;

    private Date ttoReceiptDate;

    private String ttoReceiptImage;

    private Date ttoReceiptImageUploadTime;

    private Integer ttoStatus;

    private Integer ttoRefuseStatus;

    private String ttoRefuseDesc;

    private Date ttoAddDate;

    private String ttoRejectDesc;

    private Double ttoOilPrice;

    private Double ttoGasPrice;

    private Double ttoOvertakeOrStandardPrice;

    private Double ttoRoadTollPrice;

    private Double ttoOtherPrice;

    private Double ttoTotalNonFixedPrice;

    private Double ttoLossPrice;

    private Double ttoDiscountPrice;

    private Double ttoTotalFixedPrice;

    private Double ttoGoodsTotalPrice;

    private String ttoCancelReason;

    private String ttoPayBankNum;

    private Integer ttoPayBankStatus;

    private String ttoPayBankDesp;

    private Date ttoExamineDate;

    public Long getTtoId() {
        return ttoId;
    }

    public void setTtoId(Long ttoId) {
        this.ttoId = ttoId;
    }

    public Long getTtoTaskId() {
        return ttoTaskId;
    }

    public void setTtoTaskId(Long ttoTaskId) {
        this.ttoTaskId = ttoTaskId;
    }

    public String getTtoNumber() {
        return ttoNumber;
    }

    public void setTtoNumber(String ttoNumber) {
        this.ttoNumber = ttoNumber;
    }

    public Long getTtoDriverId() {
        return ttoDriverId;
    }

    public void setTtoDriverId(Long ttoDriverId) {
        this.ttoDriverId = ttoDriverId;
    }

    public Double getTtoTransportFromWeight() {
        return ttoTransportFromWeight;
    }

    public void setTtoTransportFromWeight(Double ttoTransportFromWeight) {
        this.ttoTransportFromWeight = ttoTransportFromWeight;
    }

    public Double getTtoTransportWeight() {
        return ttoTransportWeight;
    }

    public void setTtoTransportWeight(Double ttoTransportWeight) {
        this.ttoTransportWeight = ttoTransportWeight;
    }

    public Double getTtoTransportPrice() {
        return ttoTransportPrice;
    }

    public void setTtoTransportPrice(Double ttoTransportPrice) {
        this.ttoTransportPrice = ttoTransportPrice;
    }

    public Integer getTtoReceiptType() {
        return ttoReceiptType;
    }

    public void setTtoReceiptType(Integer ttoReceiptType) {
        this.ttoReceiptType = ttoReceiptType;
    }

    public Date getTtoReceiptDate() {
        return ttoReceiptDate;
    }

    public void setTtoReceiptDate(Date ttoReceiptDate) {
        this.ttoReceiptDate = ttoReceiptDate;
    }

    public String getTtoReceiptImage() {
        return ttoReceiptImage;
    }

    public void setTtoReceiptImage(String ttoReceiptImage) {
        this.ttoReceiptImage = ttoReceiptImage;
    }

    public Date getTtoReceiptImageUploadTime() {
        return ttoReceiptImageUploadTime;
    }

    public void setTtoReceiptImageUploadTime(Date ttoReceiptImageUploadTime) {
        this.ttoReceiptImageUploadTime = ttoReceiptImageUploadTime;
    }

    public Integer getTtoStatus() {
        return ttoStatus;
    }

    public void setTtoStatus(Integer ttoStatus) {
        this.ttoStatus = ttoStatus;
    }

    public Integer getTtoRefuseStatus() {
        return ttoRefuseStatus;
    }

    public void setTtoRefuseStatus(Integer ttoRefuseStatus) {
        this.ttoRefuseStatus = ttoRefuseStatus;
    }

    public String getTtoRefuseDesc() {
        return ttoRefuseDesc;
    }

    public void setTtoRefuseDesc(String ttoRefuseDesc) {
        this.ttoRefuseDesc = ttoRefuseDesc;
    }

    public Date getTtoAddDate() {
        return ttoAddDate;
    }

    public void setTtoAddDate(Date ttoAddDate) {
        this.ttoAddDate = ttoAddDate;
    }

    public String getTtoRejectDesc() {
        return ttoRejectDesc;
    }

    public void setTtoRejectDesc(String ttoRejectDesc) {
        this.ttoRejectDesc = ttoRejectDesc;
    }

    public Double getTtoOilPrice() {
        return ttoOilPrice;
    }

    public void setTtoOilPrice(Double ttoOilPrice) {
        this.ttoOilPrice = ttoOilPrice;
    }

    public Double getTtoGasPrice() {
        return ttoGasPrice;
    }

    public void setTtoGasPrice(Double ttoGasPrice) {
        this.ttoGasPrice = ttoGasPrice;
    }

    public Double getTtoOvertakeOrStandardPrice() {
        return ttoOvertakeOrStandardPrice;
    }

    public void setTtoOvertakeOrStandardPrice(Double ttoOvertakeOrStandardPrice) {
        this.ttoOvertakeOrStandardPrice = ttoOvertakeOrStandardPrice;
    }

    public Double getTtoRoadTollPrice() {
        return ttoRoadTollPrice;
    }

    public void setTtoRoadTollPrice(Double ttoRoadTollPrice) {
        this.ttoRoadTollPrice = ttoRoadTollPrice;
    }

    public Double getTtoOtherPrice() {
        return ttoOtherPrice;
    }

    public void setTtoOtherPrice(Double ttoOtherPrice) {
        this.ttoOtherPrice = ttoOtherPrice;
    }

    public Double getTtoTotalNonFixedPrice() {
        return ttoTotalNonFixedPrice;
    }

    public void setTtoTotalNonFixedPrice(Double ttoTotalNonFixedPrice) {
        this.ttoTotalNonFixedPrice = ttoTotalNonFixedPrice;
    }

    public Double getTtoLossPrice() {
        return ttoLossPrice;
    }

    public void setTtoLossPrice(Double ttoLossPrice) {
        this.ttoLossPrice = ttoLossPrice;
    }

    public Double getTtoDiscountPrice() {
        return ttoDiscountPrice;
    }

    public void setTtoDiscountPrice(Double ttoDiscountPrice) {
        this.ttoDiscountPrice = ttoDiscountPrice;
    }

    public Double getTtoTotalFixedPrice() {
        return ttoTotalFixedPrice;
    }

    public void setTtoTotalFixedPrice(Double ttoTotalFixedPrice) {
        this.ttoTotalFixedPrice = ttoTotalFixedPrice;
    }

    public Double getTtoGoodsTotalPrice() {
        return ttoGoodsTotalPrice;
    }

    public void setTtoGoodsTotalPrice(Double ttoGoodsTotalPrice) {
        this.ttoGoodsTotalPrice = ttoGoodsTotalPrice;
    }

    public String getTtoCancelReason() {
        return ttoCancelReason;
    }

    public void setTtoCancelReason(String ttoCancelReason) {
        this.ttoCancelReason = ttoCancelReason;
    }

    public String getTtoPayBankNum() {
        return ttoPayBankNum;
    }

    public void setTtoPayBankNum(String ttoPayBankNum) {
        this.ttoPayBankNum = ttoPayBankNum;
    }

    public Integer getTtoPayBankStatus() {
        return ttoPayBankStatus;
    }

    public void setTtoPayBankStatus(Integer ttoPayBankStatus) {
        this.ttoPayBankStatus = ttoPayBankStatus;
    }

    public String getTtoPayBankDesp() {
        return ttoPayBankDesp;
    }

    public void setTtoPayBankDesp(String ttoPayBankDesp) {
        this.ttoPayBankDesp = ttoPayBankDesp;
    }

    public Date getTtoExamineDate() {
        return ttoExamineDate;
    }

    public void setTtoExamineDate(Date ttoExamineDate) {
        this.ttoExamineDate = ttoExamineDate;
    }
}