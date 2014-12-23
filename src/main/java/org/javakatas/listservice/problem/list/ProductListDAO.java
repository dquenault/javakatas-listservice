package org.javakatas.listservice.problem.list;

import org.javakatas.listservice.problem.exception.CollaboratorCallException;
import org.javakatas.listservice.problem.user.User;

import java.util.List;

/**
 * Created by davidq on 16/12/14.
 */
public class ProductListDAO {
    public static List<ProductList> findProductsByUser(User user) {
        throw new CollaboratorCallException(
                "TripDAO should not be invoked on an unit test.");
    }
}
