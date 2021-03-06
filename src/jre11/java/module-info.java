import com.jwebmp.plugins.fullcalendar.implementations.FullCalendarInclusionModule;

module com.jwebmp.plugins.fullcalendar {
	exports com.jwebmp.plugins.fullcalendar;
	exports com.jwebmp.plugins.fullcalendar.options;
	exports com.jwebmp.plugins.fullcalendar.options.enumerations;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;

	requires jakarta.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;
	requires com.fasterxml.jackson.databind;
	requires com.fasterxml.jackson.core;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.fullcalendar.FullCalendarPageConfigurator;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.fullcalendar.implementations.FullCalendarExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with FullCalendarInclusionModule;
	
	opens com.jwebmp.plugins.fullcalendar to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.fullcalendar.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.fullcalendar.options.enumerations to com.fasterxml.jackson.databind, com.jwebmp.core;
}
