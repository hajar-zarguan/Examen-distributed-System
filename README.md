# Examen-distributed-System
Examen Systèmes Distribués CQRS &amp;&amp; Event Sourcing


## 1. Établir une architecture technique du projet

![Archi (2)](https://user-images.githubusercontent.com/82539023/209521271-fc65714a-bef8-4408-a877-b2509056fa2a.png)

Voici larchitecture de la sécurité que je vais adopter 

![Keylock](https://user-images.githubusercontent.com/82539023/209521786-b60b0f6b-f9f2-48bc-aac8-b2aa3fb30da8.png)

## 2. Établir un diagramme de classe global du projet
  - En jaune les entites de microservice : Customer-Service
  - En vert les entites de microservice : Inventory-Service 
  - En mauve les entites de microservice : Order-Service

![image](https://user-images.githubusercontent.com/82539023/209524185-b6236f30-0178-44db-adcb-eae82899c57d.png)


## 3. Déployer le serveur AXON Server
Lancement du serveur 

![image](https://user-images.githubusercontent.com/82539023/209525393-d14a9b93-3878-45ac-a2b0-06df682ecd49.png)

Au demarrage nous avons pas encore realiser les microservices 

![image](https://user-images.githubusercontent.com/82539023/209525477-0661ebc1-42e4-4f8e-9bf4-cb058247a397.png)


## 4. Développer le micro-service Customer-Service

Voici les propreites deu microservice 1 :  Customer-Service

Larchitecture de commandSide

![CommandSide](https://user-images.githubusercontent.com/82539023/209531944-db7b02ab-fb7c-4fd5-8833-bb49096a3c6d.png)

![image](https://user-images.githubusercontent.com/82539023/209531499-39f380db-8024-43f9-8fa8-6d31f7170e2c.png)

Voici Command Side 

![image](https://user-images.githubusercontent.com/82539023/209531572-5873cb82-3d06-4ed3-bd6b-9594941819ac.png)

Voici Query Side 

![image](https://user-images.githubusercontent.com/82539023/209531623-589f84d9-c9ad-4a38-b2e9-d1d351c00e95.png)

Voici la base de donnnes generee 

![image](https://user-images.githubusercontent.com/82539023/209532513-65c3f7f0-6c73-41ed-9b2b-b7335419a883.png)




## 5. Développer le micro-service Inventory-Service

## 6. Développer le micro-service Order-Service

## 7. Mettre en place les services techniques de l’architecture micro-service (Gateway, Eureka)
## 9. Développer votre application Frontend avec Angular 
## 10. Sécuriser votre système avec un système de d’authentification OAuth2, OIDC avec Keycloak

![image](https://user-images.githubusercontent.com/82539023/209534193-1fb35c2b-ae90-4247-a22e-a1be63518090.png)

Client 

![image](https://user-images.githubusercontent.com/82539023/209534288-003494b3-794f-45e6-97b2-7db37cd3f3c8.png)

User 

![image](https://user-images.githubusercontent.com/82539023/209534364-17e34e04-113d-4800-9ed0-1283ebb90da6.png)

![image](https://user-images.githubusercontent.com/82539023/209534442-d364cc54-bc73-46cb-9c52-020ab6297675.png)




## 11. Écrire un script docker-compose.yml pour le déploiement de ce système distribué dans desconteneurs docker.
