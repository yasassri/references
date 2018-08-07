def emailBody = readFile "/home/ubuntu/tmp/build/SummarizedEmailReport.html"
emailext(to: 'yasassri@wso2.com',
subject: "'${env.JOB_NAME}' Integration Test Failure! #(${env.BUILD_NUMBER})",
body: "${emailBody}", mimeType: 'text/html', attachmentsPattern: "**/*.png"
);
