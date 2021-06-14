package com.ruoyi.gs.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 股市操作记录对象 gs_czjl
 * 
 * @author xiekang
 * @date 2021-06-09
 */
public class GsCzjl extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer cid;

    /** 股票代码 */
    @Excel(name = "股票代码")
    private Integer dm;

    /** 股票名称 */
    @Excel(name = "股票名称")
    private String mc;

    /** 开多时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开多时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date kdsj;

    /** 开多价格 */
    @Excel(name = "开多价格")
    private Long kdjg;

    /** 平多时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "平多时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date pdsj;

    /** 平多价格 */
    @Excel(name = "平多价格")
    private Long pdjg;

    /** 盈利 */
    @Excel(name = "盈利")
    private Long yl;

    /** 持有时间 */
    @Excel(name = "持有时间")
    private Long cysj;

    /** 开多公式 */
    @Excel(name = "开多公式")
    private String kdgs;

    public void setCid(Integer cid) 
    {
        this.cid = cid;
    }

    public Integer getCid() 
    {
        return cid;
    }
    public void setDm(Integer dm) 
    {
        this.dm = dm;
    }

    public Integer getDm() 
    {
        return dm;
    }
    public void setMc(String mc) 
    {
        this.mc = mc;
    }

    public String getMc() 
    {
        return mc;
    }
    public void setKdsj(Date kdsj) 
    {
        this.kdsj = kdsj;
    }

    public Date getKdsj() 
    {
        return kdsj;
    }
    public void setKdjg(Long kdjg) 
    {
        this.kdjg = kdjg;
    }

    public Long getKdjg() 
    {
        return kdjg;
    }
    public void setPdsj(Date pdsj) 
    {
        this.pdsj = pdsj;
    }

    public Date getPdsj() 
    {
        return pdsj;
    }
    public void setPdjg(Long pdjg) 
    {
        this.pdjg = pdjg;
    }

    public Long getPdjg() 
    {
        return pdjg;
    }
    public void setYl(Long yl) 
    {
        this.yl = yl;
    }

    public Long getYl() 
    {
        return yl;
    }
    public void setCysj(Long cysj) 
    {
        this.cysj = cysj;
    }

    public Long getCysj() 
    {
        return cysj;
    }
    public void setKdgs(String kdgs) 
    {
        this.kdgs = kdgs;
    }

    public String getKdgs() 
    {
        return kdgs;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("cid", getCid())
            .append("dm", getDm())
            .append("mc", getMc())
            .append("kdsj", getKdsj())
            .append("kdjg", getKdjg())
            .append("pdsj", getPdsj())
            .append("pdjg", getPdjg())
            .append("yl", getYl())
            .append("cysj", getCysj())
            .append("kdgs", getKdgs())
            .toString();
    }
}
