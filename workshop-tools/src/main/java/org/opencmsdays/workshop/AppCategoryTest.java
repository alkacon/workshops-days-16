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

import org.opencms.ui.apps.I_CmsAppCategory;

import java.util.Locale;

/**
 * Sample app category. Used to group apps in the launchpad.<p>
 */
public class AppCategoryTest implements I_CmsAppCategory {

    /** The category id. Needs to be unique. */
    public static final String CATEGORY_ID = "Test";

    /**
     * @see org.opencms.ui.apps.I_CmsAppCategory#getId()
     */
    public String getId() {

        return CATEGORY_ID;
    }

    /**
     * @see org.opencms.ui.apps.I_CmsAppCategory#getName(java.util.Locale)
     */
    public String getName(Locale locale) {

        return "Test";
    }

    /**
     * @see org.opencms.ui.apps.I_CmsAppCategory#getOrder()
     */
    public int getOrder() {

        return 100;
    }

    /**
     * @see org.opencms.ui.apps.I_CmsAppCategory#getParentId()
     */
    public String getParentId() {

        return null;
    }

    /**
     * @see org.opencms.ui.apps.I_CmsAppCategory#getPriority()
     */
    public int getPriority() {

        return 0;
    }

}
