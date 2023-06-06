--3 Nombre, apellidos y Email de empleados a cargo de Juan Martinez
SELECT CONCAT(nombre," ",Apellido1," ",Apellido2) as "nombre y apellidos",Email 
FROM empleados
WHERE CodigoJefe = (
    SELECT CodigoEmpleado
    FROM empleados
    WHERE nombre = "Alberto"
    AND Apellido1 = "Soria"
);
--4 Nombre, Apellidos y cargo de aquellos empleados que no tienen ningun cliente a su cargo
SELECT concat(empleados.nombre," ",empleados.apellido1," ",empleados.Apellido2) as "nombre", empleados.puesto as "cargo"
FROM empleados
WHERE empleados.CodigoEmpleado NOT IN (
    SELECT CodigoEmpleadoRepVentas
    FROM clientes
);
--5. numero de clientes de cada pais
SELECT COUNT(NombreCliente), pais
FROM Clientes
GROUP BY pais;
--6. Cuantos clientes tienen las ciudades que empiezan por G
SELECT COUNT(NombreCliente), Ciudad
FROM Clientes
WHERE Ciudad LIKE "G%"
GROUP BY Ciudad;
--7. Nombre de los empleados junto al nombre de sus jefes
SELECT CONCAT(E.nombre," ",E.apellido1," ",E.Apellido2) as empleado, CONCAT(J.nombre," ",J.apellido1," ",J.Apellido2) as jefe
FROM empleados E, empleados J
WHERE E.CodigoJefe = J.CodigoEmpleado;

--8. Nombre de los clientes a los que no se les ha entregado a tiempo algún pedido(natural join)
SELECT DISTINCT nombrecliente
FROM Clientes NATURAL JOIN Pedidos
WHERE FechaEntrega > FechaEsperada;


SELECT nombrecliente
FROM clientes
WHERE codigocliente IN(
    SELECT codigoCliente
     FROM Pedidos
    WHERE FechaEntrega > FechaEsperada
)
ORDER BY nombrecliente;


--9 Listado con los nombres de los clientes y el total pagado por cada uno de ellos
SELECT clientes.NombreCliente, SUM(pagos.Cantidad)
FROM clientes, pagos
WHERE clientes.CodigoCliente = pagos.CodigoCliente
GROUP BY clientes.NombreCliente;