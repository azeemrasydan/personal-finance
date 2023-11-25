#!/bin/bash

# Run Maven package
mvn package

# Check if Maven build was successful
if [ $? -eq 0 ]; then
    # Run Java application
    java -cp target/play-1.jar azeem.play.App
else
    echo "Maven build failed. Exiting script."
fi
