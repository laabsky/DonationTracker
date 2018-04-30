$(init);

function init() {

    //add validator for letters only
    jQuery.validator.addMethod("letters", function (value, element) {
        return this.optional(element) || value == value.match(/^[a-zA-Z]+$/);
    }, "Only letters allowed!");

    //validator parameters
    var myRules =
        {
            firstName:				// The "name" attribute of the form control
                {
                    required: true,
                    letters: true
                },
            lastName:				// The "name" attribute of the form control
                {
                    required: true,
                    letters: true
                },

            password:				// The "name" attribute of the form control
                {
                    required: true
                },

            userName:				// The "name" attribute of the form control
                {
                    required: true
                },

            email:				// The "name" attribute of the form control
                {
                    required: true,
                    email: true
                },

            description:				// The "name" attribute of the form control
                {
                    required: true
                },

            amount:				// The "name" attribute of the form control
                {
                    required: true,
                    digits: true
                },

            date:				// The "name" attribute of the form control
                {
                    required: true,
                    date: true
                }

        };

    // Object containing the error messages
    var myMessages =
        {

            firstName:				// The "name" attribute of the form control
                {
                    required: "This box is required",
                    letters: "Letters Only!"
                },
            lastName:				// The "name" attribute of the form control
                {
                    required: "This box is required",
                    letters: "Letters Only!"
                },

            email:				// The "name" attribute of the form control
                {
                    required: "This box is required",
                    email: "Must be a valid email address (xxxxx@xxxx.xxxx)"
                },
            password:				// The "name" attribute of the form control
                {
                    required: "This box is required"
                },

            userName:				// The "name" attribute of the form control
                {
                    required: "This box is required"
                },

            description:				// The "name" attribute of the form control
                {
                    required: "This box is required"
                },

            amount:				// The "name" attribute of the form control
                {
                    required: "This box is required",
                    digits: "Numbers only!"
                },

            date:				// The "name" attribute of the form control
                {
                    required: "This box is required",
                    date: "Must be in date format (YYYY/MM/DD)"
                }

        };

    // Object containing the entire validation configuration
    var config =
        {
            submitHandler: $("#validate").submit(),	// The function to run if validation succeeds
            rules: myRules,					// The validation rules, defined above
            messages: myMessages			// The error messages, defined above
        };

    // Pass the config object to the form's validate() method
    $("#validate").validate(config);
}