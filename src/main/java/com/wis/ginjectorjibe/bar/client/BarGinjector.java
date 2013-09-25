package com.wis.ginjectorjibe.bar.client;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

@GinModules(BarGinModule.class)
public interface BarGinjector extends Ginjector {
    SomethingProvidedByAnotherGinjector getSomethingProvidedByAnotherGinjector();
}
