const myKafka = require('./build/js/packages/callJSLib-nodeJs').de.validate.kafka;

async function testCall() {
  const producer = myKafka.createProducer();
  console.log("producer call is working");
}
testCall();
