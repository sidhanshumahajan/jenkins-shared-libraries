def call(){
  timeout(time: 1,  unit: "MINUTES"){
    waitForQualityGate webhookSecretId: 'my-spring-app', abortPipeline: true
  }
}
