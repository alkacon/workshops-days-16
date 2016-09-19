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

import org.opencms.file.CmsObject;
import org.opencms.file.CmsResource;
import org.opencms.ui.I_CmsDialogContext;
import org.opencms.ui.contextmenu.I_CmsContextMenuItem;
import org.opencms.ui.contextmenu.I_CmsContextMenuItemProvider;
import org.opencms.workplace.explorer.menu.CmsMenuItemVisibilityMode;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import com.vaadin.ui.Notification;

/**
 * Provides additional context menu items to be used in the explorer view and the opencms toolbar.<p>
 */
public class MenuItemProvider implements I_CmsContextMenuItemProvider {

    /**
     * @see org.opencms.ui.contextmenu.I_CmsContextMenuItemProvider#getMenuItems()
     */
    public List<I_CmsContextMenuItem> getMenuItems() {

        return Arrays.<I_CmsContextMenuItem> asList(new I_CmsContextMenuItem() {

            public void executeAction(I_CmsDialogContext context) {

                // the dialog context may be used to open an overlay dialog or to notify the current app context to update a list of resources

                Notification.show("Menu item was clicked");

            }

            public String getId() {

                // the id can be used to override a default menu entry be using the same id and a higher priority
                return "testitem";
            }

            public float getOrder() {

                return 3000;
            }

            public String getParentId() {

                // to place the entry in a sub menu, return the sub menu id
                return null;
            }

            public int getPriority() {

                // see #getId()
                return 0;
            }

            public String getTitle(Locale locale) {

                return "Test menu item";
            }

            public CmsMenuItemVisibilityMode getVisibility(CmsObject cms, List<CmsResource> resources) {

                return CmsMenuItemVisibilityMode.VISIBILITY_ACTIVE;
            }

            public CmsMenuItemVisibilityMode getVisibility(I_CmsDialogContext context) {

                return CmsMenuItemVisibilityMode.VISIBILITY_ACTIVE;
            }

            public boolean isLeafItem() {

                return true;
            }
        });
    }

}
