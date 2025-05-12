# Use a lightweight Node.js image to reduce the size of the container
FROM node:16-slim

# Set the working directory inside the container
WORKDIR /app

# Copy package.json and package-lock.json first for caching Docker layers
COPY package.json package-lock.json ./

# Install only production dependencies (skips devDependencies for smaller image)
RUN npm install 

# Copy all other files into the container (except those in .dockerignore)
COPY . .

# Expose port 3000 so the application can be accessed
EXPOSE 3000

# Run the application when the container starts
CMD ["node", "index.js"]


# Build a Docker image from the Dockerfile in the current directory
#docker build -t realrudrayadav/ws-server-chatapp:0.0.0.RELEASE .

# Explanation:
# docker build    -> Command to build a new Docker image.
# -t              -> Flag to assign a name and tag to the image.
# realrudrayadav/ws-server-chatapp -> The name of the image (can be used for Docker Hub or locally).
# 0.0.0.RELEASE   -> The version (tag) of the image.
# .               -> Specifies the current directory (where the Dockerfile is located).

# After running this command, the image will be created and can be used to start a container.

#docker logout

#docker login -u realrudrayadav

# Build the Docker image  
#docker build -t realrudrayadav/ws-server-chatapp:0.0.0.RELEASE .  
# - `docker build` → Builds an image from the Dockerfile  
# - `-t realrudrayadav/ws-server-chatapp:0.0.0.RELEASE` → Tags the image with a name  
# - `.` → Specifies the current directory as the build context  

# Run the container from the built image  
#docker run -p 3000:3000 realrudrayadav/ws-server-chatapp:0.0.0.RELEASE  
# - `docker run` → Starts a new container from an image  
# - `-p 3000:3000` → Maps port 3000 of the container to port 3000 on the host machine  
# - `realrudrayadav/ws-server-chatapp:0.0.0.RELEASE` → The image name and tag  

# Run the container in the background (detached mode)  
#docker run -d -p 3000:3000 realrudrayadav/ws-server-chatapp:0.0.0.RELEASE  
# - `-d` → Runs the container in detached mode (background)  

# List running containers  
#docker ps  
# - Shows all currently running containers  

# List all containers (including stopped ones)  
#docker ps -a  
# - Displays both running and stopped containers  

# Stop a running container  
#docker stop <container_id>  
# - Stops a container by its ID or name  

# Remove a container  
#docker rm <container_id>  
# - Deletes a stopped container  

# Remove an image  
#docker rmi realrudrayadav/ws-server-chatapp:0.0.0.RELEASE  
# - Deletes the Docker image from your system  

# View logs of a running container  
#docker logs <container_id>  
# - Shows the logs/output of a running container  

# Execute a command inside a running container  
#docker exec -it <container_id> sh  
# - `-it` → Interactive terminal  
# - `sh` → Opens a shell inside the running container  

# Step 3: Push the image to Docker Hub  
#docker push realrudrayadav/ws-server-chatapp:0.0.0.RELEASE  
# - Uploads the specific version to Docker Hub.  

#To pull a Docker image from Docker Hub, use the following command:
#    docker pull realrudrayadav/ws-server-chatapp:latest