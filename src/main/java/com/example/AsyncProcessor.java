package com.example;

import javax.ws.rs.container.AsyncResponse;

/**
 * Created by ssolnosky on 7/11/2016.
 */
public class AsyncProcessor implements Runnable {

    private AsyncResponse asyncResponse;
    private String id;

    @Override
    public void run() {
        String result = veryExpensiveOperation(id);
        asyncResponse.resume(result);
    }

    private String veryExpensiveOperation(String id) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Got id: " + id + "!";
    }

    public Runnable schedule(AsyncResponse response, String id) {
        this.asyncResponse = response;
        this.id = id;

        return this;
    }

}
