package org.javakatas.listservice.problem.user;

import org.javakatas.listservice.problem.list.ProductList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by davidq on 16/12/14.
 */
public class User {

    private List<ProductList> lists = new ArrayList<ProductList>();
    private List<User> friends = new ArrayList<User>();

    public List<User> getFriends() {
        return friends;
    }

    public void addFriend(User user) {
        friends.add(user);
    }

    public void addList(ProductList list) {
        lists.add(list);
    }

    public List<ProductList> lists() {
        return lists;
    }


}
