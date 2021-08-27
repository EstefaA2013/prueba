pipeline{
    agent any
    options {
      timestamps()
    }

    environment {
      PATH_SONAR = tool"sonarqube-scanner"
      PROJECT_KEY = "estefania-aguirre" // http://sonarq.ingeneoext.co/dashboard?id=estefania-aguirre
      EXCLUSIONS = "**/util/**,**/utils/**"  
      SOURCES = "./"
      BINARIES = "./src/main"
      SOURCES_TEST = "./src/test"
      TO = "jesus.matiz@ingeneo.com.co"
    } 

    stages{
        stage("Code analysis") {
          steps {
            withSonarQubeEnv("sonarqube-server") {
              sh "${PATH_SONAR}/bin/sonar-scanner \
              -Dsonar.projectKey=${PROJECT_KEY} \
              -Dsonar.projectVersion=1 \
              -Dsonar.scm.disabled=true \
              -Dsonar.exclusions=${EXCLUSIONS} \
              -Dsonar.sources=${SOURCES} \
              -Dsonar.java.test.binaries=${SOURCES_TEST} \
              -Dsonar.java.binaries=${BINARIES} \
              -Dsonar.java.libraries=$HOME/.m2/**/*.jar \
              -Dsonar.sourceEncoding=UTF-8"
            }                       
          }
        }
        stage ("Quality Gate") {
          steps {

            echo "Esperando por los resultados de SonarQube..."
            sleep 10
            
            script {

              def dg = waitForQualityGate(); 
              def msg = "Metricas de calidad: ${dg.status}";

              if (dg.status != 'OK') {
                error msg
              } else {
                echo msg
              }
            }
          }
        }
    }
    post{
        success {
        echo "Excelente trabajo"
        emailext body: "El analisis del código ha sido exitoso, felicitaciones!!",
        subject: "${env.JOB_NAME} | build: ${env.BUILD_NUMBER} - SUCCESS",
        to: "${TO}",
        recipientProviders: [[$class: 'CulpritsRecipientProvider'], [$class: 'RequesterRecipientProvider']]
      }
      failure {
        echo "Fallo el proceso"
        emailext body: "Se ha presentando un error en el analisis, por favor verifica el log para obtener mas información",
        subject: "${env.JOB_NAME} | build: ${env.BUILD_NUMBER} - Failed",
        to: "${TO}",
        attachLog: true,
        recipientProviders: [[$class: 'CulpritsRecipientProvider'], [$class: 'RequesterRecipientProvider']]
      }
    }
}