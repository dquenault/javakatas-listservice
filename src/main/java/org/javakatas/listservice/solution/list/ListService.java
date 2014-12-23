package org.javakatas.listservice.solution.list;


import org.javakatas.listservice.problem.exception.UserNotLoggedInException;
import org.javakatas.listservice.solution.user.User;
import org.javakatas.listservice.solution.user.UserSession;


import java.util.ArrayList;
import java.util.List;

public class ListService {

    private ProductListDAO productListDAO;

    public List<ProductList> getFriendLists(User friend, User loggedInUser) throws UserNotLoggedInException {
        validate(loggedInUser);

        return friend.isFriendWith(loggedInUser)
                ? findProductListsByUser(friend)
                : noLists();
    }

    private ArrayList<ProductList> noLists() {
        return new ArrayList<ProductList>();
    }

    private void validate(User loggedInUser) {
        if (loggedInUser == null) {
            throw new UserNotLoggedInException();
        }
    }

    private List<ProductList> findProductListsByUser(User user) {
        return productListDAO.listsBy(user);
    }

}
