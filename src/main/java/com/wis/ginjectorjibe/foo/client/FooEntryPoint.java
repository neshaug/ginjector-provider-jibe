package com.wis.ginjectorjibe.foo.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.wis.ginjectorjibe.bar.client.BarGinjectorProvider;

public class FooEntryPoint implements EntryPoint {

    /**
     * Creates a new instance of {@link FooEntryPoint}.
     */
    public FooEntryPoint() {
    }

    /**
     * The entry point method, called automatically by loading a module that
     * declares an implementing class as an entry-point.
     */
    @Override
    public final void onModuleLoad() {
        GWT.log("Oh my Gods, the foo module frakking loaded");

        final FooGinjector ginjector = GWT.create(FooGinjector.class);

        BarGinjectorProvider.getInstance()
                .getSomethingProvidedByAnotherGinjector()
                .registerProvider(Something.class, ginjector.something());
    }
}
