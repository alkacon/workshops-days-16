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

public class MenuItemProvider implements I_CmsContextMenuItemProvider {

    public List<I_CmsContextMenuItem> getMenuItems() {

        return Arrays.<I_CmsContextMenuItem> asList(new I_CmsContextMenuItem() {

            public void executeAction(I_CmsDialogContext context) {

                Notification.show("Menu item was clicked");
            }

            public String getId() {

                // TODO Auto-generated method stub
                return "testitem";
            }

            public float getOrder() {

                // TODO Auto-generated method stub
                return 3000;
            }

            public String getParentId() {

                // TODO Auto-generated method stub
                return null;
            }

            public int getPriority() {

                // TODO Auto-generated method stub
                return 0;
            }

            public String getTitle(Locale locale) {

                // TODO Auto-generated method stub
                return "Test menu item";
            }

            public CmsMenuItemVisibilityMode getVisibility(CmsObject cms, List<CmsResource> resources) {

                // TODO Auto-generated method stub
                return CmsMenuItemVisibilityMode.VISIBILITY_ACTIVE;
            }

            public CmsMenuItemVisibilityMode getVisibility(I_CmsDialogContext context) {

                // TODO Auto-generated method stub
                return CmsMenuItemVisibilityMode.VISIBILITY_ACTIVE;
            }

            public boolean isLeafItem() {

                return true;
            }
        });
    }

}
