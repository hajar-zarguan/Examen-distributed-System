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

![image](https://user-images.githubusercontent.com/82539023/209536368-cfd94b5c-9603-4f37-8b97-d8e6774a2359.png)



## 5. Développer le micro-service Inventory-Service

![image](https://user-images.githubusercontent.com/82539023/209543968-58a26f9b-6841-43dd-ae59-3dd046da9597.png)


## 6. Développer le micro-service Order-Service

## 7. Mettre en place les services techniques de l’architecture micro-service (Gateway, Eureka)
![image](https://user-images.githubusercontent.com/82539023/209539131-e4b212a5-b5f4-4045-9e25-2f6bb2287771.png)



## 9. Développer votre application Frontend avec Angular 

![image](https://user-images.githubusercontent.com/82539023/209541196-647b32e7-97f0-4205-91f7-182d6cea8942.png)

![image](https://user-images.githubusercontent.com/82539023/209541229-bed259b5-cfd5-4c39-9f79-d260ddac0580.png)

![image](https://user-images.githubusercontent.com/82539023/209541258-9522207e-f3e4-4e85-b496-035d4f839e5e.png)



## 10. Sécuriser votre système avec un système de d’authentification OAuth2, OIDC avec Keycloak

![image](https://user-images.githubusercontent.com/82539023/209534193-1fb35c2b-ae90-4247-a22e-a1be63518090.png)

Client 

![image](https://user-images.githubusercontent.com/82539023/209534288-003494b3-794f-45e6-97b2-7db37cd3f3c8.png)

User 

![image](https://user-images.githubusercontent.com/82539023/209534364-17e34e04-113d-4800-9ed0-1283ebb90da6.png)

![image](https://user-images.githubusercontent.com/82539023/209534442-d364cc54-bc73-46cb-9c52-020ab6297675.png)


Les dependances en spring boot de keyloack 

![image](https://user-images.githubusercontent.com/82539023/209541446-b1f9677c-6e2d-4b76-a550-126cc4bef7fe.png)

Les proprietés du microservice de la configuration de securite 

![image](https://user-images.githubusercontent.com/82539023/209541537-ace945bb-23ed-46de-b5c5-693f67ee9822.png)

[Cliquer pour voir le code complet](https://github.com/hajar-zarguan/Examen-distributed-System/tree/main/Security-service)

## 11. Écrire un script docker-compose.yml pour le déploiement de ce système distribué dans desconteneurs docker.

![image](https://user-images.githubusercontent.com/82539023/209541286-0517a10d-627d-4001-8cf6-c37f19e47474.png)



