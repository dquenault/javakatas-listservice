package org.javakatas.listservice.solution.list;


import org.javakatas.listservice.problem.exception.UserNotLoggedInException;
import org.javakatas.listservice.problem.list.ProductList;
import org.javakatas.listservice.problem.list.ProductListDAO;
import org.javakatas.listservice.problem.user.User;
import org.javakatas.listservice.problem.user.UserSession;


import java.util.ArrayList;
import java.util.List;

public class ListService {

    public List<ProductList> getListsByUser(User user) throws UserNotLoggedInException {
        List<ProductList> productList = new ArrayList<ProductList>();
        User loggedUser = UserSession.getInstance().getLoggedUser();

        boolean isFriend = false;

        if (loggedUser != null) {
            for (User friend : user.getFriends()) {
                if (friend.equals(loggedUser)) {
                    isFriend = true;
                    break;
                }
            }
            if (isFriend){
                productList = ProductListDAO.findProductsByUser(user);
            }
            return productList;
        } else {
            throw new UserNotLoggedInException();
        }

    }
}
