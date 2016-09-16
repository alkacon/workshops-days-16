/*
 * This library is part of OpenCms -
 * the Open Source Content Management System
 *
 * Copyright (c) Alkacon Software GmbH (http://www.alkacon.com)
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
import org.opencms.ui.apps.CmsAppVisibilityStatus;
import org.opencms.ui.apps.I_CmsAppButtonProvider;
import org.opencms.ui.apps.I_CmsWorkplaceApp;
import org.opencms.ui.apps.I_CmsWorkplaceAppConfiguration;

import java.util.Locale;

import com.vaadin.server.FontAwesome;
import com.vaadin.server.Resource;

public class AppConfiguration implements I_CmsWorkplaceAppConfiguration {

    public String getAppCategory() {

        return AppCategoryTest.CATEGORY_ID;

    }

    public I_CmsWorkplaceApp getAppInstance() {

        return new MyApp();
    }

    public String getButtonStyle() {

        return I_CmsAppButtonProvider.BUTTON_STYLE_RED;
    }

    public String getHelpText(Locale locale) {

        return null;
    }

    public Resource getIcon() {

        return FontAwesome.THUMBS_UP;
    }

    public String getId() {

        return "MyApp";
    }

    public String getName(Locale locale) {

        return "MyApp";
    }

    public int getOrder() {

        return 0;
    }

    /**
     * @see org.opencms.ui.apps.I_CmsWorkplaceAppConfiguration#getPriority()
     */
    public int getPriority() {

        return I_CmsWorkplaceAppConfiguration.DEFAULT_PRIORIY;
    }

    /**
     * @see org.opencms.ui.apps.I_CmsWorkplaceAppConfiguration#getVisibility(org.opencms.file.CmsObject)
     */
    public CmsAppVisibilityStatus getVisibility(CmsObject cms) {

        // TODO Auto-generated method stub
        return new CmsAppVisibilityStatus(true, true, "visible");
    }
}
