def call(String SonarQubeAPI, String ProjectName, String ProjectKey){
  // withSonarQubeEnv("${SonarQubeAPI}"){
  //   sh "$SONAR_HOME/bin/sonar-scanner -Dsonar.projectName=${ProjectName} -Dsonar.projectKey=${ProjectKey} -X"
  // }
    withSonarQubeEnv() {
      sh "mvn clean verify sonar:sonar -Dsonar.projectKey=${ProjectKey} -Dsonar.host.url=http://localhost:9000"
    }
}
