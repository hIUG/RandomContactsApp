package com.allexis.randomcontactsapp.core.network.service.common.controller;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by allexis on 10/30/17.
 * <p>
 * Base network controller to be extended by other network controllers, protected access strings to
 * build a different custom URL if needed by a child controller. The default one shared among all
 * controllers is defined here.
 * Custom controllers should override getURL() in case they want to use a custom URL
 */

public abstract class NetworkController<T> {

    protected static final String PROTOCOL_HTTPS = "http://";
    protected static final String DOMAIN = "randomuser.me/";
    private static final String TAG = NetworkController.class.getSimpleName();
    private static final String BASE_URL = PROTOCOL_HTTPS + DOMAIN + "api/";
    private CompositeDisposable compositeDisposable;
    /**
     * OkHttp and Retrofit instances in case a custom behaviour, interceptor, etc needs to be done.
     */
    private Retrofit retrofit;
    private OkHttpClient okHttpClient;

    public NetworkController() {
        okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor()
                        .setLevel(HttpLoggingInterceptor.Level.BODY))
                .build();

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        compositeDisposable = new CompositeDisposable();

        initClient();
    }

    public void dispose() {
        compositeDisposable.clear();
    }

    protected abstract void initClient();

    protected <R> R create(final Class<R> clientClass) {
        return retrofit.create(clientClass);
    }

    public void execute(Observable<T> observable, Consumer<T> successConsumer, Consumer<Throwable> errorConsumer) {
        compositeDisposable.add(observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(successConsumer, errorConsumer));
    }
}