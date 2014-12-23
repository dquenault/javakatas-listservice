package org.javakatas.listservice.solution.user;

import org.javakatas.listservice.problem.exception.CollaboratorCallException;
import org.javakatas.listservice.solution.user.User;

/**
 * Created by davidq on 16/12/14.
 */
public class UserSession {

    private static final UserSession userSession = new UserSession();

    private UserSession() {
    }


    public static UserSession getInstance() { return userSession; }

    public User getLoggedUser() {
        throw new CollaboratorCallException(
                "UserSession.getLoggedUser() should not be called in an unit test");
    }
}
