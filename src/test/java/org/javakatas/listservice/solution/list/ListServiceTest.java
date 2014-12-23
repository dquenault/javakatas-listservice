package org.javakatas.listservice.solution.list;

import org.junit.Test;

import java.util.List;

import org.javakatas.listservice.problem.exception.UserNotLoggedInException;
import org.javakatas.listservice.solution.user.User;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class ListServiceTest {

    private static final User GUEST = null;
    private static final User UNUSED_USER = null;
    private static final User REGISTERED_USER = new User();
    private static final User ANOTHER_USER = new User();
    private static final ProductList WEDDING_LIST = new ProductList("wedding list");
    private static final ProductList BIRTHDAY_LIST = new ProductList("birthday list");

    @Mock
    private ProductListDAO productListDAO;

    @InjectMocks
    @Spy
    private ListService listService = new ListService();


    @Test(expected = UserNotLoggedInException.class)
    public void
    should_throw_an_exception_when_user_is_not_logged_on() {

        listService.getFriendLists(UNUSED_USER, GUEST);
    }

    @Test
    public void
    should_not_return_any_lists_if_users_are_not_friends() {
        User friend = UserBuilder.aUser()
                .friendsWith(ANOTHER_USER)
                .withLists(WEDDING_LIST)
                .build();

        List<ProductList> friendsLists = listService.getFriendLists(friend, REGISTERED_USER);

        assertThat(friendsLists.size(), is(0));

    }

    @Test
    public void
    should_return_friends_lists_when_users_are_friends() {

        User friend = UserBuilder.aUser()
                .friendsWith(ANOTHER_USER, REGISTERED_USER)
                .withLists(WEDDING_LIST, BIRTHDAY_LIST)
                .build();

        given(productListDAO.listsBy(friend)).willReturn(friend.lists());

        List<ProductList> friendsLists = listService.getFriendLists(friend, REGISTERED_USER);

        assertThat(friendsLists.size(), is(2));
    }

}