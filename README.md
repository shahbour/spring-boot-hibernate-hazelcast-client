# spring-boot-hibernate-hazelcast-client

Project that utilize spring boot with hazelcast client as hibernate level2 cache 

To Test the project :

- curl -v http://localhost:8080/persons/1  
- curl  -d '{"id":"3", "name":"ali3"}' -H "Content-Type: application/json" -X POST http://localhost:8080/persons
- curl -v http://localhost:8080/persons/2  