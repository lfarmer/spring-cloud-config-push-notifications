# Spring Cloud Config Push Notifications

Demo project to demonstrate refresh of spring config using push notifications

## Prerequisites

- Java
- Maven
- Docker
- [HTTPie](https://github.com/jakubroztocil/httpie#2installation)
- [ngrok](https://dashboard.ngrok.com/get-started)

## Getting started

1. `mvn clean install -P docker`
1. `docker-compose up`
1. `http localhost:8080/config`

Should return `local` as server wasn't ready when client tried to access the server.

1. `docker-compose restart client`
1. `curl localhost:8080/config`

Should return the value specified in [github props](https://github.com/lfarmer/config-service-properties/blob/master/client.properties) 

### Testing push notifications

1. `http --form POST :8888/monitor path=client`
1. Check the logs for the following:
```text
Received remote refresh request. Keys refreshed ...
```

## Run yourself

In order to get the above working for your own git repository then you'll need to complete the following steps.

1. Clone the above [repo](https://github.com/lfarmer/config-service-properties/blob/master/client.properties) into your own public repository
1. Ensure steps followed in Getting started above
1. Ensure ngrok installed and running
1. `./ngrok http 8888`
1. Take the Forwarding address from above and setup a webhook within your git repo i.e. `http://8c04a74a.ngrok.io/monitor`
1. Make a change to to client properties, commit and push to master
1. `http localhost:8080/config`

Your changes should be displayed without any restart 




