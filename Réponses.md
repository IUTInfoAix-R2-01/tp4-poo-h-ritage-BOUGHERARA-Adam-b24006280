## Question 5 :
"Redéfinir une méthode" sert à réécrire la méthode de même nom de la classe mère au cas où la méthode fille est utilisée.


## Question 6 :
Les méthodes redéfinies sont les méthodes `toString` et `getPuissance`.


##  Question 7 :
L’annotation `@Override`, placée avant la définition d'une méthode, permet d'indiquer au langage que la méthode a été redéfinie.


##  Question 8 :
L'annotation `@Override` lèvera une exception si la méthode redéfinie est mal écrite.  Cela permet d'éviter les fautes de frappe lors de la définition de la fonction. On peut donc s'en dispenser mais c'est recommandé pour avoir les bonnes pratiques.


##  Question 10 :
L'appel `super.getPuissance(FrequenceCoupsDePedale)` dans cette méthode signifie que la méthode `getPuissance` de la classe mère est appelée avec l'argument `FrequenceCoupsDePedale`.
