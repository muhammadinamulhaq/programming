SELECT DISTINCT(CITY) FROM STATION
WHERE left(CITY, 1) NOT IN ('a', 'e', 'i', 'o', 'u') AND
right(CITY, 1) NOT IN ('a', 'e', 'i', 'o', 'u');