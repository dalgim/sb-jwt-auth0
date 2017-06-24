# SpringBoot & JWT Auth0 Authenitcation

This project demonstrates example of jwt auth0 authentication.

For more info check [Link] https://auth0.com/blog/securing-spring-boot-with-jwts/

# How to use

#### Run application 
``mvn spring-boot:run``
#### Open any rest api editor and invoke HTTP POST on localhost:8080/login with below body
``
{"login":"admin","password":"password"}
``

Server returns success and signed authorization header.

``
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTQ5OTIwNzMwM30.iYVqa5zV8gBQbQaK1j9nboxagF9wWWyy1YoB7D-QVHeZBxLuSbuc3AAjZ1vJ8OC7XlwfbDFUGWb_uh10kRnfAQ
``

#### Use this header in next request to get all articles. Invoke HTTP GET on localhost:8080/api/articles/ with above header. The response should be like this:
``
[{"content":"Example content","name":"First article"},{"content":"Example content","name":"Second article"}]
``