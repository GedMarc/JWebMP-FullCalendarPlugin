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
package com.jwebmp.plugins.fullcalendar.options.enumerations;

import com.jwebmp.plugins.fullcalendar.options.toolbars.IFullCalendarHeaderToolbarButton;

import static com.guicedee.services.jsonrepresentation.json.StaticStrings.STRING_SPACE;


/**
 * @author GedMarc
 * @since 04 Feb 2017
 */
public enum FullCalendarHeaderParts implements IFullCalendarHeaderToolbarButton<FullCalendarHeaderParts>
{
    /**
     * text containing the current month/week/day
     */
    title,
    /**
     * button for moving the calendar back one month/week/day
     */
    prev,
    /**
     * button for moving the calendar forward one month/week/day
     */
    next,
    /**
     * button for moving the calendar back on year
     */
    prevYear,
    /**
     * button for moving the calendar forward one year
     */
    nextYear,
    /**
     * button for moving the calendar to the current month/week/day
     */
    today,
    /**
     * A space between
     */
    space,
    /**
     * A month button to be shown
     */
    month,
    /**
     * The agenda week to be shown
     */
    agendaWeek,
    /**
     * The agenda day to be shown
     */
    agendaDay,
    /**
     * The list week to be shown
     */
    listWeek;

    /**
     * Any data for this enumeration
     */
    private String data;

    FullCalendarHeaderParts()
    {
        //Nothing needed
    }

    /**
     * Returns the data of this enum
     *
     * @return
     */
    public String getData()
    {
        return this.data;
    }

    /**
     * Sets the data of this enumeration
     *
     * @param data
     * @return
     */
    public FullCalendarHeaderParts setData(String data)
    {
        this.data = data;
        return this;
    }

    /**
     * returns the name
     *
     * @return
     */
    @Override
    public String toString()
    {
        if (this == space)
        {
            return STRING_SPACE;
        }
        return name();
    }
}
