package com.wis.ginjectorjibe.foo.client;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.inject.Provider;

@GinModules(FooGinModule.class)
public interface FooGinjector extends Ginjector {
    Provider<Something> something();
}
