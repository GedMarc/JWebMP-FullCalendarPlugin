/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.fullcalendar;

import com.jwebmp.Component;
import com.jwebmp.Page;
import com.jwebmp.PageConfigurator;
import com.jwebmp.plugins.PluginInformation;

/**
 * @author GedMarc
 * @since 23 Feb 2017
 */
@PluginInformation(pluginName = "Full Calendar",
		pluginUniqueName = "full-calendar",
		pluginDescription = "Full Calendar is a free, open-source project that enables you to design full calendar-like features and functions that is fully interactive, ajax controlled and mobile friendly. ",
		pluginVersion = "3.2.0",
		pluginDependancyUniqueIDs = "jquery,moment",
		pluginCategories = "jquery, calendar, schedular, event planner, events, ui, web",
		pluginSubtitle = "Display a full-size drag-n-drop event calendar, leveraging jQuery. ",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-FullCalendarPlugin",
		pluginSourceUrl = "https://github.com/fullcalendar",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-FullCalendarPlugin/wiki",
		pluginOriginalHomepage = "https://fullcalendar.io/",
		pluginSourceDonateUrl = "https://fullcalendar.io/donate/",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/FullCalendarPlugin.jar/download",
		pluginIconUrl = "bower_components/fullcalendar/fullcalendar_icon.png",
		pluginIconImageUrl = "bower_components/fullcalendar/fullcalendar_example.png",
		pluginLastUpdatedDate = "2017/03/04"
)
public class FullCalendarPageConfigurator extends PageConfigurator
{

	public static final String FullCalendarEnabled = "full-calendar-enabled";
	private static final long serialVersionUID = 1L;

	public FullCalendarPageConfigurator()
	{
		//Nothing Needed
	}

	@SuppressWarnings("unchecked")
	public static void setRequired(Component component, boolean required)
	{
		component.getProperties().put(FullCalendarEnabled, required);
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			page.getBody().addJavaScriptReference(FullCalendarReferencePool.FullCalendarReference.getJavaScriptReference());
			page.getBody().addCssReference(FullCalendarReferencePool.FullCalendarReference.getCssReference());
			page.getBody().addCssReference(FullCalendarReferencePool.FullCalendarReferencePrint.getCssReference());
		}
		return page;
	}
}