package me.lemphis.springtemplate

import me.lemphis.springtemplate.config.AwsProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@EnableConfigurationProperties(AwsProperties::class)
@SpringBootApplication
class SpringTemplateApplication

fun main(args: Array<String>) {
	runApplication<SpringTemplateApplication>(*args)
}
