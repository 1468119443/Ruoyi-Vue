package com.ruoyi.web.controller.gs;

import java.util.List;

import com.ruoyi.gs.domain.GsCzjl;
import com.ruoyi.gs.service.IGsCzjlService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 股市操作记录Controller
 * 
 * @author xiekang
 * @date 2021-06-09
 */
@RestController
@RequestMapping("/gs/czjl")
public class GsCzjlController extends BaseController
{
    @Autowired
    private IGsCzjlService gsCzjlService;

    /**
     * 查询股市操作记录列表
     */
    @PreAuthorize("@ss.hasPermi('gs:czjl:list')")
    @GetMapping("/list")
    public TableDataInfo list(GsCzjl gsCzjl)
    {
        startPage();
        List<GsCzjl> list = gsCzjlService.selectGsCzjlList(gsCzjl);
        return getDataTable(list);
    }

    /**
     * 导出股市操作记录列表
     */
    @PreAuthorize("@ss.hasPermi('gs:czjl:export')")
    @Log(title = "股市操作记录", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(GsCzjl gsCzjl)
    {
        List<GsCzjl> list = gsCzjlService.selectGsCzjlList(gsCzjl);
        ExcelUtil<GsCzjl> util = new ExcelUtil<GsCzjl>(GsCzjl.class);
        return util.exportExcel(list, "股市操作记录数据");
    }

    /**
     * 获取股市操作记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('gs:czjl:query')")
    @GetMapping(value = "/{cid}")
    public AjaxResult getInfo(@PathVariable("cid") Integer cid)
    {
        return AjaxResult.success(gsCzjlService.selectGsCzjlById(cid));
    }

    /**
     * 新增股市操作记录
     */
    @PreAuthorize("@ss.hasPermi('gs:czjl:add')")
    @Log(title = "股市操作记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody GsCzjl gsCzjl)
    {
        return toAjax(gsCzjlService.insertGsCzjl(gsCzjl));
    }

    /**
     * 修改股市操作记录
     */
    @PreAuthorize("@ss.hasPermi('gs:czjl:edit')")
    @Log(title = "股市操作记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody GsCzjl gsCzjl)
    {
        return toAjax(gsCzjlService.updateGsCzjl(gsCzjl));
    }

    /**
     * 删除股市操作记录
     */
    @PreAuthorize("@ss.hasPermi('gs:czjl:remove')")
    @Log(title = "股市操作记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{cids}")
    public AjaxResult remove(@PathVariable Integer[] cids)
    {
        return toAjax(gsCzjlService.deleteGsCzjlByIds(cids));
    }
}
