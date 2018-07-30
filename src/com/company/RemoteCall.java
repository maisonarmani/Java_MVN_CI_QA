package com.company;

import jdk.nashorn.internal.runtime.regexp.joni.Warnings;

import java.util.concurrent.Callable;


final class RemoteCall implements Callable<String> {
    private static  String remoteUrl = "";

    RemoteCall(String url) {

        this.remoteUrl = url;

        System.out.printf("Constructor %s \n", this.remoteUrl);
        System.out.println(2 >> 2);
    }

    @SuppressWarnings(Warnings.INVALID_BACKREFERENCE)
    @Override
    public String call() throws Exception {
        try {
            this.makeRemoteCall();
        } finally {
            return "done";
        }
    }

    void makeRemoteCall() {
        System.out.printf("Calling% s", this.remoteUrl);
    }

}
