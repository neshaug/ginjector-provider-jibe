package com.wis.ginjectorjibe.bar.client;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Provider;

public class SomethingProvidedByAnotherGinjectorImpl implements
        SomethingProvidedByAnotherGinjector {

    private final Map<Class<?>, Provider<?>> providers;
    private final Map<Class<?>, Object> instances;

    public SomethingProvidedByAnotherGinjectorImpl() {
        this.providers = new HashMap<Class<?>, Provider<?>>();
        this.instances = new HashMap<Class<?>, Object>();
    }

    @Override
    public final <T> void registerProvider(final Class<T> clazz,
            final Provider<T> provider) {
        this.providers.put(clazz, provider);
    }

    @Override
    public final <T> void registerInstance(final Class<T> clazz,
            final T instance) {
        this.instances.put(clazz, instance);
    }

    @Override
    @SuppressWarnings("unchecked")
    public final <T> T getInstance(final Class<? extends T> clazz) {
        final Provider<?> provider = this.providers.get(clazz);
        if (provider != null) {
            return (T) provider.get();
        } else {
            return (T) this.instances.get(clazz);
        }
    }
}
