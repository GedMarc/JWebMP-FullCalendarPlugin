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
package com.jwebmp.plugins.fullcalendar.options;

import com.fasterxml.jackson.annotation.*;
import com.jwebmp.core.base.angular.client.annotations.angular.*;
import com.jwebmp.core.base.angular.client.services.interfaces.*;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GedMarc
 * @since 05 Feb 2017
 */

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
@NgDataType
public class FullCalendarEventsList
		extends JavaScriptPart<FullCalendarEventsList> implements INgDataType<FullCalendarEventsList>
{
	
	/**
	 * A list of calendar events
	 */
	private List<FullCalendarEvent> events;

	/**
	 * Returns the list of calendar events
	 *
	 * @return
	 */
	@JsonValue
	public List<FullCalendarEvent> getEvents()
	{
		if (events == null)
		{
			events = new ArrayList<>();
		}

		return events;
	}

	/**
	 * Sets the list of calendar events
	 *
	 * @param events
	 */
	public void setEvents(List<FullCalendarEvent> events)
	{
		this.events = events;
	}

}
