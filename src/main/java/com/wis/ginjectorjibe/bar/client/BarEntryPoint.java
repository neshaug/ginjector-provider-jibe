package com.wis.ginjectorjibe.bar.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.wis.ginjectorjibe.foo.client.FooEntryPoint;
import com.wis.ginjectorjibe.foo.client.Something;

public class BarEntryPoint implements EntryPoint {

    /**
     * Creates a new instance of {@link FooEntryPoint}.
     */
    public BarEntryPoint() {
    }

    /**
     * The entry point method, called automatically by loading a module that
     * declares an implementing class as an entry-point.
     */
    @Override
    public final void onModuleLoad() {
        GWT.log("Oh my Gods, the bar module frakking loaded");
        final Something something =
                BarGinjectorProvider.getInstance()
                        .getSomethingProvidedByAnotherGinjector()
                        .getInstance(Something.class);
        
        GWT.log("Printing a message provided by another module.");
        GWT.log(something.message());
    }
}
