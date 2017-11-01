package com.allexis.randomcontactsapp.core.util;

import com.allexis.randomcontactsapp.core.network.service.randomuser.model.User;

/**
 * Created by allexis on 11/1/17.
 */

public final class UserUtil {

    private static final String GENDER_FEMALE = "female";
    private static final String GENDER_MALE = "male";

    public static String getFullName(User user) {
        if (user == null) {
            return null;
        }

        return new StringBuilder()
                .append(user.getName().getTitle().toUpperCase().charAt(0))
                .append(user.getName().getTitle().toLowerCase().substring(1))
                .append(" ")
                .append(user.getName().getFirst().toUpperCase().charAt(0))
                .append(user.getName().getFirst().toLowerCase().substring(1))
                .append(" ")
                .append(user.getName().getLast().toUpperCase().charAt(0))
                .append(user.getName().getLast().toLowerCase().substring(1))
                .toString();
    }

    public static boolean isMale(User user) {
        return user != null && !user.getGender().equalsIgnoreCase(GENDER_FEMALE);
    }

    public static boolean isMale(String gender) {
        return gender != null && !gender.equalsIgnoreCase(GENDER_FEMALE);
    }

    public static String getLocation(User user) {
        if (user == null) {
            return null;
        }

        return new StringBuilder()
                .append(user.getLocation().getCity().toUpperCase().charAt(0))
                .append(user.getLocation().getCity().toLowerCase().substring(1))
                .append(", ")
                .append(user.getLocation().getState().toUpperCase().charAt(0))
                .append(user.getLocation().getState().toLowerCase().substring(1))
                .toString();
    }
}
