/*
 * Copyright (C) 2017 GedMarc
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

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 23 Feb 2017
 */
@PluginInformation(pluginName = "Full Calendar",
		pluginUniqueName = "full-calendar",
		pluginDescription = "Full Calendar is a free, open-source project that enables you to design full calendar-like features and functions that is fully interactive, ajax controlled and mobile friendly. ",
		pluginVersion = "5.3.0",
		pluginDependancyUniqueIDs = "jquery,moment",
		pluginCategories = "jquery, calendar, schedular, event planner, events, ui, web",
		pluginSubtitle = "Display a full-size drag-n-drop event calendar, leveraging jQuery. ",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-FullCalendarPlugin",
		pluginSourceUrl = "https://github.com/fullcalendar",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-FullCalendarPlugin/wiki",
		pluginOriginalHomepage = "https://fullcalendar.io/",
		pluginSourceDonateUrl = "https://fullcalendar.io/donate/",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.jquery/jwebmp-full-calendar",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginLastUpdatedDate = "2020/12/16",
		pluginGroupId = "com.jwebmp.plugins.jquery",
		pluginArtifactId = "jwebmp-full-calendar",
		pluginModuleName = "com.jwebmp.plugins.fullcalendar",
		pluginStatus = PluginStatus.Released
)
public class FullCalendarPageConfigurator
		implements IPageConfigurator<FullCalendarPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	public FullCalendarPageConfigurator()
	{
		//Nothing Needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return FullCalendarPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		FullCalendarPageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	 public Page<?> configure(Page<?> page)
	{
		if (!page.isConfigured() && enabled())
		{
			page.getBody()
			    .addJavaScriptReference(FullCalendarReferencePool.FullCalendarReference.getJavaScriptReference());
			page.getBody()
			    .addCssReference(FullCalendarReferencePool.FullCalendarReference.getCssReference());
			page.getBody()
			    .addJavaScriptReference(FullCalendarReferencePool.FullCalendarReferencePrint.getJavaScriptReference());
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return FullCalendarPageConfigurator.enabled;
	}
}
