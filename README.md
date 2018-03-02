# springboot2sample
SpringBoot 2 samples

if you can't run springapplication, maybe maven jars downloaded in failure status.
you can 
```
mvn spring-boot:run -e 
```
to check which jar is crashed, you can remove it directly, or to purge all now
```
mvn dependency:purge-local-repository
```
to re-download the jars into your local repository.