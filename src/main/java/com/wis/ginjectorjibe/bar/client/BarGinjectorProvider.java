package com.wis.ginjectorjibe.bar.client;

import com.google.gwt.core.client.GWT;
import com.google.inject.Provider;

public class BarGinjectorProvider implements Provider<BarGinjector> {

    private static final BarGinjector INSTANCE =
            GWT.create(BarGinjector.class);

    @Override
    public final BarGinjector get() {
        return INSTANCE;
    }

    public static BarGinjector getInstance() {
        return INSTANCE;
    }
}
