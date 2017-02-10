package indi.core.action;

import indi.core.page.PageResult;

import com.opensymphony.xwork2.ActionSupport;

public abstract class BaseAction extends ActionSupport {
	//listUI页面批量删除的选项，用于做批量删除，存储要删除的id数组
	protected String[] selectedRow;
	public void setSelectedRow(String[] selectedRow) {
		this.selectedRow = selectedRow;
	}
	public String[] getSelectedRow() {
		return selectedRow;
	}
	
	
	
	//分页对象
	protected PageResult pageResult;
	private int pageNow;
	private int pageSize;
	//默认分页时每页的记录数
	public static int DEFAULT_PAGE_SIZE=3;
	
	public int getPageNow() {
		return pageNow;
	}
	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}
	public int getPageSize() {
		return pageSize=4;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public void setPageResult(PageResult pageResult) {
		this.pageResult = pageResult;
	}
	public PageResult getPageResult() {
		return pageResult;
	}
	
}
