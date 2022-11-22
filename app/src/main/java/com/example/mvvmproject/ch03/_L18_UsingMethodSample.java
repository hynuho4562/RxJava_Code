package com.example.mvvmproject.ch03;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Cancellable;

public class _L18_UsingMethodSample {
    public static void main(String[] args) {
        FlowableEmitter<String> flowableEmitter = new FlowableEmitter<String>() {
            @Override
            public void setDisposable(@Nullable Disposable disposable) {
                disposable.dispose();
                disposable.isDisposed();
            }

            @Override
            public void setCancellable(@Nullable Cancellable cancellable) {
                try {
                    cancellable.cancel();

                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
            }

            @Override
            public long requested() {
                return 0;
            }

            @Override
            public boolean isCancelled() {
                return false;
            }

            @Override
            public @NonNull FlowableEmitter<String> serialize() {
                return null;
            }

            @Override
            public boolean tryOnError(@NonNull Throwable t) {
                return false;
            }

            @Override
            public void onNext(@NonNull String value) {

            }

            @Override
            public void onError(@NonNull Throwable error) {

            }

            @Override
            public void onComplete() {

            }
        };
    }
}
