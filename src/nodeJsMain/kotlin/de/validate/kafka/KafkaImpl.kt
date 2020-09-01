@file:JsModule("kafkajs") // file: is important!
package de.validate.kafka

external object Kafka {
    fun producer(): dynamic
    fun consumer(options: ConsumerOptions): dynamic
}

external interface ConsumerOptions {
    var groupID: String
}
