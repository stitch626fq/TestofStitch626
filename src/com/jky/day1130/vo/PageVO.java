package com.jky.day1130.vo;

import java.util.List;

public class PageVO<T> {
    //当前页
    private Integer pageNow;
    //总记录数
    private Integer myCounts;
    //总页数
    private Integer myPages;
    //查询条件
    private String query1;
    private String query2;
    //数据
    private List<T> list;

    public PageVO() {
    }

    public PageVO(Integer pageNow, Integer myCounts, Integer myPages, String query1, String query2, List<T> list) {
        this.pageNow = pageNow;
        this.myCounts = myCounts;
        this.myPages = myPages;
        this.query1 = query1;
        this.query2 = query2;
        this.list = list;
    }

    public Integer getPageNow() {
        return pageNow;
    }

    public void setPageNow(Integer pageNow) {
        this.pageNow = pageNow;
    }

    public Integer getMyCounts() {
        return myCounts;
    }

    public void setMyCounts(Integer myCounts) {
        this.myCounts = myCounts;
    }

    public Integer getMyPages() {
        return myPages;
    }

    public void setMyPages(Integer myPages) {
        this.myPages = myPages;
    }

    public String getQuery1() {
        return query1;
    }

    public void setQuery1(String query1) {
        this.query1 = query1;
    }

    public String getQuery2() {
        return query2;
    }

    public void setQuery2(String query2) {
        this.query2 = query2;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "PageVO{" +
                "pageNow=" + pageNow +
                ", myCounts=" + myCounts +
                ", myPages=" + myPages +
                ", query1='" + query1 + '\'' +
                ", query2='" + query2 + '\'' +
                ", list=" + list +
                '}';
    }
}

