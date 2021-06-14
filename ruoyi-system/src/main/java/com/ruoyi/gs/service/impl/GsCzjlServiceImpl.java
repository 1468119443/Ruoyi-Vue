package com.ruoyi.gs.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.gs.mapper.GsCzjlMapper;
import com.ruoyi.gs.domain.GsCzjl;
import com.ruoyi.gs.service.IGsCzjlService;

/**
 * 股市操作记录Service业务层处理
 * 
 * @author xiekang
 * @date 2021-06-09
 */
@Service
public class GsCzjlServiceImpl implements IGsCzjlService 
{
    @Autowired
    private GsCzjlMapper gsCzjlMapper;

    /**
     * 查询股市操作记录
     * 
     * @param cid 股市操作记录ID
     * @return 股市操作记录
     */
    @Override
    public GsCzjl selectGsCzjlById(Integer cid)
    {
        return gsCzjlMapper.selectGsCzjlById(cid);
    }

    /**
     * 查询股市操作记录列表
     * 
     * @param gsCzjl 股市操作记录
     * @return 股市操作记录
     */
    @Override
    public List<GsCzjl> selectGsCzjlList(GsCzjl gsCzjl)
    {
        return gsCzjlMapper.selectGsCzjlList(gsCzjl);
    }

    /**
     * 新增股市操作记录
     * 
     * @param gsCzjl 股市操作记录
     * @return 结果
     */
    @Override
    public int insertGsCzjl(GsCzjl gsCzjl)
    {
        return gsCzjlMapper.insertGsCzjl(gsCzjl);
    }

    /**
     * 修改股市操作记录
     * 
     * @param gsCzjl 股市操作记录
     * @return 结果
     */
    @Override
    public int updateGsCzjl(GsCzjl gsCzjl)
    {
        return gsCzjlMapper.updateGsCzjl(gsCzjl);
    }

    /**
     * 批量删除股市操作记录
     * 
     * @param cids 需要删除的股市操作记录ID
     * @return 结果
     */
    @Override
    public int deleteGsCzjlByIds(Integer[] cids)
    {
        return gsCzjlMapper.deleteGsCzjlByIds(cids);
    }

    /**
     * 删除股市操作记录信息
     * 
     * @param cid 股市操作记录ID
     * @return 结果
     */
    @Override
    public int deleteGsCzjlById(Integer cid)
    {
        return gsCzjlMapper.deleteGsCzjlById(cid);
    }
}
