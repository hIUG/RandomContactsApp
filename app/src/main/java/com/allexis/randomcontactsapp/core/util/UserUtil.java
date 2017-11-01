package com.allexis.randomcontactsapp.core.util;

import com.allexis.randomcontactsapp.core.network.service.randomuser.model.User;

/**
 * Created by allexis on 11/1/17.
 */

public final class UserUtil {

    public static String getFullName(User user) {
        return new StringBuilder()
                .append(user.getName().getTitle())
                .append(" ")
                .append(user.getName().getFirst())
                .append(" ")
                .append(user.getName().getLast())
                .toString();
    }
}
