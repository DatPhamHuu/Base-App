package com.wdx.app.mapper

import com.wdx.app.models.Configuration
import com.wdx.app.models.ConfigurationResponse
import com.wdx.app.models.Feature
import com.wdx.domain.entities.ConfigurationEntity
import com.wdx.domain.entities.ConfigurationResponseEntity
import com.wdx.domain.entities.FeatureEntity

fun ConfigurationResponseEntity.mapToModel() = ConfigurationResponse(
    success,
    result?.mapToModel(),
    message
)

fun ConfigurationEntity.mapToModel() = Configuration(
    id,
    email,
    supportPhoneNumber,
    termAndCondition,
    privacy,
    FAQ,
    feature?.mapToModel()
)

fun FeatureEntity.mapToModel() = Feature(
    upcommingPlan,
    rentalFeedback,
    singPassSignUp,
    customerFeedback,
    subscriptionUpgrade,
    subscriptionCancellation
)