# reactive twitter data-analysis pipeline

> TODO add wercker pipeline + icon

This is a pipeline to familiarize with the reactive platform and do do something fun.

# To build this project

```
docker-compose up -d
activator run
```

# Description

Tweets are ingested to Kafka. Spark is used to analyse them. The results are streamed via a web-socket to a play application to visualize the results. This project uses two microservices: one for the frontend & one for the backend

# Services

### during DEV

* this application runs at `http://localhost:9000`
* spark can be accessed at `http://dockerHost:4040`
* zookeeper can be accessed at `http://dockerHost:4040`
* kafka can be accessed at `http://dockerHost:4040`

### dockerized deployed

> TODO

# To deploy

Execute `activator docker:publishLocal`and run the docker use: `docker run --name sparkPlay -p 8080:9000 -p 4040:4040 sparkplay:1.0-SNAPSHOT`

> Todo provide deploy script

# Plans

* Future plans: use h2o-sparkling-water `"ai.h2o" %% "sparkling-water-core" % "1.5.6",
However Scala 2.11 not yet supported
* Setup Spark Streaming with Kafka for Twitter sentiment analysis
* productionize the whole ting to try scaling it using mesos
* create vagrant / docker + ansible scripts
* use own zookeeper / kafka versions
* wercker
* scala-style http://www.scalastyle.org/
* http://devcenter.wercker.com/quickstarts/deployment/mesosphere.html
* http://devcenter.wercker.com/docs/using-the-cli/local-development.html
* https://hub.docker.com/r/ingensi/play-framework/
