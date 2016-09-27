package org.opencmsdays.workshop;

import java.util.Collections;
import java.util.List;
import java.util.Locale;

import org.opencms.file.CmsObject;
import org.opencms.file.CmsResource;
import org.opencms.i18n.CmsMessages;
import org.opencms.main.OpenCms;
import org.opencms.util.CmsStringUtil;
import org.opencms.widgets.A_CmsAdeGalleryWidget;
import org.opencms.widgets.A_CmsWidget;
import org.opencms.widgets.I_CmsADEWidget;
import org.opencms.widgets.I_CmsWidget;
import org.opencms.widgets.I_CmsWidgetDialog;
import org.opencms.widgets.I_CmsWidgetParameter;
import org.opencms.xml.content.I_CmsXmlContentHandler.DisplayType;
import org.opencms.xml.types.A_CmsXmlContentValue;

public class MyWidget extends A_CmsWidget implements I_CmsADEWidget{

	@Override
	public String getDialogWidget(CmsObject cms, I_CmsWidgetDialog widgetDialog, I_CmsWidgetParameter param) {
		// this is required for the old XML content editor only
		return null;
	}

	@Override
	public I_CmsWidget newInstance() {
		return new MyWidget();
	}

	@Override
	public String getConfiguration(CmsObject cms, A_CmsXmlContentValue contentValue, CmsMessages messages,
			CmsResource resource, Locale contentLocale) {
		// you may pass a configuration string on to the client side widget
		return "";
	}

	@Override
	public List<String> getCssResourceLinks(CmsObject cms) {
		// return additional CSS resource links, if required
		return null;
	}

	@Override
	public DisplayType getDefaultDisplayType() {
		// there are different display options, this is the default
		return DisplayType.wide;
	}

	@Override
	public String getInitCall() {
		// this is the name of the JavaScript function used to initialize the widget on the client
		return "initializeMyWidget";
	}

	@Override
	public List<String> getJavaScriptResourceLinks(CmsObject cms) {
		// return links to all required JavaScript resources
		return Collections.singletonList(
				CmsStringUtil.joinPaths(
						OpenCms.getSystemInfo().getStaticResourceContext(),
						"myWidget/myWidget.js"));
	}

	@Override
	public String getWidgetName() {
		// the widget name should be unique
		return "myWidget";
	}

	@Override
	public boolean isInternal() {
		return false;
	}

}
