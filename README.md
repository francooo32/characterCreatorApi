# characterCreatorApi
An api to CRUD information for a character that you can create from the web

Open for free use
Instruction --> Just replace variables with the ones you want, example, instead of using object GameCharacter you want to create a Users api, just replace the entity and variables for the ones you want on User like userName, password, name, surname, email, telephone, etc, then change the "GameCharacter" methods name of the dao and controller classes and create your own DB with the tables and data you want to manipulate (remember to change the @table anotation so it point towards yours) and you should be ready to go.
If you want, you can change the java version, however, this spring boot context dont allow to use older version of it, so I recomend using 16 and above.
