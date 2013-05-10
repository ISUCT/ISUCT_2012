select title from Movie where director="Steven Spielberg"

select distinct year from Movie 
where mId in (select mID from rating where stars>3) order by year

select distinct title from Movie 
where mID in (select mID from Movie where mID not in (select mID from Rating))

select distinct name from Reviewer 
where rID in (select rID from Rating where ratingDate is null)

select name,title,stars,ratingDate 
from Reviewer,Rating,Movie 
where Reviewer.rID=Rating.rID and Movie.mID=Rating.mID 
order by name, title, stars

select name, title from Reviewer, Movie, Rating, Rating r2
where Rating.mID=Movie.mID and Reviewer.rID=Rating.rID 
  and Rating.rID = r2.rID and r2.mID = Movie.mID
  and Rating.stars < r2.stars and Rating.ratingDate < r2.ratingDate

select title,max(stars) from Movie, Rating 
where Movie.mID=Rating.mID 
group by Rating.mID order by title

select title, AVG(stars) as avst from Rating
join Movie on Movie.mID=Rating.mID
group by Movie.mID
order by avst DESC, title

select name from Reviewer where rID in (
select rID from (
select rID, count(mID) as cnt
from rating
group by rID
having cnt > 2) as t)