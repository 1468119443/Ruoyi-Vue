import request from '@/utils/request'

// 查询股市操作记录列表
export function listCzjl(query) {
  return request({
    url: '/gs/czjl/list',
    method: 'get',
    params: query
  })
}

// 查询股市操作记录详细
export function getCzjl(cid) {
  return request({
    url: '/gs/czjl/' + cid,
    method: 'get'
  })
}

// 新增股市操作记录
export function addCzjl(data) {
  return request({
    url: '/gs/czjl',
    method: 'post',
    data: data
  })
}

// 修改股市操作记录
export function updateCzjl(data) {
  return request({
    url: '/gs/czjl',
    method: 'put',
    data: data
  })
}

// 删除股市操作记录
export function delCzjl(cid) {
  return request({
    url: '/gs/czjl/' + cid,
    method: 'delete'
  })
}

// 导出股市操作记录
export function exportCzjl(query) {
  return request({
    url: '/gs/czjl/export',
    method: 'get',
    params: query
  })
}