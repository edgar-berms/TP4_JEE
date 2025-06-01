### TP 4 JEE

## Réaliser par Edgar BERMANO 4AL1

# Ce que j'ai fais
De l'exercice 1 à 6. Et l'exercice 8 dont les réponses seront donné ci-dessous.
J'ai skip l'exercice 7 par soucis de temps...

# Réponse questions exercice 8
1. Le paramètre cascade de l’annotation @ManyToOne permet de propager automatiquement certaines opérations (comme persist, merge, remove, etc.) de l'entité principale vers l'entité liée.
Cela évite d’avoir à gérer manuellement ces opérations sur les dépendances, ce qui facilite la gestion du cycle de vie des objets liés.

2. Ca s'appelle l'auto-configuration.
Cela permet à Spring Boot de configurer automatiquement les composants nécessaires à l’application, en se basant sur les dépendances présentes dans le projet et les propriétés définies (comme celles pour la base de données).
Par exemple, avec spring-boot-starter-data-jpa et les bonnes propriétés Spring Boot détecte qu’on utilise JPA et configure automatiquement une connexion à la base de données, un EntityManager, et même un DataSource, sans qu’on ait besoin de le faire manuellement.

3. Alors en Spring Boot, quand on lance la méthode main(), l’appli démarre toute seule avec un Tomcat embarqué (intégré dans le projet). Pas besoin de déployer manuellement un .war dans un serveur Tomcat externe, comme on le ferait en JEE.
Et cela rends Spring Boot plus simple et plus rapide.

4. @Repository pour RentalPropertyRepository
@Component (ou @Service) pour RentalPropertyDtoMapper

5. C'est le @Valid qui permet de d'appliquer/vérifier les contraintes de validation sur chaque champ du corp de la requête (@NotNull, @Size, etc...)

6. 
@Configuration :
Elle indique que la classe contient des méthodes de configuration Spring.
C’est ici qu’on va créer un bean de HttpClient.

@Bean :
Elle est utilisée pour déclarer un objet HttpClient comme un bean Spring.
Une fois déclaré, Spring pourra l’injecter où on en a besoin.

Injection par constructeur (automatique grâce à Spring) :
Dès que le HttpClient est un bean, Spring peut l’injecter automatiquement dans un autre composant via le constructeur.

L’annotation @Autowired peut être omise si tu n’as qu’un seul constructeur (Spring s’en charge tout seul).

7. @Value = pour lier une propriété Spring Boot à une variable Java
C’est utile pour la config dynamique sans avoir à coder en dur les valeurs.