package com.alevohin;

import javafx.scene.Parent;
import javafx.scene.control.Label;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.loadui.testfx.GuiTest;

/**
 * Tests for {@link AppFX}.
 *
 * @author Yuriy Alevohin (alevohin@mail.ru)
 * @version $Id$
 * @since 0.8
 */
public final class AppFXTest extends GuiTest {

    @Override
    protected Parent getRootNode() {
        return new AppFX().centralPane();
    }

    @Test
    public void showsButtons() throws Exception {
        MatcherAssert.assertThat(
            findAll(".button").size(),
            Matchers.is(2)
        );
    }

    @Test
    public void showsBottom() throws Exception {
        final Label label = find("BOTTOM");
        MatcherAssert.assertThat(
            label.isVisible(),
            Matchers.is(true)
        );
    }

    @Test
    public void clicksButtons() throws Exception {
        click("A").click("B");
    }
}
