
    Start a Docker container with Firefox

docker run -d -p 4444:4444 -p 7900:7900 --shm-size="2g" selenium/standalone-firefox:latest

    Point your WebDriver tests to http://localhost:4444

    That's it!

    (Optional) To see what is happening inside the container, head to http://localhost:7900 (password is secret).

More details about visualising the container activity, check the Debugging section.

☝️ When executing docker run for an image that contains a browser please use the flag --shm-size=2g to use the host's shared memory.

☝️ Always use a Docker image with a full tag to pin a specific browser and Grid version. See Tagging Conventions for details.