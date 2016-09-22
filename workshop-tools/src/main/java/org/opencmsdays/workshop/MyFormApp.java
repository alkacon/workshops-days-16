/*
 * File   : $Source$
 * Date   : $Date$
 * Version: $Revision$
 *
 * This library is part of OpenCms -
 * the Open Source Content Management System
 *
 * Copyright (C) 2002 - 2008 Alkacon Software (http://www.alkacon.com)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * For further information about Alkacon Software, please see the
 * company website: http://www.alkacon.com
 *
 * For further information about OpenCms, please see the
 * project website: http://www.opencms.org
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package org.opencmsdays.workshop;

import org.opencms.ui.apps.A_CmsWorkplaceApp;
import org.opencms.ui.components.OpenCmsTheme;

import java.util.LinkedHashMap;
import java.util.List;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

/**
 * Sample app.<p>
 */
public class MyFormApp extends A_CmsWorkplaceApp {

    /**
     * @see org.opencms.ui.apps.A_CmsWorkplaceApp#getBreadCrumbForState(java.lang.String)
     */
    @Override
    protected LinkedHashMap<String, String> getBreadCrumbForState(String state) {

        LinkedHashMap<String, String> crumbs = new LinkedHashMap<String, String>();
        crumbs.put("", "My form app");
        return crumbs;
    }

    /**
     * @see org.opencms.ui.apps.A_CmsWorkplaceApp#getComponentForState(java.lang.String)
     */
    @Override
    protected Component getComponentForState(String state) {

        VerticalLayout inner = new VerticalLayout();
        inner.addStyleName(OpenCmsTheme.WORKPLACE_MAXWIDTH);
        inner.setMargin(true);
        inner.setSpacing(true);
        Label headline = new Label("Form example");
        headline.addStyleName("h2");
        inner.addComponent(headline);
        Panel formPanel = new Panel("Fields");
        inner.addComponent(formPanel);
        FormLayout form = new FormLayout();
        form.setMargin(true);
        inner.setSpacing(true);
        form.addStyleName(OpenCmsTheme.FORMLAYOUT_WORKPLACE_MAIN);
        formPanel.setContent(form);
        form.addComponent(new TextField("Text field 1"));
        form.addComponent(new TextField("Text field 2"));
        form.addComponent(new TextField("Text field 3"));
        form.addComponent(new TextField("Text field 4"));
        form.addComponent(new CheckBox("Check box"));

        Panel buttonPanel = new Panel();

        inner.addComponent(buttonPanel);
        HorizontalLayout buttons = new HorizontalLayout();
        buttonPanel.setContent(buttons);
        buttons.setWidth("100%");
        buttons.setStyleName(OpenCmsTheme.DIALOG_BUTTON_BAR);
        buttons.setMargin(true);
        buttons.setSpacing(true);
        Button ok = new Button("Ok");

        buttons.addComponent(ok);
        buttons.setComponentAlignment(ok, Alignment.MIDDLE_RIGHT);
        Button cancel = new Button("Cancel");
        buttons.addComponent(cancel);
        buttons.setComponentAlignment(cancel, Alignment.MIDDLE_LEFT);
        VerticalLayout main = new VerticalLayout();
        main.addComponent(inner);
        main.setComponentAlignment(inner, Alignment.TOP_CENTER);
        return main;
    }

    /**
     * @see org.opencms.ui.apps.A_CmsWorkplaceApp#getSubNavEntries(java.lang.String)
     */
    @Override
    protected List<NavEntry> getSubNavEntries(String state) {

        return null;
    }
}
