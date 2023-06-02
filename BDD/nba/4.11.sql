-- 1. Equipo y ciudad de los jugadores españoles de la NBA.
SELECT jugadores.Nombre, jugadores.Nombre_equipo, equipos.Ciudad
FROM jugadores, equipos
WHERE jugadores.Nombre_equipo = equipos.Nombre
AND jugadores.Procedencia = 'Spain';

-- 3. Puntos por partido de 'Pau Gasol' en toda su carrera.
SELECT Puntos_por_partido
FROM estadisticas, jugadores
WHERE estadisticas.jugador = jugadores.codigo
AND jugadores.Nombre = 'Pau Gasol';

-- 4. Equipos que hay en la conferencia oeste ('west).
SELECT equipos.Nombre
FROM equipos
WHERE equipos.Conferencia = 'West';

-- 5. Jugadores de Arizona que pesen más de 100 kilos y midan más de 1.82m (6ft)
SELECT jugadores.Nombre
FROM jugadores
WHERE jugadores.Procedencia = 'Arizona'
AND jugadores.Altura > '6'
AND jugadores.Peso > 220;

-- 6. Puntos por partido de los jugadores de los 'cavaliers'.
SELECT estadisticas.Puntos_por_partido, jugadores.Nombre
FROM estadisticas, jugadores
WHERE jugadores.Nombre_equipo = 'cavaliers'
AND estadisticas.jugador = jugadores.codigo;

-- 7. Jugadores cuya tercera letra de su nombre sea la v.
SELECT jugadores.nombre 
FROM jugadores
WHERE jugadores.nombre like '%v%';

-- 8. Número de jugadores que tiene cada equipo de la conferencia oeste 'West'.
SELECT equipos.Nombre, count(*) as num_Jugadores
FROM jugadores, equipos
WHERE jugadores.Nombre_equipo = equipos.Nombre
AND equipos.Conferencia = 'West'
GROUP BY equipos.Nombre;

-- 9. Numero de jugadores Argentinos en la NBA.
SELECT count(*) as num_jugadores
FROM jugadores
WHERE jugadores.Procedencia = 'Argentina';

--10. Máxima media de puntos de 'Lebron James' en su carrera.
SELECT MAX(media_puntos)
FROM (SELECT AVG(Puntos_por_partido) as media_puntos
    FROM estadisticas, jugadores
    WHERE estadisticas.jugador = jugadores.codigo
    AND jugadores.Nombre = 'Lebron James'
    GROUP BY estadisticas.temporada) as maximo;

--11. Asistencias por partido de 'Jose Calderon' en la temporada '07/08'.
SELECT Asistencias_por_partido
FROM estadisticas, jugadores
WHERE estadisticas.jugador = jugadores.codigo
AND jugadores.nombre = 'Jose Calderon'
AND estadisticas.temporada = '07/08';

--12. Puntos por partido de 'Lebron James' en su carrera.
SELECT Puntos_por_partido
FROM estadisticas, jugadores
WHERE estadisticas.jugador = jugadores.codigo
AND jugadores.nombre = 'LeBron James';

--13. Número de jugadores que tiene cada equipo de la conferencia este 'East'.
SELECT equipos.Nombre, count(*) as num_Jugadores
FROM jugadores, equipos
WHERE jugadores.Nombre_equipo = equipos.Nombre
AND equipos.Conferencia = 'East'
GROUP BY equipos.Nombre;

--14. Tapones por partido de los jugadores de los 'Blazers'.
SELECT jugadores.Nombre, count(*) as Tapones_partido
FROM estadisticas, jugadores, equipos
WHERE estadisticas.jugador = jugadores.codigo
AND jugadores.Nombre_equipo = 'Trail Blazers'
GROUP BY jugadores.Nombre;

--15. Media de rebotes de los jugadores de la conferencia Este 'East'.
SELECT AVG(Rebotes_por_partido) 
FROM estadisticas, jugadores, equipos
WHERE estadisticas.jugador = jugadores.codigo
AND jugadores.Nombre_equipo = equipos.Nombre
And equipos.conferencia = 'East';

--16. Rebotes por partido de los jugadores de los equipos de los Angeles.
SELECT jugadores.nombre, estadisticas.Rebotes_por_partido
FROM jugadores, estadisticas, equipos
WHERE estadisticas.jugador = jugadores.codigo
AND jugadores.Nombre_equipo = equipos.nombre
AND equipos.Ciudad = 'Los Angeles';

--17. Número de jugadores que tiene cada equipo de la división NorthWest.
SELECT equipos.nombre, count(jugadores.nombre) as num_Jugadores
FROM jugadores, equipos
WHERE jugadores.Nombre_equipo = equipos.nombre
AND equipos.division = 'NorthWest'
GROUP BY equipos.nombre;

--18. Número de jugadores de España y francia en la NBA.
SELECT count(*) as num_jugadores
FROM jugadores
WHERE jugadores.Procedencia = 'Spain' or jugadores.Procedencia = 'France';

--19. Numero de pivots 'C' que tiene cada equipo.
SELECT jugadores.Nombre_equipo , count(*) as num_jugadores
FROM jugadores, equipos
WHERE jugadores.Nombre_equipo = equipos.nombre
And jugadores.Posicion like '%C%'
GROUP BY equipos.nombre;

--20. ¿Cuanto mide el pivot más alto de la nba
SELECT max(jugadores.Altura)
FROM jugadores
WHERE jugadores.Posicion = 'C';

--21.¿Cuanto pesa el pívot más alto de la nba.
SELECT Nombre, Peso as Peso_Libras, (Peso*0.453592) as Peso_kilos
FROM jugadores
WHERE Altura=(SELECT MAX(Altura) FROM jugadores WHERE Posicion='C');

--22. Numero de jugadores que empiezan por 'Y'.
SELECT count(*) as numero_jugadores
FROM jugadores
WHERE jugadores.Nombre like 'y%';

--23. Jugadores que no metieron ningun punto en alguna temporada.
SELECT jugadores.nombre, estadisticas.puntos_por_partido, estadisticas.temporada
FROM jugadores, estadisticas
WHERE estadisticas.jugador = jugadores.codigo
AND estadisticas.Puntos_por_partido = 0;

--24. Numero total de jugadores de cada division.
SELECT equipos.division, count(jugadores.nombre) as num_Jugadores
FROM jugadores, equipos
WHERE jugadores.Nombre_equipo = equipos.nombre
GROUP BY equipos.division;

--25. Peso medio enn kilos y en libras de los jugadores de los raptors.
select AVG(jugadores.peso/2.205), AVG(jugadores.peso)
FROM jugadores
where jugadores.nombre_equipo = 'Raptors';

--26. Mostrar un listado de jugadores con el formato Nombre(Equipo en una sola columna).
SELECT CONCAT(jugadores.nombre,", ",jugadores.nombre_equipo)
FROM jugadores;


--27. Puntuación más baja de un partido en la NBA.
SELECT MIN(estadisticas.puntos_por_partido)
FROM estadisticas;

--28. Primeros 10 jugadores por orden alfabético
SELECT nombre 
FROM jugadores ORDER BY Nombre ASC LIMIT 10;

--29. Temporada con más puntos por partido de 'Kobe Bryant'.
Select estadisticas.temporada, MAX(estadisticas.puntos_por_partido)
from estadisticas,jugadores
where estadisticas.jugador = jugadores.codigo
AND jugadores.nombre = 'Kobe Bryant';

--30. Numero de bases 'G' que tiene cada  equipo de la conferencia este 'East'.
SELECT jugadores.Nombre_equipo , count(*) as num_jugadores
FROM jugadores, equipos
WHERE jugadores.Nombre_equipo = equipos.nombre
And jugadores.Posicion like '%G%'
AND equipos.conferencia = 'East'
GROUP BY equipos.nombre;

--31. Numero de equipos que tiene cada conferencia.
SELECT equipos.conferencia , count(*) as num_equipos
FROM equipos
GROUP BY equipos.conferencia;

--32. Nombre de las divisiones de la conferencia 'East'.
SELECT equipos.division
FROM equipos
where equipos.conferencia = 'East'
group by equipos.division;

--33. Máximo reboteador de los 'Suns'.
select jugadores.nombre, max(estadisticas.rebotes_por_partido)
from estadisticas, jugadores
where estadisticas.jugador = jugadores.codigo
and jugadores.Nombre_equipo = 'Suns';

--34. Máximo anotador de toda la base de datos en una temporada.
select estadisticas.temporada, jugadores.nombre, max(estadisticas.Puntos_por_partido)
from estadisticas, jugadores
where estadisticas.jugador = jugadores.codigo
group by estadisticas.temporada;

--35. Sacar cuántas letras tiene el nombre de cada  jugador de los grizzlies.
select jugadores.nombre, LENGTH(jugadores.nombre) as num_letras
from jugadores
where jugadores.nombre_equipo = 'Grizzlies';

--36. ¿Cuantas letras tiene el equipo con nombre más largo de la nba?
select jugadores.nombre, max(LENGTH(jugadores.nombre)) as num_letras
from jugadores;
