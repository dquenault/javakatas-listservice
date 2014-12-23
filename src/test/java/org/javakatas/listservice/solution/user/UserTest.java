package org.javakatas.listservice.solution.user;

import org.junit.Test;

import static org.junit.Assert.*;
import org.javakatas.listservice.solution.list.UserBuilder;

public class UserTest {

    private static final User PAUL = new User();
    private static final User BOB = new User();

    @Test
    public void
    should_return_false_when_users_are_not_friends() {
        User user = UserBuilder.aUser()
                        .friendsWith(BOB)
                        .build();

        assertFalse(user.isFriendWith(PAUL));
    }

    @Test
    public void
    should_return_true_when_users_are_friends() {
        User user = UserBuilder.aUser()
                .friendsWith(BOB)
                .build();

        assertTrue(user.isFriendWith(BOB));
    }
}