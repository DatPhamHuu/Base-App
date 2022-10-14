package com.du21.basewdx.models

import com.google.gson.annotations.SerializedName

class ConfigurationResponse(
    val success: Boolean = false,
    val result: Configuration? = null,
    var message: String = ""
)

data class Configuration(

    var id: String? = null, var email: String? = null,
    var supportPhoneNumber: String? = null,
    var termAndCondition: String? = null,
    var privacy: String? = null,
    var FAQ: String? = null,
    var feature: Feature? = null

)

data class Feature(

    var upcommingPlan: Boolean = false,
    var rentalFeedback: Boolean = false,
    var singPassSignUp: Boolean = false,
    var customerFeedback: Boolean = false,
    var subscriptionUpgrade: Boolean = false,
    var subscriptionCancellation: Boolean = false

)