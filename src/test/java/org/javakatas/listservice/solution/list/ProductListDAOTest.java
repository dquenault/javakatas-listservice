package org.javakatas.listservice.solution.list;

import org.javakatas.listservice.problem.exception.CollaboratorCallException;
import org.junit.Test;

import static org.junit.Assert.*;
import org.javakatas.listservice.solution.user.User;


public class ProductListDAOTest {

    @Test(expected = CollaboratorCallException.class)
    public void
    should_throw_exception_when_retrieving_user_lists() {
        new ProductListDAO().listsBy(new User());
    }

}