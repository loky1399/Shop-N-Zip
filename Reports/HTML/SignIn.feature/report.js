$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Shop-N-Zip/Features/SignUp.feature");
formatter.feature({
  "id": "registration-to-shop-n-zip-application",
  "description": "\r\nAs a user I should be able to regiter to Shop N Zip application from wherever it is possible accross all the pages",
  "name": "Registration to Shop N Zip application",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verify-the-sign-up-button-is-displayed-in-header",
  "description": "",
  "name": "Verify the Sign Up button is displayed in header",
  "keyword": "Scenario",
  "line": 7,
  "type": "scenario",
  "comments": [
    {
      "value": "# Missed out writing field validations",
      "line": 5
    },
    {
      "value": "#Availability",
      "line": 6
    }
  ]
});
formatter.step({
  "name": "I am in home page of shopNzip",
  "keyword": "Given ",
  "line": 8
});
formatter.step({
  "name": "I should see \u0027Sign Up\u0027 button in header",
  "keyword": "Then ",
  "line": 9
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verify-the-sign-up-button-is-displayed-in-about-us-page",
  "description": "",
  "name": "Verify the Sign Up button is displayed in About us page",
  "keyword": "Scenario",
  "line": 11,
  "type": "scenario"
});
formatter.step({
  "name": "I am in About us page",
  "keyword": "Given ",
  "line": 12
});
formatter.step({
  "name": "I should see \u0027Sign Up\u0027 button",
  "keyword": "Then ",
  "line": 13
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verify-the-sign-up-button-is-not-displayed-in-about-us-page-(when-user-logged-in)",
  "description": "",
  "name": "Verify the Sign Up button is not displayed in About us page (when user logged in)",
  "keyword": "Scenario",
  "line": 15,
  "type": "scenario"
});
formatter.step({
  "name": "I am in About us page",
  "keyword": "Given ",
  "line": 16
});
formatter.step({
  "name": "I logged in",
  "keyword": "And ",
  "line": 17
});
formatter.step({
  "name": "I should not see the sign up button in the current page",
  "keyword": "Then ",
  "line": 18
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "SignIn_stepDef.i_logged_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verify-the-sign-up-button-is-displayed-in-faq-page",
  "description": "",
  "name": "Verify the Sign Up button is displayed in FAQ page",
  "keyword": "Scenario",
  "line": 20,
  "type": "scenario"
});
formatter.step({
  "name": "I am in FAQ page",
  "keyword": "Given ",
  "line": 21
});
formatter.step({
  "name": "I should see \u0027Sign Up\u0027 button",
  "keyword": "Then ",
  "line": 22
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verify-the-sign-up-button-is-not-displayed-in-faq-page-(when-user-logged-in)",
  "description": "",
  "name": "Verify the Sign Up button is not displayed in FAQ page (when user logged in)",
  "keyword": "Scenario",
  "line": 24,
  "type": "scenario"
});
formatter.step({
  "name": "I am in FAQ page",
  "keyword": "Given ",
  "line": 25
});
formatter.step({
  "name": "I logged in",
  "keyword": "And ",
  "line": 26
});
formatter.step({
  "name": "I should not see the sign up button in the current page",
  "keyword": "Then ",
  "line": 27
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "SignIn_stepDef.i_logged_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-sign-up-button-is-displayed-in-how-it-works-page",
  "description": "",
  "name": "Verifying the Sign Up button is displayed in How It Works page",
  "keyword": "Scenario",
  "line": 29,
  "type": "scenario"
});
formatter.step({
  "name": "I am in How It Works page",
  "keyword": "Given ",
  "line": 30
});
formatter.step({
  "name": "I should see \u0027Sign Up\u0027 button",
  "keyword": "Then ",
  "line": 31
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-sign-up-button-is-not-displayed-in-how-it-works-page-(when-user-logged-in)",
  "description": "",
  "name": "Verifying the Sign Up button is not displayed in How It Works page (when user logged in)",
  "keyword": "Scenario",
  "line": 33,
  "type": "scenario"
});
formatter.step({
  "name": "I am in How It Works page",
  "keyword": "Given ",
  "line": 34
});
formatter.step({
  "name": "I logged in",
  "keyword": "And ",
  "line": 35
});
formatter.step({
  "name": "I should not see the sign up button in the current page",
  "keyword": "Then ",
  "line": 36
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "SignIn_stepDef.i_logged_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-sign-up-button-is-displayed-in-shop-now-page",
  "description": "",
  "name": "Verifying the Sign Up button is displayed in Shop Now page",
  "keyword": "Scenario",
  "line": 38,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Shop Now page",
  "keyword": "Given ",
  "line": 39
});
formatter.step({
  "name": "I should see \u0027Sign Up\u0027 button",
  "keyword": "Then ",
  "line": 40
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-sign-up-button-is-not-displayed-in-shop-now-page-(when-user-logged-in)",
  "description": "",
  "name": "Verifying the Sign Up button is not displayed in Shop Now page (when user logged in)",
  "keyword": "Scenario",
  "line": 42,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Shop Now page",
  "keyword": "Given ",
  "line": 43
});
formatter.step({
  "name": "I logged in",
  "keyword": "And ",
  "line": 44
});
formatter.step({
  "name": "I should not see the sign up button in the current page",
  "keyword": "Then ",
  "line": 45
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "SignIn_stepDef.i_logged_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-sign-up-button-is-displayed-in-carousel-in-home-page",
  "description": "",
  "name": "Verifying the Sign Up button is displayed in Carousel in home page",
  "keyword": "Scenario",
  "line": 47,
  "type": "scenario"
});
formatter.step({
  "name": "I am in home page",
  "keyword": "Given ",
  "line": 48
});
formatter.step({
  "name": "I should see \u0027Sign Up\u0027 button",
  "keyword": "Then ",
  "line": 49
});
formatter.match({
  "location": "SignIn_stepDef.i_am_in_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-sign-up-button-is-not-displayed-in-carousel-in-home-page-(when-user-logged-in)",
  "description": "",
  "name": "Verifying the Sign Up button is not displayed in Carousel in home page (when user logged in)",
  "keyword": "Scenario",
  "line": 51,
  "type": "scenario"
});
formatter.step({
  "name": "I am in home page",
  "keyword": "Given ",
  "line": 52
});
formatter.step({
  "name": "I logged in",
  "keyword": "And ",
  "line": 53
});
formatter.step({
  "name": "I should not see the sign up button in the current page",
  "keyword": "Then ",
  "line": 54
});
formatter.match({
  "location": "SignIn_stepDef.i_am_in_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignIn_stepDef.i_logged_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verify-the-title-of-sign-up-form-as-\u0027or-creat-a-new-tfc-account!\u0027",
  "description": "",
  "name": "Verify the title of sign up form as \u0027Or Creat a new TFC account!\u0027",
  "keyword": "Scenario",
  "line": 56,
  "type": "scenario"
});
formatter.step({
  "name": "I am in home page",
  "keyword": "Given ",
  "line": 57
});
formatter.step({
  "name": "I should see \u0027Sign Up\u0027 button in header",
  "keyword": "And ",
  "line": 58
});
formatter.step({
  "name": "I click on \u0027Sign Up\u0027 button",
  "keyword": "When ",
  "line": 59
});
formatter.step({
  "name": "I should see \u0027Or Creat a new TFC account!\u0027 heading at Sign Up form",
  "keyword": "Then ",
  "line": 60
});
formatter.match({
  "location": "SignIn_stepDef.i_am_in_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-fields-in-sign-up-form",
  "description": "",
  "name": "Verifying the availability of fields in Sign Up form",
  "keyword": "Scenario Outline",
  "line": 62,
  "type": "scenario_outline"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 63
});
formatter.step({
  "name": "I should see \u003cField\u003e",
  "keyword": "Then ",
  "line": 64
});
formatter.examples({
  "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-fields-in-sign-up-form;",
  "description": "",
  "name": "",
  "keyword": "Examples",
  "line": 66,
  "rows": [
    {
      "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-fields-in-sign-up-form;;1",
      "cells": [
        "Field"
      ],
      "line": 67
    },
    {
      "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-fields-in-sign-up-form;;2",
      "cells": [
        "Name field"
      ],
      "line": 68
    },
    {
      "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-fields-in-sign-up-form;;3",
      "cells": [
        "Country of current residence drop down"
      ],
      "line": 69
    },
    {
      "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-fields-in-sign-up-form;;4",
      "cells": [
        "Email address field"
      ],
      "line": 70
    },
    {
      "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-fields-in-sign-up-form;;5",
      "cells": [
        "Phone number field"
      ],
      "line": 71
    },
    {
      "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-fields-in-sign-up-form;;6",
      "cells": [
        "Password field"
      ],
      "line": 72
    },
    {
      "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-fields-in-sign-up-form;;7",
      "cells": [
        "Re-type password field"
      ],
      "line": 73
    },
    {
      "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-fields-in-sign-up-form;;8",
      "cells": [
        "Address text field"
      ],
      "line": 74
    },
    {
      "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-fields-in-sign-up-form;;9",
      "cells": [
        "City text field"
      ],
      "line": 75
    },
    {
      "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-fields-in-sign-up-form;;10",
      "cells": [
        "State selection drop down"
      ],
      "line": 76
    },
    {
      "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-fields-in-sign-up-form;;11",
      "cells": [
        "Register Now button"
      ],
      "line": 77
    },
    {
      "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-fields-in-sign-up-form;;12",
      "cells": [
        "Agree check box"
      ],
      "line": 78
    },
    {
      "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-fields-in-sign-up-form;;13",
      "cells": [
        "Terms and condition link"
      ],
      "line": 79
    },
    {
      "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-fields-in-sign-up-form;;14",
      "cells": [
        "Privacy Policy link"
      ],
      "line": 80
    }
  ]
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-fields-in-sign-up-form;;2",
  "description": "",
  "name": "Verifying the availability of fields in Sign Up form",
  "keyword": "Scenario Outline",
  "line": 68,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 63
});
formatter.step({
  "name": "I should see Name field",
  "keyword": "Then ",
  "line": 64,
  "matchedColumns": [
    0
  ]
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-fields-in-sign-up-form;;3",
  "description": "",
  "name": "Verifying the availability of fields in Sign Up form",
  "keyword": "Scenario Outline",
  "line": 69,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 63
});
formatter.step({
  "name": "I should see Country of current residence drop down",
  "keyword": "Then ",
  "line": 64,
  "matchedColumns": [
    0
  ]
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-fields-in-sign-up-form;;4",
  "description": "",
  "name": "Verifying the availability of fields in Sign Up form",
  "keyword": "Scenario Outline",
  "line": 70,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 63
});
formatter.step({
  "name": "I should see Email address field",
  "keyword": "Then ",
  "line": 64,
  "matchedColumns": [
    0
  ]
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-fields-in-sign-up-form;;5",
  "description": "",
  "name": "Verifying the availability of fields in Sign Up form",
  "keyword": "Scenario Outline",
  "line": 71,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 63
});
formatter.step({
  "name": "I should see Phone number field",
  "keyword": "Then ",
  "line": 64,
  "matchedColumns": [
    0
  ]
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-fields-in-sign-up-form;;6",
  "description": "",
  "name": "Verifying the availability of fields in Sign Up form",
  "keyword": "Scenario Outline",
  "line": 72,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 63
});
formatter.step({
  "name": "I should see Password field",
  "keyword": "Then ",
  "line": 64,
  "matchedColumns": [
    0
  ]
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-fields-in-sign-up-form;;7",
  "description": "",
  "name": "Verifying the availability of fields in Sign Up form",
  "keyword": "Scenario Outline",
  "line": 73,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 63
});
formatter.step({
  "name": "I should see Re-type password field",
  "keyword": "Then ",
  "line": 64,
  "matchedColumns": [
    0
  ]
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-fields-in-sign-up-form;;8",
  "description": "",
  "name": "Verifying the availability of fields in Sign Up form",
  "keyword": "Scenario Outline",
  "line": 74,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 63
});
formatter.step({
  "name": "I should see Address text field",
  "keyword": "Then ",
  "line": 64,
  "matchedColumns": [
    0
  ]
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-fields-in-sign-up-form;;9",
  "description": "",
  "name": "Verifying the availability of fields in Sign Up form",
  "keyword": "Scenario Outline",
  "line": 75,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 63
});
formatter.step({
  "name": "I should see City text field",
  "keyword": "Then ",
  "line": 64,
  "matchedColumns": [
    0
  ]
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-fields-in-sign-up-form;;10",
  "description": "",
  "name": "Verifying the availability of fields in Sign Up form",
  "keyword": "Scenario Outline",
  "line": 76,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 63
});
formatter.step({
  "name": "I should see State selection drop down",
  "keyword": "Then ",
  "line": 64,
  "matchedColumns": [
    0
  ]
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-fields-in-sign-up-form;;11",
  "description": "",
  "name": "Verifying the availability of fields in Sign Up form",
  "keyword": "Scenario Outline",
  "line": 77,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 63
});
formatter.step({
  "name": "I should see Register Now button",
  "keyword": "Then ",
  "line": 64,
  "matchedColumns": [
    0
  ]
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-fields-in-sign-up-form;;12",
  "description": "",
  "name": "Verifying the availability of fields in Sign Up form",
  "keyword": "Scenario Outline",
  "line": 78,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 63
});
formatter.step({
  "name": "I should see Agree check box",
  "keyword": "Then ",
  "line": 64,
  "matchedColumns": [
    0
  ]
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-fields-in-sign-up-form;;13",
  "description": "",
  "name": "Verifying the availability of fields in Sign Up form",
  "keyword": "Scenario Outline",
  "line": 79,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 63
});
formatter.step({
  "name": "I should see Terms and condition link",
  "keyword": "Then ",
  "line": 64,
  "matchedColumns": [
    0
  ]
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-fields-in-sign-up-form;;14",
  "description": "",
  "name": "Verifying the availability of fields in Sign Up form",
  "keyword": "Scenario Outline",
  "line": 80,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 63
});
formatter.step({
  "name": "I should see Privacy Policy link",
  "keyword": "Then ",
  "line": 64,
  "matchedColumns": [
    0
  ]
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-mandatory-fields-in-sign-up-form",
  "description": "",
  "name": "Verifying the availability of mandatory fields in Sign Up form",
  "keyword": "Scenario Outline",
  "line": 82,
  "type": "scenario_outline"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 83
});
formatter.step({
  "name": "I should see \u003cField\u003e as mendatory",
  "keyword": "Then ",
  "line": 84
});
formatter.examples({
  "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-mandatory-fields-in-sign-up-form;",
  "description": "",
  "name": "",
  "keyword": "Examples",
  "line": 86,
  "rows": [
    {
      "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-mandatory-fields-in-sign-up-form;;1",
      "cells": [
        "Field"
      ],
      "line": 87
    },
    {
      "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-mandatory-fields-in-sign-up-form;;2",
      "cells": [
        "Name field"
      ],
      "line": 88
    },
    {
      "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-mandatory-fields-in-sign-up-form;;3",
      "cells": [
        "Country of current residence drop down"
      ],
      "line": 89
    },
    {
      "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-mandatory-fields-in-sign-up-form;;4",
      "cells": [
        "Email address field"
      ],
      "line": 90
    },
    {
      "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-mandatory-fields-in-sign-up-form;;5",
      "cells": [
        "Phone number field"
      ],
      "line": 91
    },
    {
      "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-mandatory-fields-in-sign-up-form;;6",
      "cells": [
        "Password field"
      ],
      "line": 92
    },
    {
      "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-mandatory-fields-in-sign-up-form;;7",
      "cells": [
        "Re-type password field"
      ],
      "line": 93
    }
  ]
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-mandatory-fields-in-sign-up-form;;2",
  "description": "",
  "name": "Verifying the availability of mandatory fields in Sign Up form",
  "keyword": "Scenario Outline",
  "line": 88,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 83
});
formatter.step({
  "name": "I should see Name field as mendatory",
  "keyword": "Then ",
  "line": 84,
  "matchedColumns": [
    0
  ]
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-mandatory-fields-in-sign-up-form;;3",
  "description": "",
  "name": "Verifying the availability of mandatory fields in Sign Up form",
  "keyword": "Scenario Outline",
  "line": 89,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 83
});
formatter.step({
  "name": "I should see Country of current residence drop down as mendatory",
  "keyword": "Then ",
  "line": 84,
  "matchedColumns": [
    0
  ]
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-mandatory-fields-in-sign-up-form;;4",
  "description": "",
  "name": "Verifying the availability of mandatory fields in Sign Up form",
  "keyword": "Scenario Outline",
  "line": 90,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 83
});
formatter.step({
  "name": "I should see Email address field as mendatory",
  "keyword": "Then ",
  "line": 84,
  "matchedColumns": [
    0
  ]
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-mandatory-fields-in-sign-up-form;;5",
  "description": "",
  "name": "Verifying the availability of mandatory fields in Sign Up form",
  "keyword": "Scenario Outline",
  "line": 91,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 83
});
formatter.step({
  "name": "I should see Phone number field as mendatory",
  "keyword": "Then ",
  "line": 84,
  "matchedColumns": [
    0
  ]
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-mandatory-fields-in-sign-up-form;;6",
  "description": "",
  "name": "Verifying the availability of mandatory fields in Sign Up form",
  "keyword": "Scenario Outline",
  "line": 92,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 83
});
formatter.step({
  "name": "I should see Password field as mendatory",
  "keyword": "Then ",
  "line": 84,
  "matchedColumns": [
    0
  ]
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-availability-of-mandatory-fields-in-sign-up-form;;7",
  "description": "",
  "name": "Verifying the availability of mandatory fields in Sign Up form",
  "keyword": "Scenario Outline",
  "line": 93,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 83
});
formatter.step({
  "name": "I should see Re-type password field as mendatory",
  "keyword": "Then ",
  "line": 84,
  "matchedColumns": [
    0
  ]
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "id": "registration-to-shop-n-zip-application;verify-functionality-of-sign-up-using-social-network-icons.",
  "description": "",
  "name": "Verify functionality of Sign Up using social network icons.",
  "keyword": "Scenario Outline",
  "line": 96,
  "type": "scenario_outline",
  "comments": [
    {
      "value": "#Possitive",
      "line": 95
    }
  ]
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 97
});
formatter.step({
  "name": "I clicked on \u003csocial network icon \u003e icon in signup page.",
  "keyword": "When ",
  "line": 98
});
formatter.step({
  "name": "I should see a pop for \u003csocial network icon \u003e login is appeared",
  "keyword": "Then ",
  "line": 99
});
formatter.step({
  "name": "I loged in with my \u003csignin with social network\u003e credintials",
  "keyword": "When ",
  "line": 100
});
formatter.step({
  "name": "I should see Name field in the sign up from is auto filled",
  "keyword": "Then ",
  "line": 101
});
formatter.step({
  "name": "I should see Country of current resident field in the sign up from is auto filled",
  "keyword": "And ",
  "line": 102
});
formatter.step({
  "name": "I should see Email Address field in the sign up from is auto filled",
  "keyword": "And ",
  "line": 103
});
formatter.step({
  "name": "I should see Phone Number field in the sign up from is auto filled",
  "keyword": "And ",
  "line": 104
});
formatter.examples({
  "id": "registration-to-shop-n-zip-application;verify-functionality-of-sign-up-using-social-network-icons.;",
  "description": "",
  "name": "",
  "keyword": "Examples",
  "line": 106,
  "rows": [
    {
      "id": "registration-to-shop-n-zip-application;verify-functionality-of-sign-up-using-social-network-icons.;;1",
      "cells": [
        "socila network icon",
        "signin with socila network"
      ],
      "line": 107
    },
    {
      "id": "registration-to-shop-n-zip-application;verify-functionality-of-sign-up-using-social-network-icons.;;2",
      "cells": [
        "Facebook",
        "Signin with facebook"
      ],
      "line": 108
    },
    {
      "id": "registration-to-shop-n-zip-application;verify-functionality-of-sign-up-using-social-network-icons.;;3",
      "cells": [
        "Twitter",
        "Signin with twitter"
      ],
      "line": 109
    },
    {
      "id": "registration-to-shop-n-zip-application;verify-functionality-of-sign-up-using-social-network-icons.;;4",
      "cells": [
        "Google+",
        "Signin with google+"
      ],
      "line": 110
    }
  ]
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verify-functionality-of-sign-up-using-social-network-icons.;;2",
  "description": "",
  "name": "Verify functionality of Sign Up using social network icons.",
  "keyword": "Scenario Outline",
  "line": 108,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 97
});
formatter.step({
  "name": "I clicked on \u003csocial network icon \u003e icon in signup page.",
  "keyword": "When ",
  "line": 98
});
formatter.step({
  "name": "I should see a pop for \u003csocial network icon \u003e login is appeared",
  "keyword": "Then ",
  "line": 99
});
formatter.step({
  "name": "I loged in with my \u003csignin with social network\u003e credintials",
  "keyword": "When ",
  "line": 100
});
formatter.step({
  "name": "I should see Name field in the sign up from is auto filled",
  "keyword": "Then ",
  "line": 101
});
formatter.step({
  "name": "I should see Country of current resident field in the sign up from is auto filled",
  "keyword": "And ",
  "line": 102
});
formatter.step({
  "name": "I should see Email Address field in the sign up from is auto filled",
  "keyword": "And ",
  "line": 103
});
formatter.step({
  "name": "I should see Phone Number field in the sign up from is auto filled",
  "keyword": "And ",
  "line": 104
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verify-functionality-of-sign-up-using-social-network-icons.;;3",
  "description": "",
  "name": "Verify functionality of Sign Up using social network icons.",
  "keyword": "Scenario Outline",
  "line": 109,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 97
});
formatter.step({
  "name": "I clicked on \u003csocial network icon \u003e icon in signup page.",
  "keyword": "When ",
  "line": 98
});
formatter.step({
  "name": "I should see a pop for \u003csocial network icon \u003e login is appeared",
  "keyword": "Then ",
  "line": 99
});
formatter.step({
  "name": "I loged in with my \u003csignin with social network\u003e credintials",
  "keyword": "When ",
  "line": 100
});
formatter.step({
  "name": "I should see Name field in the sign up from is auto filled",
  "keyword": "Then ",
  "line": 101
});
formatter.step({
  "name": "I should see Country of current resident field in the sign up from is auto filled",
  "keyword": "And ",
  "line": 102
});
formatter.step({
  "name": "I should see Email Address field in the sign up from is auto filled",
  "keyword": "And ",
  "line": 103
});
formatter.step({
  "name": "I should see Phone Number field in the sign up from is auto filled",
  "keyword": "And ",
  "line": 104
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verify-functionality-of-sign-up-using-social-network-icons.;;4",
  "description": "",
  "name": "Verify functionality of Sign Up using social network icons.",
  "keyword": "Scenario Outline",
  "line": 110,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 97
});
formatter.step({
  "name": "I clicked on \u003csocial network icon \u003e icon in signup page.",
  "keyword": "When ",
  "line": 98
});
formatter.step({
  "name": "I should see a pop for \u003csocial network icon \u003e login is appeared",
  "keyword": "Then ",
  "line": 99
});
formatter.step({
  "name": "I loged in with my \u003csignin with social network\u003e credintials",
  "keyword": "When ",
  "line": 100
});
formatter.step({
  "name": "I should see Name field in the sign up from is auto filled",
  "keyword": "Then ",
  "line": 101
});
formatter.step({
  "name": "I should see Country of current resident field in the sign up from is auto filled",
  "keyword": "And ",
  "line": 102
});
formatter.step({
  "name": "I should see Email Address field in the sign up from is auto filled",
  "keyword": "And ",
  "line": 103
});
formatter.step({
  "name": "I should see Phone Number field in the sign up from is auto filled",
  "keyword": "And ",
  "line": 104
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-functionality-of-sign-up(with-valid-details)",
  "description": "",
  "name": "Verifying the functionality of Sign Up(with valid details)",
  "keyword": "Scenario",
  "line": 112,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 113
});
formatter.step({
  "name": "Registered with valid details",
  "keyword": "And ",
  "line": 114
});
formatter.step({
  "name": "I should see Registration is successful",
  "keyword": "Then ",
  "line": 115
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verify-the-\u0027welcome\u0027-pop-up-after-successful-sign-up",
  "description": "",
  "name": "verify the \u0027welcome\u0027 pop up after successful sign up",
  "keyword": "Scenario",
  "line": 117,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 118
});
formatter.step({
  "name": "I completed sign up",
  "keyword": "And ",
  "line": 119
});
formatter.step({
  "name": "I should see a welcome pop up",
  "keyword": "Then ",
  "line": 120
});
formatter.step({
  "name": "I should see \u0027Thank you for registering with us\u0027 text along with User name",
  "keyword": "And ",
  "line": 121
});
formatter.step({
  "name": "I should see \u0027Your shop N zip ID\u0027 text along with ID",
  "keyword": "And ",
  "line": 122
});
formatter.step({
  "name": "I should see \u0027Your Shop N Zip address\u0027 text along with shop N zip US location address",
  "keyword": "And ",
  "line": 123
});
formatter.step({
  "name": "I should see \u0027Start shopping\u0027 button",
  "keyword": "And ",
  "line": 124
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "SignIn_stepDef.i_should_see_Your_shop_N_zip_ID_text_along_with_ID(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignIn_stepDef.i_should_see_Your_Shop_N_Zip_address_text_along_with_shop_N_zip_US_location_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verify-the-sign-in-verification-link-exipre-time",
  "description": "",
  "name": "Verify the Sign In verification link exipre time",
  "keyword": "Scenario",
  "line": 126,
  "type": "scenario"
});
formatter.step({
  "name": "I am in sign up page",
  "keyword": "Given ",
  "line": 127
});
formatter.step({
  "name": "I completed sign up",
  "keyword": "And ",
  "line": 128
});
formatter.step({
  "name": "I should get verification link to the specified email address",
  "keyword": "Then ",
  "line": 129
});
formatter.step({
  "name": "It should be valid upto one year",
  "keyword": "And ",
  "line": 130
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verify-the-sign-in-verification-link-functionality",
  "description": "",
  "name": "verify the Sign in verification link functionality",
  "keyword": "Scenario",
  "line": 132,
  "type": "scenario"
});
formatter.step({
  "name": "I am in sign up page",
  "keyword": "Given ",
  "line": 133
});
formatter.step({
  "name": "I completed sign up",
  "keyword": "And ",
  "line": 134
});
formatter.step({
  "name": "I should get verification link to the specified email address",
  "keyword": "Then ",
  "line": 135
});
formatter.step({
  "name": "I click on the verifiction link",
  "keyword": "When ",
  "line": 136
});
formatter.step({
  "name": "I should be navigated to shop N zip application",
  "keyword": "Then ",
  "line": 137
});
formatter.step({
  "name": "I should see verification is successful",
  "keyword": "And ",
  "line": 138
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verify-the-sign-in-verification-link-functionality(of-verified-link)",
  "description": "",
  "name": "verify the Sign in verification link functionality(of verified link)",
  "keyword": "Scenario",
  "line": 140,
  "type": "scenario"
});
formatter.step({
  "name": "I am in sign up page",
  "keyword": "Given ",
  "line": 141
});
formatter.step({
  "name": "I completed sign up",
  "keyword": "And ",
  "line": 142
});
formatter.step({
  "name": "I should get verification link to the specified email address",
  "keyword": "Then ",
  "line": 143
});
formatter.step({
  "name": "I click on the verifiction link",
  "keyword": "When ",
  "line": 144
});
formatter.step({
  "name": "I should be navigated to shop N zip application",
  "keyword": "Then ",
  "line": 145
});
formatter.step({
  "name": "I should see verification is successful",
  "keyword": "And ",
  "line": 146
});
formatter.step({
  "name": "I logged out",
  "keyword": "When ",
  "line": 147
});
formatter.step({
  "name": "click on same verficatoin link again in email",
  "keyword": "And ",
  "line": 148
});
formatter.step({
  "name": "I should be redirected to shop n zip application",
  "keyword": "Then ",
  "line": 149
});
formatter.step({
  "name": "I should see a message saying \u0027Your email is already been verified\u0027",
  "keyword": "And ",
  "line": 150
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verify-the-sign-in-verification-link-functionality(of-not-a-verified-link-after-one-year)",
  "description": "",
  "name": "verify the Sign in verification link functionality(of not a verified link after one year)",
  "keyword": "Scenario",
  "line": 153,
  "type": "scenario"
});
formatter.step({
  "name": "I am in sign up page",
  "keyword": "Given ",
  "line": 154
});
formatter.step({
  "name": "I completed sign up",
  "keyword": "And ",
  "line": 155
});
formatter.step({
  "name": "I should get verification link to the specified email address",
  "keyword": "Then ",
  "line": 156
});
formatter.step({
  "name": "I click on verficatoin link in email after one year",
  "keyword": "When ",
  "line": 157
});
formatter.step({
  "name": "I should be redirected to shop n zip application",
  "keyword": "Then ",
  "line": 158
});
formatter.step({
  "name": "I should see a message saying \u0027Your link is either incorrect or expired\u0027",
  "keyword": "And ",
  "line": 159
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-functionality-of-sign-up-(without-entering-any-of-the-fields)",
  "description": "",
  "name": "Verifying the functionality of Sign Up (without Entering any of the fields)",
  "keyword": "Scenario",
  "line": 161,
  "type": "scenario",
  "comments": [
    {
      "value": "#Negative",
      "line": 160
    }
  ]
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 162
});
formatter.step({
  "name": "I clicked on \u0027Register now\u0027 button",
  "keyword": "And ",
  "line": 163
});
formatter.step({
  "name": "it should see registration is unsuccessful",
  "keyword": "Then ",
  "line": 164
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-functionality-of-sign-up-(without-entering-details-to-name-field)",
  "description": "",
  "name": "Verifying the functionality of Sign Up (without Entering details to Name field)",
  "keyword": "Scenario",
  "line": 166,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 167
});
formatter.step({
  "name": "I tried to Registered without giving details to Name field",
  "keyword": "And ",
  "line": 168
});
formatter.step({
  "name": "I should see registration is unsuccessful",
  "keyword": "Then ",
  "line": 169
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-functionality-of-sign-up-(without-selecting-anything-in-country-of-current-residence-field)",
  "description": "",
  "name": "Verifying the functionality of Sign Up (without selecting anything in Country of current residence field)",
  "keyword": "Scenario",
  "line": 171,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 172
});
formatter.step({
  "name": "I tried to Registered without selecting anything in Country of current residence field",
  "keyword": "And ",
  "line": 173
});
formatter.step({
  "name": "I should see registration is unsuccessful",
  "keyword": "Then ",
  "line": 174,
  "rows": [
    {
      "line": 175
    }
  ]
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-functionality-of-sign-up-(without-entering-details-to-email-address-field)",
  "description": "",
  "name": "Verifying the functionality of Sign Up (without Entering details to Email Address field)",
  "keyword": "Scenario",
  "line": 177,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 178
});
formatter.step({
  "name": "I tried to Registered without giving details to Email Address field",
  "keyword": "And ",
  "line": 179
});
formatter.step({
  "name": "I should see registration is unsuccessful",
  "keyword": "Then ",
  "line": 180
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-functionality-of-sign-up-(without-entering-details-to-phone-number-field)",
  "description": "",
  "name": "Verifying the functionality of Sign Up (without Entering details to Phone Number field)",
  "keyword": "Scenario",
  "line": 182,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 183
});
formatter.step({
  "name": "I tried to Registered without giving details to Phone Number field",
  "keyword": "And ",
  "line": 184
});
formatter.step({
  "name": "I should see registration is unsuccessful",
  "keyword": "Then ",
  "line": 185
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-functionality-of-sign-up-(without-entering-details-to-password-field)",
  "description": "",
  "name": "Verifying the functionality of Sign Up (without Entering details to Password field)",
  "keyword": "Scenario",
  "line": 187,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 188
});
formatter.step({
  "name": "I tried to Registered without giving details to Password field",
  "keyword": "And ",
  "line": 189
});
formatter.step({
  "name": "I should see registration is unsuccessful",
  "keyword": "Then ",
  "line": 190
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-functionality-of-sign-up-(without-entering-details-to-re-type-password-field)",
  "description": "",
  "name": "Verifying the functionality of Sign Up (without Entering details to re-type Password field)",
  "keyword": "Scenario",
  "line": 192,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 193
});
formatter.step({
  "name": "I tried to Registered without giving details to re-type Password field",
  "keyword": "And ",
  "line": 194
});
formatter.step({
  "name": "I should see registration is unsuccessful",
  "keyword": "Then ",
  "line": 195
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "registration-to-shop-n-zip-application;verifying-the-functionality-of-sign-up-(click-on-sign-up-button-without-user-details)",
  "description": "",
  "name": "Verifying the functionality of Sign Up (Click on sign up button without user details)",
  "keyword": "Scenario",
  "line": 197,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Sign Up page",
  "keyword": "Given ",
  "line": 198
});
formatter.step({
  "name": "I Click on sign up button",
  "keyword": "And ",
  "line": 199
});
formatter.step({
  "name": "I should see registration is unsuccessful",
  "keyword": "Then ",
  "line": 200
});
formatter.step({
  "name": "I should see the validation messages are displayed",
  "keyword": "And ",
  "line": 201
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});