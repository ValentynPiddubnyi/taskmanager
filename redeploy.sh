mvn clean install
sudo service tomcat7 stop
sudo rm -Rf /var/lib/tomcat7/webapps/*
sudo cp web/target/task.war /var/lib/tomcat7/webapps/
sudo service tomcat7 start
