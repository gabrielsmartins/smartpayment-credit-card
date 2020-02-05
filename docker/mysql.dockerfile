FROM mysql/mysql-server:5.7
ENV MYSQL_ROOT_PASSWORD=12345
ENV MYSQL_DATABASE=creditcarddb
ENV MYSQL_USER=root
ENV MYSQL_PASSWORD=12345

# Create Database
# Add the content of the sql-scripts/ directory to your image
# All scripts in docker-entrypoint-initdb.d/ are automatically
# executed during container startup
COPY ./docker/sql-scripts/ /docker-entrypoint-initdb.d/
