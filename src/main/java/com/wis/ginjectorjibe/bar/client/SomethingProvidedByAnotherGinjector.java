package com.wis.ginjectorjibe.bar.client;

import javax.inject.Provider;

public interface SomethingProvidedByAnotherGinjector {

    <T> void registerProvider(Class<T> clazz, Provider<T> provider);

    <T> void registerInstance(Class<T> clazz, T instance);

    <T> T getInstance(Class<? extends T> clazz);
}
