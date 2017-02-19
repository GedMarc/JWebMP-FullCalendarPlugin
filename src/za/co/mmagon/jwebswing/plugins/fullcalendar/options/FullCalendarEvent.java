/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package za.co.mmagon.jwebswing.plugins.fullcalendar.options;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import za.co.mmagon.jwebswing.htmlbuilder.css.colours.ColourCSSImpl;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 *
 * @author GedMarc
 * @since 05 Feb 2017
 *
 */
public class FullCalendarEvent extends JavaScriptPart
{

    private static final long serialVersionUID = 1L;
    /**
     * String/Integer. Optional
     * <p>
     * Uniquely identifies the given event. Different instances of repeating events should all have the same id.
     */
    private String id;

    /**
     * String. Required.
     * <p>
     * The text on an event's element
     */
    private String title;

    /**
     * true or false. Optional.
     * <p>
     * Whether an event occurs at a specific time-of-day. This property affects whether an event's time is shown. Also, in the agenda views, determines if it is displayed in the "all-day" section.
     * If this value is not explicitly specified, allDayDefault will be used if it is defined.
     * <p>
     * If all else fails, FullCalendar will try to guess. If either the start or end value has a "T" as part of the ISO8601 date string, allDay will become false. Otherwise, it will be true.
     * <p>
     * Don't include quotes around your true/false. This value is a boolean, not a string!
     */
    private Boolean allDay;

    /**
     * The date/time an event begins. Required.
     * <p>
     * A Moment-ish input, like an ISO8601 string. Throughout the API this will become a real Moment object.
     */
    private Date start;

    /**
     * The exclusive date/time an event ends. Optional.
     * <p>
     * A Moment-ish input, like an ISO8601 string. Throughout the API this will become a real Moment object.
     * <p>
     * It is the moment immediately after the event has ended. For example, if the last full day of an event is Thursday, the exclusive end of the event will be 00:00:00 on Friday!
     */
    private Date end;

    /**
     * String/Array. Optional.
     * <p>
     * A CSS class (or array of classes) that will be attached to this event's element.
     */
    private List<String> className;

    /**
     * true or false. Optional.
     * <p>
     * Overrides the master editable option for this single event.
     */
    private Boolean editable;
    /**
     * true or false. Optional.
     * <p>
     * Overrides the master eventStartEditable option for this single event.
     */
    private Boolean startEditable;

    /**
     * true or false. Optional.
     * <p>
     * Overrides the master eventDurationEditable option for this single event.
     */
    private Boolean durationEditable;

    /**
     * true or false. Optional.
     * <p>
     * Overrides the master eventResourceEditable option for this single event.
     */
    private Boolean resourceEditable;

    /**
     * Allows alternate rendering of the event, like background events.
     * <p>
     * Can be empty, "background", or "inverse-background"
     */
    private FullCalendarEventRenderingOptions rendering;

    /**
     * true or false. Optional.
     * <p>
     * Overrides the master eventOverlap option for this single event.
     * <p>
     * If false, prevents this event from being dragged/resized over other events. Also prevents other events from being dragged/resized over this event.
     */
    private Boolean overlap;

    /**
     *
     * an event ID, "businessHours", object. Optional.
     * <p>
     * Overrides the master eventConstraint option for this single event.
     */
    private Serializable constraint;

    /**
     * Event Source Object. Automatically populated.
     * <p>
     * A reference to the event source that this event came from.
     */
    private Serializable source;

    /**
     * Sets an event's background and border color just like the calendar-wide eventColor option.
     */
    private ColourCSSImpl color;

    /**
     * Sets an event's background color just like the calendar-wide eventBackgroundColor option.
     */
    private ColourCSSImpl backgroundColor;

    /**
     * Sets an event's border color just like the the calendar-wide eventBorderColor option.
     */
    private ColourCSSImpl borderColor;

    /**
     * Sets an event's text color just like the calendar-wide eventTextColor option.
     */
    private ColourCSSImpl textColor;

    /**
     * String/Integer. Optional
     * <p>
     * Uniquely identifies the given event. Different instances of repeating events should all have the same id.
     */
    public String getId()
    {
        return id;
    }

    /**
     * String/Integer. Optional
     * <p>
     * Uniquely identifies the given event. Different instances of repeating events should all have the same id.
     */
    public FullCalendarEvent setId(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * String. Required.
     * <p>
     * The text on an event's element
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * String. Required.
     * <p>
     * The text on an event's element
     */
    public FullCalendarEvent setTitle(String title)
    {
        this.title = title;
        return this;
    }

    /**
     * true or false. Optional.
     * <p>
     * Whether an event occurs at a specific time-of-day. This property affects whether an event's time is shown. Also, in the agenda views, determines if it is displayed in the "all-day" section.
     * If this value is not explicitly specified, allDayDefault will be used if it is defined.
     * <p>
     * If all else fails, FullCalendar will try to guess. If either the start or end value has a "T" as part of the ISO8601 date string, allDay will become false. Otherwise, it will be true.
     * <p>
     * Don't include quotes around your true/false. This value is a boolean, not a string!
     */
    public Boolean getAllDay()
    {
        return allDay;
    }

    /**
     * true or false. Optional.
     * <p>
     * Whether an event occurs at a specific time-of-day. This property affects whether an event's time is shown. Also, in the agenda views, determines if it is displayed in the "all-day" section.
     * If this value is not explicitly specified, allDayDefault will be used if it is defined.
     * <p>
     * If all else fails, FullCalendar will try to guess. If either the start or end value has a "T" as part of the ISO8601 date string, allDay will become false. Otherwise, it will be true.
     * <p>
     * Don't include quotes around your true/false. This value is a boolean, not a string!
     */
    public FullCalendarEvent setAllDay(Boolean allDay)
    {
        this.allDay = allDay;
        return this;
    }

    /**
     * The date/time an event begins. Required.
     * <p>
     * A Moment-ish input, like an ISO8601 string. Throughout the API this will become a real Moment object.
     */
    public Date getStart()
    {
        return start;
    }

    /**
     * The date/time an event begins. Required.
     * <p>
     * A Moment-ish input, like an ISO8601 string. Throughout the API this will become a real Moment object.
     */
    public FullCalendarEvent setStart(Date start)
    {
        this.start = start;
        return this;
    }

    /**
     * The exclusive date/time an event ends. Optional.
     * <p>
     * A Moment-ish input, like an ISO8601 string. Throughout the API this will become a real Moment object.
     * <p>
     * It is the moment immediately after the event has ended. For example, if the last full day of an event is Thursday, the exclusive end of the event will be 00:00:00 on Friday!
     */
    public Date getEnd()
    {
        return end;
    }

    /**
     * The exclusive date/time an event ends. Optional.
     * <p>
     * A Moment-ish input, like an ISO8601 string. Throughout the API this will become a real Moment object.
     * <p>
     * It is the moment immediately after the event has ended. For example, if the last full day of an event is Thursday, the exclusive end of the event will be 00:00:00 on Friday!
     */
    public FullCalendarEvent setEnd(Date end)
    {
        this.end = end;
        return this;
    }

    /**
     * String/Array. Optional.
     * <p>
     * A CSS class (or array of classes) that will be attached to this event's element.
     */
    public List<String> getClassName()
    {
        if (className == null)
        {
            setClassName(new ArrayList<>());
        }
        return className;
    }

    /**
     * String/Array. Optional.
     * <p>
     * A CSS class (or array of classes) that will be attached to this event's element.
     */
    public FullCalendarEvent setClassName(List<String> className)
    {
        this.className = className;
        return this;
    }

    /**
     * true or false. Optional.
     * <p>
     * Overrides the master editable option for this single event.
     */
    public Boolean getEditable()
    {
        return editable;
    }

    /**
     * true or false. Optional.
     * <p>
     * Overrides the master editable option for this single event.
     */
    public FullCalendarEvent setEditable(Boolean editable)
    {
        this.editable = editable;
        return this;
    }

    /**
     * true or false. Optional.
     * <p>
     * Overrides the master eventStartEditable option for this single event.
     */
    public Boolean getStartEditable()
    {
        return startEditable;
    }

    /**
     * true or false. Optional.
     * <p>
     * Overrides the master eventStartEditable option for this single event.
     */
    public FullCalendarEvent setStartEditable(Boolean startEditable)
    {
        this.startEditable = startEditable;
        return this;
    }

    /**
     * true or false. Optional.
     * <p>
     * Overrides the master eventDurationEditable option for this single event.
     */
    public Boolean getDurationEditable()
    {
        return durationEditable;
    }

    /**
     * true or false. Optional.
     * <p>
     * Overrides the master eventDurationEditable option for this single event.
     */
    public FullCalendarEvent setDurationEditable(Boolean durationEditable)
    {
        this.durationEditable = durationEditable;
        return this;
    }

    /**
     * true or false. Optional.
     * <p>
     * Overrides the master eventResourceEditable option for this single event.
     */
    public Boolean getResourceEditable()
    {
        return resourceEditable;
    }

    /**
     * true or false. Optional.
     * <p>
     * Overrides the master eventResourceEditable option for this single event.
     */
    public FullCalendarEvent setResourceEditable(Boolean resourceEditable)
    {
        this.resourceEditable = resourceEditable;
        return this;
    }

    /**
     * Allows alternate rendering of the event, like background events.
     * <p>
     * Can be empty, "background", or "inverse-background"
     */
    public FullCalendarEventRenderingOptions getRendering()
    {
        return rendering;
    }

    /**
     * Allows alternate rendering of the event, like background events.
     * <p>
     * Can be empty, "background", or "inverse-background"
     */
    public FullCalendarEvent setRendering(FullCalendarEventRenderingOptions rendering)
    {
        this.rendering = rendering;
        return this;
    }

    /**
     * true or false. Optional.
     * <p>
     * Overrides the master eventOverlap option for this single event.
     * <p>
     * If false, prevents this event from being dragged/resized over other events. Also prevents other events from being dragged/resized over this event.
     */
    public Boolean getOverlap()
    {
        return overlap;
    }

    /**
     * true or false. Optional.
     * <p>
     * Overrides the master eventOverlap option for this single event.
     * <p>
     * If false, prevents this event from being dragged/resized over other events. Also prevents other events from being dragged/resized over this event.
     */
    public FullCalendarEvent setOverlap(Boolean overlap)
    {
        this.overlap = overlap;
        return this;
    }

    /**
     *
     * an event ID, "businessHours", object. Optional.
     * <p>
     * Overrides the master eventConstraint option for this single event.
     */
    public Serializable getConstraint()
    {
        return constraint;
    }

    /**
     *
     * an event ID, "businessHours", object. Optional.
     * <p>
     * Overrides the master eventConstraint option for this single event.
     */
    public FullCalendarEvent setConstraint(Serializable constraint)
    {
        this.constraint = constraint;
        return this;
    }

    /**
     * Event Source Object. Automatically populated.
     * <p>
     * A reference to the event source that this event came from.
     */
    public Serializable getSource()
    {
        return source;
    }

    /**
     * Event Source Object. Automatically populated.
     * <p>
     * A reference to the event source that this event came from.
     */
    public FullCalendarEvent setSource(Serializable source)
    {
        this.source = source;
        return this;
    }

    /**
     * Sets an event's background and border color just like the calendar-wide eventColor option.
     */
    public ColourCSSImpl getColor()
    {
        return color;
    }

    /**
     * Sets an event's background and border color just like the calendar-wide eventColor option.
     */
    public FullCalendarEvent setColor(ColourCSSImpl color)
    {
        this.color = color;
        return this;
    }

    /**
     * Sets an event's background color just like the calendar-wide eventBackgroundColor option.
     */
    public ColourCSSImpl getBackgroundColor()
    {
        return backgroundColor;
    }

    /**
     * Sets an event's background color just like the calendar-wide eventBackgroundColor option.
     */
    public FullCalendarEvent setBackgroundColor(ColourCSSImpl backgroundColor)
    {
        this.backgroundColor = backgroundColor;
        return this;
    }

    /**
     * Sets an event's border color just like the the calendar-wide eventBorderColor option.
     */
    public ColourCSSImpl getBorderColor()
    {
        return borderColor;
    }

    /**
     * Sets an event's border color just like the the calendar-wide eventBorderColor option.
     */
    public FullCalendarEvent setBorderColor(ColourCSSImpl borderColor)
    {
        this.borderColor = borderColor;
        return this;
    }

    /**
     * Sets an event's text color just like the calendar-wide eventTextColor option.
     */
    public ColourCSSImpl getTextColor()
    {
        return textColor;
    }

    /**
     * Sets an event's text color just like the calendar-wide eventTextColor option.
     */
    public FullCalendarEvent setTextColor(ColourCSSImpl textColor)
    {
        this.textColor = textColor;
        return this;
    }

}
