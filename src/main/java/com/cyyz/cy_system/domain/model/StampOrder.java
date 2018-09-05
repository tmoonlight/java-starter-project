package com.cyyz.cy_system.domain.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sa_StampOrder")
public class StampOrder {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Guid_ID")
    private String guidId;

    @Column(name = "Code")
    private String code;

    @Column(name = "OrderType")
    private String ordertype;

    @Column(name = "StampUnit")
    private String stampunit;

    @Column(name = "cCusCode")
    private String ccuscode;

    @Column(name = "cLinkCode")
    private String clinkcode;

    @Column(name = "dDate")
    private Date ddate;

    @Column(name = "dPreDeliDate")
    private Date dpredelidate;

    @Column(name = "iTotalCost")
    private Double itotalcost;

    @Column(name = "IsInvoice")
    private Boolean isinvoice;

    @Column(name = "InvoiceID")
    private Integer invoiceid;

    @Column(name = "Status")
    private String status;

    @Column(name = "PrintCode")
    private String printcode;

    @Column(name = "IsDeli")
    private Boolean isdeli;

    @Column(name = "DeliDept")
    private String delidept;

    @Column(name = "LicenseNo")
    private String licenseno;

    @Column(name = "DeliAddress")
    private String deliaddress;

    @Column(name = "SourceCode")
    private String sourcecode;

    @Column(name = "iPrintCount")
    private Integer iprintcount;

    @Column(name = "Remark")
    private String remark;

    @Column(name = "CreatedBy")
    private String createdby;

    @Column(name = "cDepCode")
    private String cdepcode;

    @Column(name = "cTeamCode")
    private String cteamcode;

    @Column(name = "CreateDate")
    private Date createdate;

    @Column(name = "ModifiedBy")
    private String modifiedby;

    @Column(name = "ModifyDate")
    private Date modifydate;

    @Column(name = "isElectronic")
    private Boolean iselectronic;

    @Column(name = "VerificationCode")
    private String verificationcode;

    @Column(name = "CertificateCode")
    private String certificatecode;

    @Column(name = "ErrorReason")
    private String errorreason;

    @Column(name = "ChargeAmount")
    private Double chargeamount;

    @Column(name = "ZDWHZ")
    private String zdwhz;

    @Column(name = "LastAccessTime")
    private byte[] lastaccesstime;

    /**
     * @return ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return Guid_ID
     */
    public String getGuidId() {
        return guidId;
    }

    /**
     * @param guidId
     */
    public void setGuidId(String guidId) {
        this.guidId = guidId;
    }

    /**
     * @return Code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return OrderType
     */
    public String getOrdertype() {
        return ordertype;
    }

    /**
     * @param ordertype
     */
    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype;
    }

    /**
     * @return StampUnit
     */
    public String getStampunit() {
        return stampunit;
    }

    /**
     * @param stampunit
     */
    public void setStampunit(String stampunit) {
        this.stampunit = stampunit;
    }

    /**
     * @return cCusCode
     */
    public String getCcuscode() {
        return ccuscode;
    }

    /**
     * @param ccuscode
     */
    public void setCcuscode(String ccuscode) {
        this.ccuscode = ccuscode;
    }

    /**
     * @return cLinkCode
     */
    public String getClinkcode() {
        return clinkcode;
    }

    /**
     * @param clinkcode
     */
    public void setClinkcode(String clinkcode) {
        this.clinkcode = clinkcode;
    }

    /**
     * @return dDate
     */
    public Date getDdate() {
        return ddate;
    }

    /**
     * @param ddate
     */
    public void setDdate(Date ddate) {
        this.ddate = ddate;
    }

    /**
     * @return dPreDeliDate
     */
    public Date getDpredelidate() {
        return dpredelidate;
    }

    /**
     * @param dpredelidate
     */
    public void setDpredelidate(Date dpredelidate) {
        this.dpredelidate = dpredelidate;
    }

    /**
     * @return iTotalCost
     */
    public Double getItotalcost() {
        return itotalcost;
    }

    /**
     * @param itotalcost
     */
    public void setItotalcost(Double itotalcost) {
        this.itotalcost = itotalcost;
    }

    /**
     * @return IsInvoice
     */
    public Boolean getIsinvoice() {
        return isinvoice;
    }

    /**
     * @param isinvoice
     */
    public void setIsinvoice(Boolean isinvoice) {
        this.isinvoice = isinvoice;
    }

    /**
     * @return InvoiceID
     */
    public Integer getInvoiceid() {
        return invoiceid;
    }

    /**
     * @param invoiceid
     */
    public void setInvoiceid(Integer invoiceid) {
        this.invoiceid = invoiceid;
    }

    /**
     * @return Status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return PrintCode
     */
    public String getPrintcode() {
        return printcode;
    }

    /**
     * @param printcode
     */
    public void setPrintcode(String printcode) {
        this.printcode = printcode;
    }

    /**
     * @return IsDeli
     */
    public Boolean getIsdeli() {
        return isdeli;
    }

    /**
     * @param isdeli
     */
    public void setIsdeli(Boolean isdeli) {
        this.isdeli = isdeli;
    }

    /**
     * @return DeliDept
     */
    public String getDelidept() {
        return delidept;
    }

    /**
     * @param delidept
     */
    public void setDelidept(String delidept) {
        this.delidept = delidept;
    }

    /**
     * @return LicenseNo
     */
    public String getLicenseno() {
        return licenseno;
    }

    /**
     * @param licenseno
     */
    public void setLicenseno(String licenseno) {
        this.licenseno = licenseno;
    }

    /**
     * @return DeliAddress
     */
    public String getDeliaddress() {
        return deliaddress;
    }

    /**
     * @param deliaddress
     */
    public void setDeliaddress(String deliaddress) {
        this.deliaddress = deliaddress;
    }

    /**
     * @return SourceCode
     */
    public String getSourcecode() {
        return sourcecode;
    }

    /**
     * @param sourcecode
     */
    public void setSourcecode(String sourcecode) {
        this.sourcecode = sourcecode;
    }

    /**
     * @return iPrintCount
     */
    public Integer getIprintcount() {
        return iprintcount;
    }

    /**
     * @param iprintcount
     */
    public void setIprintcount(Integer iprintcount) {
        this.iprintcount = iprintcount;
    }

    /**
     * @return Remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return CreatedBy
     */
    public String getCreatedby() {
        return createdby;
    }

    /**
     * @param createdby
     */
    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    /**
     * @return cDepCode
     */
    public String getCdepcode() {
        return cdepcode;
    }

    /**
     * @param cdepcode
     */
    public void setCdepcode(String cdepcode) {
        this.cdepcode = cdepcode;
    }

    /**
     * @return cTeamCode
     */
    public String getCteamcode() {
        return cteamcode;
    }

    /**
     * @param cteamcode
     */
    public void setCteamcode(String cteamcode) {
        this.cteamcode = cteamcode;
    }

    /**
     * @return CreateDate
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * @param createdate
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * @return ModifiedBy
     */
    public String getModifiedby() {
        return modifiedby;
    }

    /**
     * @param modifiedby
     */
    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }

    /**
     * @return ModifyDate
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * @param modifydate
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * @return isElectronic
     */
    public Boolean getIselectronic() {
        return iselectronic;
    }

    /**
     * @param iselectronic
     */
    public void setIselectronic(Boolean iselectronic) {
        this.iselectronic = iselectronic;
    }

    /**
     * @return VerificationCode
     */
    public String getVerificationcode() {
        return verificationcode;
    }

    /**
     * @param verificationcode
     */
    public void setVerificationcode(String verificationcode) {
        this.verificationcode = verificationcode;
    }

    /**
     * @return CertificateCode
     */
    public String getCertificatecode() {
        return certificatecode;
    }

    /**
     * @param certificatecode
     */
    public void setCertificatecode(String certificatecode) {
        this.certificatecode = certificatecode;
    }

    /**
     * @return ErrorReason
     */
    public String getErrorreason() {
        return errorreason;
    }

    /**
     * @param errorreason
     */
    public void setErrorreason(String errorreason) {
        this.errorreason = errorreason;
    }

    /**
     * @return ChargeAmount
     */
    public Double getChargeamount() {
        return chargeamount;
    }

    /**
     * @param chargeamount
     */
    public void setChargeamount(Double chargeamount) {
        this.chargeamount = chargeamount;
    }

    /**
     * @return ZDWHZ
     */
    public String getZdwhz() {
        return zdwhz;
    }

    /**
     * @param zdwhz
     */
    public void setZdwhz(String zdwhz) {
        this.zdwhz = zdwhz;
    }

    /**
     * @return LastAccessTime
     */
    public byte[] getLastaccesstime() {
        return lastaccesstime;
    }

    /**
     * @param lastaccesstime
     */
    public void setLastaccesstime(byte[] lastaccesstime) {
        this.lastaccesstime = lastaccesstime;
    }
}