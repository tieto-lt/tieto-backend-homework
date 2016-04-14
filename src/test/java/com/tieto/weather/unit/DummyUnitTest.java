package com.tieto.weather.unit;

import com.tieto.weather.core.UnitTest;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DummyUnitTest extends UnitTest {

    @Test
    public void dummy() {
        assertThat(true, is(true));
    }
}
