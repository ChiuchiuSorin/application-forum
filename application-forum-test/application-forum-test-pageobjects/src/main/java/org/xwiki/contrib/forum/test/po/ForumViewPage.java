/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.contrib.forum.test.po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.xwiki.test.ui.po.ViewPage;

/**
 * Represents the Forum view page.
 * 
 * @version $Id$
 * @since 1.9.4
 */
public class ForumViewPage extends ViewPage
{
    @FindBy(css = ".addconversation-activator")
    private WebElement addTopicActivator;

    @FindBy(css = ".forum-description")
    private WebElement description;

    // Tour steps
    @FindBy(css = "#bootstrap_tour_next")
    private WebElement step0;

    @FindBy(css = "#bootstrap_tour_next")
    private WebElement step1;

    @FindBy(css = "#bootstrap_tour_next")
    private WebElement step2;

    @FindBy(css = "#bootstrap_tour_end")
    private WebElement step3;

    /**
     * @return the form to enter new topic
     */
    public TopicAddElement clickAddTopicActivator()
    {
        addTopicActivator.click();
        return new TopicAddElement();
    }

    /**
     * @return the Forum description
     */
    public String getDescription()
    {
        return description.getText();
    }

    /**
     * Navigates through the Forum tour.
     */
    public void viewTour()
    {
        step0.click();
        step1.click();
        step2.click();
        step3.click();
    }
}
