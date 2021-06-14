package com.ruoyi.gs.mapper;

import java.util.List;
import com.ruoyi.gs.domain.GsCzjl;

/**
 * 股市操作记录Mapper接口
 * 
 * @author xiekang
 * @date 2021-06-09
 */
public interface GsCzjlMapper 
{
    /**
     * 查询股市操作记录
     * 
     * @param cid 股市操作记录ID
     * @return 股市操作记录
     */
    public GsCzjl selectGsCzjlById(Integer cid);

    /**
     * 查询股市操作记录列表
     * 
     * @param gsCzjl 股市操作记录
     * @return 股市操作记录集合
     */
    public List<GsCzjl> selectGsCzjlList(GsCzjl gsCzjl);

    /**
     * 新增股市操作记录
     * 
     * @param gsCzjl 股市操作记录
     * @return 结果
     */
    public int insertGsCzjl(GsCzjl gsCzjl);

    /**
     * 修改股市操作记录
     * 
     * @param gsCzjl 股市操作记录
     * @return 结果
     */
    public int updateGsCzjl(GsCzjl gsCzjl);

    /**
     * 删除股市操作记录
     * 
     * @param cid 股市操作记录ID
     * @return 结果
     */
    public int deleteGsCzjlById(Integer cid);

    /**
     * 批量删除股市操作记录
     * 
     * @param cids 需要删除的数据ID
     * @return 结果
     */
    public int deleteGsCzjlByIds(Integer[] cids);
}
