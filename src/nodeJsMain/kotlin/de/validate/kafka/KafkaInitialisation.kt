package de.validate.kafka

fun createConsumer(): dynamic {
    val options: KafkaConfig = js("({})")
    val consumerOptions: ConsumerConfig = js("({})")
    consumerOptions.groupId = "test-group"
    return Kafka(options).consumer(consumerOptions)
}

fun createProducer(): dynamic {
    val options: KafkaConfig = js("({})")
    return Kafka(options).producer()
}