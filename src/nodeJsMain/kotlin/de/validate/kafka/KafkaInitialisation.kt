package de.validate.kafka

fun createConsumer(): dynamic {
    val options: ConsumerOptions = js("({})")
    options.groupID = "test-group"
    return Kafka.consumer(options)
}
fun createProducer(): dynamic {
    return Kafka.producer()
}
