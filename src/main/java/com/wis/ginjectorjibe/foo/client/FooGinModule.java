package com.wis.ginjectorjibe.foo.client;

import com.google.gwt.inject.client.AbstractGinModule;

public class FooGinModule extends AbstractGinModule {

    @Override
    protected final void configure() {
        this.bind(Something.class).to(SomethingImpl.class);
    }
}
