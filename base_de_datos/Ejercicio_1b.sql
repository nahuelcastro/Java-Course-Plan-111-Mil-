SELECT F.film_id,F.title,F.language_id,
	   F_C.category_id,F_C.film_id,
	   C.category_id,C.name,
       L.language_id,L.name
 FROM sakila.category as C 
 Inner Join sakila.film_category as F_C on C.category_id=F_C.category_id
 Inner Join sakila.film as F on F.film_id=F_C.film_id
 Inner Join sakila.language as L on L.language_id=F.language_id
where C.name='action' OR C.name='comedy' OR C.name='drama'
;