def call(String dockerhubuser,String projectName, String version) {
  sh "docker build -t ${dockerhubuser}/${projectName}:${version} ."
}
