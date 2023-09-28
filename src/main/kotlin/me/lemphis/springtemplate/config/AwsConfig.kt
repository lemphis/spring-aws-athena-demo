package me.lemphis.springtemplate.config

import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider
import software.amazon.awssdk.regions.Region
import software.amazon.awssdk.services.athena.AthenaClient
import software.amazon.awssdk.services.s3.S3Client

@Component
class AwsConfig(
	awsProperties: AwsProperties,
) {

	private val credentials = AwsBasicCredentials.create(awsProperties.accessKeyId, awsProperties.secretAccessKey)
	private val credentialsProvider = StaticCredentialsProvider.create(credentials)
	private val region = Region.AP_NORTHEAST_2

	@Bean
	fun s3Client(): S3Client = S3Client.builder()
		.region(region)
		.credentialsProvider(credentialsProvider)
		.build()

	@Bean
	fun athenaClient(): AthenaClient = AthenaClient.builder()
		.region(region)
		.credentialsProvider(credentialsProvider)
		.build()

}
