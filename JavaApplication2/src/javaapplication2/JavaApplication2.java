Задание 1

\project_{pizza} (
(\select_{gender = 'female' and age > '20'} Person) \join Eats
)


Задание 2

\project_{name} (
(\select_{gender = 'female'} Person)
\join
Eats
\join
(\select_{pizzeria = 'Straw Hat'} Serves)
);


Задание 3

\project_{pizzeria} (
(\select_{name = 'Amy' or name = 'Fay'} Person)
\join
Eats
\join
(\select_{price<'10'} Serves)
);


Задание 4

\project_{pizzeria} (
\project_{pizza}(\select_{name = 'Amy'} Eats) \intersect \project_{pizza}(\select_{name = 'Fay'} Eats)
\join
(\select_{price<'10'} Serves)
);


Задание 5

\project_{name}(
(\select_{pizzeria = 'Dominos'} Serves) \join Eats
)
\diff
\project_{name} (
\select_{pizzeria = 'Dominos'} Frequents
);


Задание 6

(\project_{pizza}(Serves) \diff \project_{pizza}(\select_{price>'10'} Serves))
\union
(\project_{pizza}(Eats) \diff \project_{pizza}(\select_{age>='24'} Person \join Eats));


Задание 7

\rename_{age2}(\project_{age}(\project_{name}(\select_{pizza = 'mushroom'}Eats) \join Person))
\diff
\project_{age2}(
\rename_{age2}(\project_{age}(\project_{name}(\select_{pizza = 'mushroom'}Eats) \join Person)) 
\join_{age2<age1} 
\rename_{age1}(\project_{age}(\project_{name}(\select_{pizza = 'mushroom'}Eats) \join Person))
);

Задание 8

\project_{pizzeria} Serves
\diff
\project_{pizzeria} (
Serves
\join
((\project_{pizza} Serves)
\diff
(\project_{pizza}((\select_{age>'30'} Person) \join Eats)))
);

Задание 9

(\project_{pizzeria}Serves) 
\diff 
(\project_{pizzeria}((\project_{pizzeria}Serves) 
\cross 
(\project_{pizza}(\select_{age>'30'}Person \join Eats)) 
\diff 
(\project_{pizzeria,pizza}
((\select_{age>'30'}Person \join Eats) \join Serves))));