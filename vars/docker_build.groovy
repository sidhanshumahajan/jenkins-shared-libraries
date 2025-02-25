def build(String projectName, String version) {
  sh "docker build -t ${projectName}:${version} ."
}
