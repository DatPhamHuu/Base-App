package com.wdx.domain.entities

class ConfigurationResponseEntity(
    val success: Boolean = false,
    val result: ConfigurationEntity? = null,
    var message: String = ""
)

data class ConfigurationEntity(

    var id: String? = null, var email: String? = null,
    var supportPhoneNumber: String? = null,
    var termAndCondition: String? = null,
    var privacy: String? = null,
    var FAQ: String? = null,
    var feature: FeatureEntity? = null

)

data class FeatureEntity(

    var upcommingPlan: Boolean = false,
    var rentalFeedback: Boolean = false,
    var singPassSignUp: Boolean = false,
    var customerFeedback: Boolean = false,
    var subscriptionUpgrade: Boolean = false,
    var subscriptionCancellation: Boolean = false

)