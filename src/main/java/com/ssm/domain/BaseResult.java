package com.ssm.domain;

import java.util.List;

/**
 * Created by dllo on 18/1/26.
 */

/**
 * 封装miniUi中分页显示的结果集
 */
public class BaseResult<T> {

    private int total;//总记录数
    private List<T> data;//当页数据集合

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BaseResult{" +
                "total=" + total +
                ", data=" + data +
                '}';
    }
}
