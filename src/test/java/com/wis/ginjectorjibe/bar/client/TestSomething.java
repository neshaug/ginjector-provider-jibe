package com.wis.ginjectorjibe.bar.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.junit.client.GWTTestCase;
import com.wis.ginjectorjibe.foo.client.FooGinjector;
import com.wis.ginjectorjibe.foo.client.Something;

public class TestSomething extends GWTTestCase {

    @Override
    public String getModuleName() {
        return "com.wis.ginjectorjibe.bar.Bar";
    }

    public final void testSomething() {

        GWT.log("This doesn't freeze");
        final FooGinjector fooGinjector = GWT.create(FooGinjector.class);
        final Something somethingDirectly = fooGinjector.something().get();

        assertEquals("Some message.", somethingDirectly.message());

        GWT.log("This freezes");
        final Something something = BarGinjectorProvider.getInstance()
                .getSomethingProvidedByAnotherGinjector()
                .getInstance(Something.class);

        assertEquals("Some message.", something.message());
    }

}