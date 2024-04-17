**********************************************exo1*********************************************
Nous utilisons verify(mockUserRepository).findUserById(userId); pour vérifier que la méthode findUserById a été appelée avec le bon argument (userId).
**********************************************exo2*********************************************
pour tester la creation d'ordre on a implémenté 3 methodes en simulant orderservice et orderdea 
testCreateOrder_Success() 
testCreateOrder_Failure()
testCreateOrder_FailureToSave()
mais j'ai pas compris comment liee les deux mxoks (a retenir )(injection ? )
**********************************************exo3***************
pour le test du 3 eme exercice on a adopté les scenario suivant
testGetProduct_Success(): récupération réussite de produit 
testGetProduct_APIFailure(): lever un exception 
testGetProduct_IncompatibleDataFormat()
