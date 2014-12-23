package org.javakatas.listservice.solution.list;

import java.util.ArrayList;

/**
 * Created by davidq on 16/12/14.
 */
public class ProductList {

    private ArrayList<Product> list;
    private String owner;
    private String[] friends;
    private String listName;


    public ProductList(String name) {
        this.list = new ArrayList<Product>();
        this.listName = name;
    }

    public ArrayList getList() {
        return list;
    }


    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }


}
