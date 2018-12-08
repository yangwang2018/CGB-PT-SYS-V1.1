package com.pt.common.vo;

import java.util.List;

public class PageObject<T> {
	/**
	 * 当前页码值
	 */
	private Integer pageCurrent=1;
	
	/**
	 * 当前页面大小
	 */
	private Integer pageSize=3;
	
	/**
	 * 总行数
	 */
	private Integer rowCount;
	
	/**
	 * 总页面数。通过计算获得
	 */
	private Integer pageCount=0;
	
	/**
	 * 封装当前页的数据记录
	 */
	private List<T> records;

	public Integer getPageCurrent() {
		return pageCurrent;
	}

	public void setPageCurrent(Integer pageCurrent) {
		this.pageCurrent = pageCurrent;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getRowCount() {
		return rowCount;
	}

	public void setRowCount(Integer rowCount) {
		this.rowCount = rowCount;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public List<T> getRecords() {
		return records;
	}

	public void setRecords(List<T> records) {
		this.records = records;
	}

	@Override
	public String toString() {
		return "PageObject [pageCurrent=" + pageCurrent + ", pageSize=" + pageSize + ", rowCount=" + rowCount
				+ ", pageCount=" + pageCount + ", records=" + records + "]";
	}
	
}
