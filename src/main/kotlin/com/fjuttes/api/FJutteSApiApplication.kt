package com.fjuttes.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@Suppress("SpellCheckingInspection")
@SpringBootApplication
class FJutteSApiApplication

fun main(args: Array<String>) {
	System.setProperty("server.port", "8080")
	System.setProperty("spring.docker.compose.readiness.timeout", "PT5M")
	runApplication<FJutteSApiApplication>(*args)
}

@RestController
class GreetingController {

	@GetMapping("/get-greeting/query")
	fun getGreetingByQuery(
		@RequestParam(
			name = "name", required = false, defaultValue = "world"
		) name: String
	) = GreetingResponse(
		datetime = LocalDateTime.now().toString(),
		message = "Hello, $name!"
	)

	@GetMapping("/")
	fun rootReq() = mapOf("message" to "Hello, world!")

	@GetMapping("/hello")
	fun rootH() = "HELLO WORLD"
}

data class GreetingResponse(
	val datetime: String,
	val message: String,
)