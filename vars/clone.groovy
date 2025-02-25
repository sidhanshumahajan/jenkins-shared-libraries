def call(String gitURL, String branch) {
   echo "Clonning the code...."
   git branch: "${branch}", url: "${gitURL}"
   echo "Succesfully Cloned the code...."
}
