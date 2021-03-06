package com.qf.novel.pojo.vo;

import java.util.List;

/**
 * 全文检索查询结果集
 * User: DHC
 * Date: 2017/11/23
 * Time: 9:46
 * Version:V1.0
 */
public class NSearchBookResult {

    private long recordCount;

    private int totalPages;

    private List<NBookSearchCustom> bookList;


    public long getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(long recordCount) {
        this.recordCount = recordCount;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<NBookSearchCustom> getBookList() {
        return bookList;
    }

    public void setBookList(List<NBookSearchCustom> bookList) {
        this.bookList = bookList;
    }
}
