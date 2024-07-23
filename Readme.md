# Things to check

- [ ]  Get request with body does not work(some weird stuff),maybe it is becoming a post request(my assumption)

- [ ]  Auto Generated ID is not working when there is already entries in the database

- [ ]  Read more about how hibernate creates tables, As far as it is seen now, hibernate is converting everything to all caps.

application.properties
> spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl


- [ ] read more about this naming thing, this was used to prevent the naming mismatch convention