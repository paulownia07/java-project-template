FROM mcr.microsoft.com/devcontainers/base:ubuntu26.04

RUN apt-get update \
    && apt-get install -y --no-install-recommends openjdk-25-jdk \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*

RUN curl -fsSL "https://downloads.apache.org/maven/maven-3/3.10.0/binaries/apache-maven-3.10.0-bin.tar.gz" -o /tmp/maven.tar.gz \
    && echo "908b1501bfb420bf7c8affb855534a9c407fd6099367bfb9f2f2dcb8e9799102bffb84518cde74c679bd76870247c6528683abdd620581bffa90f95d92d175aa  /tmp/maven.tar.gz" | sha512sum -c - \
    && tar -xzf /tmp/maven.tar.gz -C /opt \
    && ln -s /opt/apache-maven-3.10.0/bin/mvn /usr/local/bin/mvn \
    && rm /tmp/maven.tar.gz

USER vscode

WORKDIR /workspaces