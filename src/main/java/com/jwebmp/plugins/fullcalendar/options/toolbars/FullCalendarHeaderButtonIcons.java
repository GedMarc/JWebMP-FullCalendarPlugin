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
package com.jwebmp.plugins.fullcalendar.options.toolbars;

import com.fasterxml.jackson.annotation.*;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * buttonIcons
 * <p>
 * Determines which icons are displayed in buttons of the header.
 * <p>
 * Object, default:
 * {
 * prev: 'left-single-arrow',
 * next: 'right-single-arrow',
 * prevYear: 'left-double-arrow',
 * nextYear: 'right-double-arrow'
 * }
 * This setting only takes affect when theme is false. If you want to change icons when theme is true, use themeButtonIcons instead.
 * <p>
 * A hash must be supplied that maps button names (from the header) to icon strings. These icon string are transformed into classNames which are styled by FullCalendar's CSS.
 * <p>
 * If a button does not have an entry, it falls back to using buttonText.
 * <p>
 * If you would prefer not to display any icons and would rather use buttonText instead, you can set the buttonIcons option to false.
 *
 * @author GedMarc
 * @since 04 Feb 2017
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)

public class FullCalendarHeaderButtonIcons
		extends JavaScriptPart<FullCalendarHeaderButtonIcons>
{


	/**
	 * The class name for the previous item icon
	 */
	private String prev;
	/**
	 * The class name for the next item icon
	 */
	private String next;
	/**
	 * The previous year icon class
	 */
	private String prevYear;
	/**
	 * The next year icon class
	 */
	private String nextYear;

	/**
	 * Constructs a new button icon configuration
	 */
	public FullCalendarHeaderButtonIcons()
	{
		//Nothing Needed
	}

	/**
	 * Gets the previous class icon
	 *
	 * @return
	 */
	public String getPrev()
	{
		return prev;
	}

	/**
	 * Sets the previous class icon
	 *
	 * @param prev
	 *
	 * @return
	 */
	public FullCalendarHeaderButtonIcons setPrev(String prev)
	{
		this.prev = prev;
		return this;
	}

	/**
	 * Gets the next class icon
	 *
	 * @return
	 */
	public String getNext()
	{
		return next;
	}

	/**
	 * Sets the next class icon
	 *
	 * @param next
	 *
	 * @return
	 */
	public FullCalendarHeaderButtonIcons setNext(String next)
	{
		this.next = next;
		return this;
	}

	/**
	 * Gets the previous year provider
	 *
	 * @return
	 */
	public String getPrevYear()
	{
		return prevYear;
	}

	/**
	 * Sets the previous year provider
	 *
	 * @param prevYear
	 *
	 * @return
	 */
	public FullCalendarHeaderButtonIcons setPrevYear(String prevYear)
	{
		this.prevYear = prevYear;
		return this;
	}

	/**
	 * Gets the next year class icon
	 *
	 * @return
	 */
	public String getNextYear()
	{
		return nextYear;
	}

	/**
	 * Sets the next year class icon
	 *
	 * @param nextYear
	 *
	 * @return
	 */
	public FullCalendarHeaderButtonIcons setNextYear(String nextYear)
	{
		this.nextYear = nextYear;
		return this;
	}

}
