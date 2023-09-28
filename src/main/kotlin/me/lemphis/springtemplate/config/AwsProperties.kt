package me.lemphis.springtemplate.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("aws.credentials")
data class AwsProperties(
	val accessKeyId: String,
	val secretAccessKey: String,
)
