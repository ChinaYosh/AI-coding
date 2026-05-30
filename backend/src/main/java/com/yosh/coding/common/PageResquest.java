package com.yosh.coding.common;

public class PageResquest {
    private long pageNum = 1; // Default to 1
    private long pageSize = 10; // Default to 10
    private String sortField; // Field to sort by
    private String sortOrder = "descend"; // Default to descending order
}
