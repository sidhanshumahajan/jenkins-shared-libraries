def call(String projectName, String version) {
  sh "docker build -t ${projectName}:${version} ."
}
