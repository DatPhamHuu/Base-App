package com.wdx.data.entities

import com.wdx.domain.entities.ConfigurationEntity
import com.wdx.domain.entities.ConfigurationResponseEntity
import com.wdx.domain.entities.FeatureEntity

class ConfigurationResponseData(
    val success: Boolean = false,
    val result: ConfigurationData? = null,
    var message: String = ""
)

data class ConfigurationData(

    var id: String? = null,
    var email: String? = null,
    var supportPhoneNumber: String? = null,
    var termAndCondition: String? = null,
    var privacy: String? = null,
    var FAQ: String? = null,
    var feature: FeatureData? = null

)

data class FeatureData(

    var upcommingPlan: Boolean = false,
    var rentalFeedback: Boolean = false,
    var singPassSignUp: Boolean = false,
    var customerFeedback: Boolean = false,
    var subscriptionUpgrade: Boolean = false,
    var subscriptionCancellation: Boolean = false
)

fun ConfigurationResponseData.mapToEntity() = ConfigurationResponseEntity(
    success,
    result?.mapToEntity(),
    message
)

fun ConfigurationData.mapToEntity() =
    ConfigurationEntity(
        id,
        email,
        supportPhoneNumber,
        termAndCondition,
        privacy,
        FAQ,
        feature?.mapToEntity()
    )

fun FeatureData.mapToEntity() = FeatureEntity(
    upcommingPlan,
    rentalFeedback,
    singPassSignUp,
    customerFeedback,
    subscriptionUpgrade,
    subscriptionCancellation
)