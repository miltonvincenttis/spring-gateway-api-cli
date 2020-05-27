###### Copyright (c) 2020 - Original author: Milton Lima Vincenttis

---

Provides a CLI for setting Spring Cloud Gateway.

#### Objetivo:
Oferecer meios de configurar o Spring Cloud Gateway.

#### Funcionalidades:
* Configurações Possíveis:
```
    * Route:
        *   ID
              routes:
              - id: node-ms-a
                uri: http://localhost:8081            
              routes:
              - id: node-ms-b
                uri: http://localhost:8082
              routes:
              - id: node-ms-c
                uri: http://localhost:8083          
            
        *   targetURI
              - id: node-ms-a
                uri: http://localhost:8081            
              routes:
              - id: node-ms-b
                uri: http://localhost:8082
              routes:
              - id: node-ms-c
                uri: http://localhost:8083 
            
        *   predicate  [predicateName=conditions  e.g: Cookie=Chocolate, ch.p / After=ZonedDateTime]
            TEMPORAL: (ZonedDateTime)
            AFTER
                predicates:
                - After=2017-01-20T17:42:47.789-07:00[America/Denver]
                                
            BEFORE
                predicates:
                - Before=2017-01-20T17:42:47.789-07:00[America/Denver]
                         
            BETWEEN
                predicates:
                - Between=2017-01-20T17:42:47.789-07:00[America/Denver], 2017-01-21T17:42:47.789-07:00[America/Denver]
                            
            COOKIE:
                predicates:
                - Cookie=chocolate, ch.p
                
            HEADER:
                predicates:
                - Header=X-Request-Id, \d+         
            HOST:
                predicates:
                - Host=**.somehost.org,**.anotherhost.org
            
            METHOD:
                predicates:
                - Method=GET,POST

            PATH:
                predicates:
                - Path=/red/{segment},/blue/{segment}                            
                
            QUERY:
                predicates:
                - Query=red, gree.
            
            REMOTE ADDR:
                predicates:
                - RemoteAddr=192.168.1.1/24
                
            WEIGHT:
                - id: weight_high
                uri: https://weighthigh.org
                predicates:
                - Weight=group1, 8
                
                - id: weight_low
                uri: https://weightlow.org
                predicates:
                - Weight=group1, 2      
```                                    
#### [Terminologia](https://cloud.spring.io/spring-cloud-static/spring-cloud-gateway/2.2.2.RELEASE/reference/html/index.html#glossary):

* Route: A base de construção do Gateway. 
É definido por um identificador (ID), uma URI destino, uma coleção de predicados
e uma coleção de filtros. Uma rota é correspondida se um predicado agregado é verdadeiro.

* Predicate: É uma função predicado do Java 8.  
O tipo de entrada é ServerWebExchange do Spring Framework.
Isso permite-lhe corresponder a partir de qualquer coisa do Request HTTP tal como Headers ou Parameters.


* Filter: Esses são instância de GatewayFilter do Spring Frameork que são construidos com uma factory especifica.
Aqui, se pode modificar Requests e Responses antes e depois enviar a requisição para o serviço alvo.



