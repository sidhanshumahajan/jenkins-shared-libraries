def call(String SonarQubeAPI, String ProjectName, String ProjectKey){
  // withSonarQubeEnv("${SonarQubeAPI}"){
  //   sh "$SONAR_HOME/bin/sonar-scanner -Dsonar.projectName=${ProjectName} -Dsonar.projectKey=${ProjectKey} -X"
  // }
  def mvn = tool 'Default Maven';
    withSonarQubeEnv() {
      sh "${mvn}/bin/mvn clean verify sonar:sonar -Dsonar.projectKey=${ProjectKey}"
    }
}
