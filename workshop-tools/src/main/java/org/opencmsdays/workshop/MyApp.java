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

import java.util.LinkedHashMap;
import java.util.List;

import org.opencms.file.CmsObject;
import org.opencms.file.CmsResource;
import org.opencms.file.CmsResourceFilter;
import org.opencms.main.CmsException;
import org.opencms.main.OpenCms;
import org.opencms.ui.A_CmsUI;
import org.opencms.ui.I_CmsDialogContext;
import org.opencms.ui.I_CmsDialogContext.ContextType;
import org.opencms.ui.apps.A_CmsWorkplaceApp;
import org.opencms.ui.apps.CmsFileExplorer;
import org.opencms.ui.apps.I_CmsContextProvider;
import org.opencms.ui.components.CmsErrorDialog;
import org.opencms.ui.components.CmsFileTable;
import org.opencms.ui.components.CmsFileTableDialogContext;
import org.opencms.ui.contextmenu.CmsResourceContextMenuBuilder;

import com.vaadin.ui.Component;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

/**
 * Sample app.<p>
 */
public class MyApp extends A_CmsWorkplaceApp {
	
	CmsFileTable m_fileTable;

    /**
     * @see org.opencms.ui.apps.A_CmsWorkplaceApp#getBreadCrumbForState(java.lang.String)
     */
    @Override
    protected LinkedHashMap<String, String> getBreadCrumbForState(String state) {

        LinkedHashMap<String, String> crumbs = new LinkedHashMap<String, String>();
        crumbs.put("", "My App");
        return crumbs;
    }

    /**
     * @see org.opencms.ui.apps.A_CmsWorkplaceApp#getComponentForState(java.lang.String)
     */
    @Override
    protected Component getComponentForState(String state) {
    	VerticalLayout main=new VerticalLayout();
    	main.setSizeFull();
    	
        main.addComponent(new Label("Hallo World"));
        I_CmsContextProvider contextProvider  =new I_CmsContextProvider() {
			
			@Override
			public I_CmsDialogContext getDialogContext() {
				CmsFileTableDialogContext context = new CmsFileTableDialogContext(
			            ContextType.fileTable,
			            m_fileTable,
			            m_fileTable.getSelectedResources());
			        context.setEditableProperties(CmsFileExplorer.INLINE_EDIT_PROPERTIES);
			        return context;
			}
		};
        
        m_fileTable=new CmsFileTable(contextProvider);
        m_fileTable.setMenuBuilder(new CmsResourceContextMenuBuilder());
        try {
			CmsResourceFilter filter=CmsResourceFilter.ONLY_VISIBLE.addRequireType(OpenCms.getResourceManager().getResourceType("a-event"));
			CmsObject cms=A_CmsUI.getCmsObject();
			List<CmsResource> resources=cms.readResources("/", filter);
			m_fileTable.fillTable(cms, resources);
		} catch (CmsException e) {
			CmsErrorDialog.showErrorDialog(e);
		}
        main.addComponent(m_fileTable);
        main.setExpandRatio(m_fileTable, 2);
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
