package org.javakatas.listservice.solution.list;

import org.javakatas.listservice.solution.user.User;

/**
* Created by davidq on 23/12/14.
*/
public class UserBuilder {
    private User[] friends = new User[] {};
    private ProductList[] lists = new ProductList[] {};

    public static UserBuilder aUser() {
        return new UserBuilder();
    }

    public UserBuilder friendsWith(User...friends) {
        this.friends = friends;
        return this;
    }

    public UserBuilder withLists(ProductList...lists) {
        this.lists = lists;
        return this;
    }

    public User build() {
        User user = new User();
        addListsTo(user);
        addFriendsTo(user);
        return user;
    }

    private void addFriendsTo(User user) {
        for (User friend : friends){
            user.addFriend(friend);
        }
    }

    private void addListsTo(User user) {
        for (ProductList list : lists) {
                user.addList(list);
        }
    }


}
