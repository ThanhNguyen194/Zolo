package com.qr.chatappproject.service;


import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.storage.internal.Util;

public class MyFirebaseInstanceIDService  {
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(runnable -> {
        });

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
    }
}
