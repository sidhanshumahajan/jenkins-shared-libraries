def call(String dockerhubuser,String projectName, String version) {
  sh "docker run -d -p 8081:8080 ${dockerhubuser}/${projectName}:${version} ."
}
