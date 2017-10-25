package com.liangfeng.study.common.framework.page;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
* @Title: SortInfo.java
* @Description: 排序类
* @author Liangfeng
* @date 2016-11-10
* @version 1.0
 */
public class SortInfo implements Serializable{
	
	private static final long serialVersionUID = 6959974032209696722L;
	
	private String columnName;
	private String sortOrder;
	
	public SortInfo() {
	}
	
	public SortInfo(String columnName, String sortOrder) {
		super();
		this.columnName = columnName;
		this.sortOrder = sortOrder;
	}
	
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}
	
	public static List<SortInfo> parseSortColumns(String sortColumns) {
		if(sortColumns == null) {
			return new ArrayList<SortInfo>(0);
		}
		
		List<SortInfo> results = new ArrayList<SortInfo>();
		String[] sortSegments = sortColumns.trim().split(",");
		for(int i = 0; i < sortSegments.length; i++) {
			String sortSegment = sortSegments[i];
			String[] array = sortSegment.split("\\s+");
			
			SortInfo sortInfo = new SortInfo();
			sortInfo.setColumnName(array[0]);
			sortInfo.setSortOrder(array.length == 2 ? array[1] : null);
			results.add(sortInfo);
		}
		return results;
	}
	
	@Override
	public String toString() {
		return columnName + (sortOrder == null ? "" : " " + sortOrder);
	}
}
