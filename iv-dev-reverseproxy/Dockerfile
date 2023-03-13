# Use an official Nginx runtime as a parent image
FROM nginx:latest

# Set the working directory to /etc/nginx
WORKDIR /etc/nginx

# Remove the default configuration file
RUN rm nginx.conf

# Copy the custom configuration file from the host to the container
COPY ./config/nginx.conf /etc/nginx/

# Expose ports 80 and 443 for incoming traffic
EXPOSE 80
EXPOSE 443

# Start Nginx in the foreground when the container is run
CMD ["nginx", "-g", "daemon off;"]
