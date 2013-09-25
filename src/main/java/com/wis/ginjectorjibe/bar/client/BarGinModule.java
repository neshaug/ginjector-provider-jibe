package com.wis.ginjectorjibe.bar.client;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;

public class BarGinModule extends AbstractGinModule {

    @Override
    protected final void configure() {

        this.bind(SomethingProvidedByAnotherGinjector.class)
                .to(SomethingProvidedByAnotherGinjectorImpl.class)
                .in(Singleton.class);
    }
}
