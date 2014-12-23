package org.javakatas.listservice.solution.list;

import org.javakatas.listservice.problem.exception.CollaboratorCallException;
import org.javakatas.listservice.solution.user.User;

import java.util.List;

/**
 * Created by davidq on 16/12/14.
 */
public class ProductListDAO {
    public static List<ProductList> findProductsByUser(User user) {
        throw new CollaboratorCallException(
                "TripDAO should not be invoked on an unit test.");
    }

    public List<ProductList> listsBy(User user) {
        return ProductListDAO.findProductsByUser(user);
    }
}
