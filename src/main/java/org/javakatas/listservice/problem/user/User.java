package org.javakatas.listservice.problem.user;

import org.javakatas.listservice.problem.list.ProductList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by davidq on 16/12/14.
 */
public class User {

    private List<ProductList> products = new ArrayList<ProductList>();
    private List<User> friends = new ArrayList<User>();

    public List<User> getFriends() {
        return friends;
    }

    public void addFriend(User user) {
        friends.add(user);
    }

    public void addTrip(ProductList product) {
        products.add(product);
    }

    public List<ProductList> products() {
        return products;
    }
}
