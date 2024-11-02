
/*
Реализовать БД, которая будет хранить информацию о маршрутах автобусов.

1. Задан список маршрутов, у каждого маршрута уникальный номер и время работы маршрута (время задано двумя числами от 0 до 24)
2. На одном маршруте может работать несколько автобусов. У каждого автобуса есть модель и гос номер. Автобусы в разные дни могут работать на разных маршрутах.
3. Маршрут состоит из набора остановок. Каждая остановка имеет название и адрес. Одна остановка может принадлежать разным маршрутам.
*/

WITH point_count AS (
  SELECT route_id, COUNT(*) AS count_points
  FROM point_route
  GROUP BY route_id
)
SELECT *
FROM route r
JOIN point_count pc ON r.id = pc.route_id
WHERE pc.count_points = (SELECT MAX(count_points) FROM point_count);


CREATE TABLE bus (
	id bigint,
  	model text,
  	licence text
);

CREATE TABLE bus_route (
	bus_id bigint,
  	rout_id bigint,
  	date timestamp
);

CREATE TABLE route (
	id bigint,
  	number text,
  	begin_time int,
  	end_time int,
  	note text
);

CREATE TABLE point_route (
	point_id bigint,
  	route_id bigint,
  	order_number int
);

CREATE TABLE point (
	id bigint,
  	name text,
  	address text
);