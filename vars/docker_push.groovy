def call(String dockerhubuserName, String ProjectName, String ImageTag) {
      withCredentials([usernamePassword(credentialsId: 'dockerHubCred', passwordVariable: 'dockerHubPwd', usernameVariable: 'dockerHubUserName')]) {
      sh "docker login -u ${env.dockerHubUserName}  -p ${env.dockerHubPwd}"
      // sh "docker image tag my-spring-app:${formattedDate} ${env.dockerHubUserName}/my-spring-app:${formattedDate}"
    }
      sh "docker push ${dockerhubuserName}/${ProjectName}:${ImageTag}"
}
