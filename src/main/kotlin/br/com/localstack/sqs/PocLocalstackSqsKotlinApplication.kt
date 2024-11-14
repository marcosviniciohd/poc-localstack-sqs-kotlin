package br.com.localstack.sqs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PocLocalstackSqsKotlinApplication

fun main(args: Array<String>) {
    runApplication<PocLocalstackSqsKotlinApplication>(*args)
}
