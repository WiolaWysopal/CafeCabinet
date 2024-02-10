# Use the official MySQL image as the base image
FROM mysql:latest

# Set environment variables for MySQL
ENV MYSQL_DATABASE CafeDB
ENV MYSQL_USER wiola
ENV MYSQL_PASSWORD cafedb
# Set the root password
ENV MYSQL_ROOT_PASSWORD rootpassword

EXPOSE 3306

# Copy SQL scripts to the /docker-entrypoint-initdb.d/ directory in the container
# MySQL executes scripts in alphabetical/numerical order, so prefixes are used to control the order
COPY dbinit.sql /docker-entrypoint-initdb.d/10-db-init.sql

