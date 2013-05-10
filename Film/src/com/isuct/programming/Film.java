// Найдите названия всех фильмов, спродюссированных Стивеном Спилбергом
select title from Movie where director="Steven Spielberg"

// Найдите года, в которые фильмы получили рейтинг 4 или 5 и отсортируйте их в порядке возрастания
select distinct year from Movie 
where mId in (select mID from rating where stars>3) order by year

// Найдите названия всех фильмов, у которых нет рейтинга
select distinct title from Movie 
where mID in (select mID from Movie where mID not in (select mID from Rating))

// Некоторые ревьюверы (рецензенты – reviewers) не указали дату простановки рейтинга. Найдите имена всех рецензентов, с указанным значением Null в поле дата
select distinct name from Reviewer 
where rID in (select rID from Rating where ratingDate is null)

// Напишите запрос, который вернет рейтинги всех фильмов в более читаемом формате: reviewer name, movie title, stars, and ratingDate. Также отсортируйте данные сперва по имени рецензента затем по названию, и по числу строк.

select name,title,stars,ratingDate 
from Reviewer,Rating,Movie 
where Reviewer.rID=Rating.rID and Movie.mID=Rating.mID 
order by name, title, stars

// Для всех случаев, когда же рецензент оценил тот же фильм дважды, и дал ему более высокий рейтинг во второй раз, возвращение имени рецензента и название фильма.

select name, title from Reviewer, Movie, Rating, Rating r2
where Rating.mID=Movie.mID and Reviewer.rID=Rating.rID 
and Rating.rID = r2.rID and r2.mID = Movie.mID
and Rating.stars < r2.stars and Rating.ratingDate < r2.ratingDate

// Для каждого фильма, который имеет хотя бы один рейтинг, найти наибольшее количество звезд, которые фильм получил. Возвращает заголовок фильма и количества звезд. Сортировать по название фильма.

select title,max(stars) from Movie, Rating 
where Movie.mID=Rating.mID 
group by Rating.mID order by title

// Список названий фильмов и средние оценки, от самых рейтинговых на низкий рейтинг. Если два или более фильмов имеют одинаковый средний рейтинг, перечислить их в алфавитном порядке.

select title, AVG(stars) as avst from Rating
join Movie on Movie.mID=Rating.mID
group by Movie.mID
order by avst DESC, title

// Найти имена всех рецензентов, которые вносят три или более рейтингов. (В качестве дополнительной проблемой, постарайтесь написать запрос, не имея или без COUNT.)

select name from Reviewer where rID in (
select rID from (
select rID, count(mID) as cnt
from rating
group by rID
having cnt > 2) as t)