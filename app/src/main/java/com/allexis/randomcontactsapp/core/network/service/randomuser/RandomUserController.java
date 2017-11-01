package com.allexis.randomcontactsapp.core.network.service.randomuser;

import com.allexis.randomcontactsapp.core.network.service.common.controller.NetworkController;
import com.allexis.randomcontactsapp.core.network.service.randomuser.model.UserResult;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import retrofit2.http.GET;
import retrofit2.http.Query;

import static com.allexis.randomcontactsapp.core.network.service.randomuser.RandomUserController.RandomUserService.NATIONALITY_US;

/**
 * Created by allexis on 11/1/17.
 */

public class RandomUserController extends NetworkController<UserResult> {

    private RandomUserService service;

    @Override
    protected void initClient() {
        service = create(RandomUserService.class);
    }

    public void getRandomUser(Consumer<UserResult> successConsumer, Consumer<Throwable> errorConsumer) {
        execute(service.getRandomUser(NATIONALITY_US), successConsumer, errorConsumer);
    }

    public interface RandomUserService {

        String NATIONALITY_US = "us";

        @GET(".")
        Observable<UserResult> getRandomUser(@Query("nat") String nationality);
    }
}
