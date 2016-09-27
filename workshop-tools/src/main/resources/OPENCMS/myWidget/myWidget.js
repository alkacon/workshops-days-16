function initializeMyWidget(){
	return {
		"getElement": function(){}, // returns the widget DOM element
		"getValue": function(){}, // returns the widget value
		"isActive": function(){}, // returns whether the widget is set active
		"onAttachWidget": function(){}, // called once the widget element is attached to the DOM
		"setActive": function(isActive){}, // sets the widget active / deactivated
		"setValue": function(value, fireEvent){}, // sets the widget value and optionally fires the value change event
		"setWidgetInfo": function(label, help){} // sets the widget label and help text
		
		// the functions onChangeCommand and onFocusCommand will be added to the widget object on initialization
		// call them on value change and on focus to notify the editor
	}
}
