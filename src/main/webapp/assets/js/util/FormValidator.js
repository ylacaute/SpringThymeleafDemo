
// ------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------
// FORM VALIDATOR
// ------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------
var FormValidator = (function () {
	"use strict";
	
	// PRIVATE

	return {
		
		// PUBLIC
		
		resetValidation : function(input) {
			input.setCustomValidity("");
		},
		
		validate : function(input, emptyMsg, invalidMsg) {
			if (input.willValidate) {
				if (input.value == "") {
	            	input.setCustomValidity(emptyMsg);
	            } else {
	            	input.setCustomValidity(invalidMsg);
	            }
			}
		},
	}

})();
